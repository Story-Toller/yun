package com.yun.admin.service.impl;

import com.yun.admin.entity.Customer;
import com.yun.admin.entity.vo.CustomerExample;
import com.yun.admin.mapper.CustomerMapper;
import com.yun.admin.service.CustomerService;
import com.yun.admin.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public ServerResponse getByUsernameAndPwd(String username, String password, Integer userType) {
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        if (userType == 0)
            criteria.andCustTelnoEqualTo(Long.valueOf(username));
        else
            criteria.andCustEmailEqualTo(username);
        criteria.andCustPasswordEqualTo(password);
        List<Customer> customerList = customerMapper.selectByExample(example);
        if (customerList != null) {
            if (customerList.size() == 1)
                return ServerResponse.getSuccess(customerList.get(0));
            else if (customerList.size() > 1)
                return ServerResponse.getFailed("用户异常，请联系管理员");
        }
        return ServerResponse.getFailed("用户名/密码错误，请重试");
    }

    @Override
    public ServerResponse getByTelno(Long custTelno) {
        CustomerExample example = new CustomerExample();
        example.createCriteria().andCustTelnoEqualTo(custTelno).andStatusEqualTo(0);
        List<Customer> customerList = customerMapper.selectByExample(example);
        if (customerList != null && customerList.size() > 0) {//找到用户了
            return ServerResponse.getSuccess(customerList.get(0)); // 1,"查询数据成功",customer
        } else // 用户不存在
            return ServerResponse.getFailed("用户不存在"); // 0,"查询数据失败","用户不存在"
    }

    @Override
    public ServerResponse add(Customer customer) {
        customer.setCustRegistTime(new Date());
        customer.setStatus(0);
        int rows = customerMapper.insert(customer);
        if (rows > 0)
            return ServerResponse.addSuccess();
        return ServerResponse.addFailed();
    }

    @Override
    public ServerResponse forget(String phone, String password) {
        CustomerExample example = new CustomerExample();
        return null;
    }
}
