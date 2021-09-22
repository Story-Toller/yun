package com.yun.admin.service;

import com.yun.admin.entity.Customer;
import com.yun.admin.utils.ServerResponse;


public interface CustomerService {
    ServerResponse getByUsernameAndPwd(String username, String password, Integer userType);

    ServerResponse getByTelno(Long custTelno);

    ServerResponse add(Customer customer);

    ServerResponse forget(String phone, String password);
}
