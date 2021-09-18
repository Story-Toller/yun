package com.yun.mapper;

import com.yun.entity.*;
import com.yun.entity.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface JobCollectionMapper {

    int countByExample(JobCollectionExample example);


    int deleteByExample(JobCollectionExample example);


    int deleteByPrimaryKey(Integer jobCollectionId);


    int insert(JobCollection record);


    int insertSelective(JobCollection record);


    List<JobCollection> selectByExample(JobCollectionExample example);


    JobCollection selectByPrimaryKey(Integer jobCollectionId);


    int updateByExampleSelective(@Param("record") JobCollection record, @Param("example") JobCollectionExample example);


    int updateByExample(@Param("record") JobCollection record, @Param("example") JobCollectionExample example);


    int updateByPrimaryKeySelective(JobCollection record);


    int updateByPrimaryKey(JobCollection record);
}