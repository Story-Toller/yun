package com.yun.mapper;


import com.yun.entity.Company;
import com.yun.entity.vo.CompanyExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
public interface CompanyMapper {

    int countByExample(CompanyExample example);


    int deleteByExample(CompanyExample example);


    int deleteByPrimaryKey(Integer companyId);


    int insert(Company record);


    int insertSelective(Company record);


    List<Company> selectByExample(CompanyExample example);


    Company selectByPrimaryKey(Integer companyId);


    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);


    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);


    int updateByPrimaryKeySelective(Company record);


    int updateByPrimaryKey(Company record);
}