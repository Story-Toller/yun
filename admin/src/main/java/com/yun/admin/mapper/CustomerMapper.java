package com.yun.admin.mapper;


import com.yun.admin.entity.Customer;
import com.yun.admin.entity.vo.CustomerExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface CustomerMapper {

    int countByExample(CustomerExample example);


    int deleteByExample(CustomerExample example);


    int deleteByPrimaryKey(Integer custId);


    int insert(Customer record);


    int insertSelective(Customer record);


    List<Customer> selectByExample(CustomerExample example);


    Customer selectByPrimaryKey(Integer custId);


    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);


    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);


    int updateByPrimaryKeySelective(Customer record);


    int updateByPrimaryKey(Customer record);

    int updateByPhone(Customer record);
}