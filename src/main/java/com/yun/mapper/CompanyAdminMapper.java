package com.yun.mapper;

import com.yun.entity.*;
import com.yun.entity.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface CompanyAdminMapper {

    int countByExample(CompanyAdminExample example);


    int deleteByExample(CompanyAdminExample example);


    int deleteByPrimaryKey(Integer companyAdminId);


    int insert(CompanyAdmin record);


    int insertSelective(CompanyAdmin record);


    List<CompanyAdmin> selectByExample(CompanyAdminExample example);


    CompanyAdmin selectByPrimaryKey(Integer companyAdminId);


    int updateByExampleSelective(@Param("record") CompanyAdmin record, @Param("example") CompanyAdminExample example);


    int updateByExample(@Param("record") CompanyAdmin record, @Param("example") CompanyAdminExample example);


    int updateByPrimaryKeySelective(CompanyAdmin record);


    int updateByPrimaryKey(CompanyAdmin record);
}