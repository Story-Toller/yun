package com.yun.admin.mapper;

import com.yun.admin.entity.JobCollection;
import com.yun.admin.entity.vo.JobCollectionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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