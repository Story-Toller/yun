package com.yun.mapper;

import com.yun.entity.*;
import com.yun.entity.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface CompanyReceiveResumeRecordMapper {

    int countByExample(CompanyReceiveResumeRecordExample example);


    int deleteByExample(CompanyReceiveResumeRecordExample example);


    int deleteByPrimaryKey(Integer companyReceiveResumeRecordId);


    int insert(CompanyReceiveResumeRecord record);


    int insertSelective(CompanyReceiveResumeRecord record);


    List<CompanyReceiveResumeRecord> selectByExample(CompanyReceiveResumeRecordExample example);


    CompanyReceiveResumeRecord selectByPrimaryKey(Integer companyReceiveResumeRecordId);


    int updateByExampleSelective(@Param("record") CompanyReceiveResumeRecord record, @Param("example") CompanyReceiveResumeRecordExample example);


    int updateByExample(@Param("record") CompanyReceiveResumeRecord record, @Param("example") CompanyReceiveResumeRecordExample example);


    int updateByPrimaryKeySelective(CompanyReceiveResumeRecord record);


    int updateByPrimaryKey(CompanyReceiveResumeRecord record);
}