package com.yun.admin.mapper;

import com.yun.admin.entity.Job;
import com.yun.admin.entity.vo.JobExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface JobMapper {

    int countByExample(JobExample example);


    int deleteByExample(JobExample example);


    int deleteByPrimaryKey(Integer jobId);


    int insert(Job record);


    int insertSelective(Job record);


    List<Job> selectByExample(JobExample example);


    Job selectByPrimaryKey(Integer jobId);


    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);


    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);


    int updateByPrimaryKeySelective(Job record);


    int updateByPrimaryKey(Job record);


    List<Job> selectAllJobBySearch(@Param("publishDay") Integer publishDay,
                                   @Param("minSalary") BigDecimal minSalary,
                                   @Param("maxSalary") BigDecimal maxSalary,
//                                   @Param("companyType") BigDecimal companyType,
                                   @Param("workYear") String workYear,
                                   @Param("keywords") String keywords,
                                   @Param("eduRequest") String eduRequest);
}