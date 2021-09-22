package com.yun.admin.mapper;

import com.yun.admin.entity.WorkExperience;
import com.yun.admin.entity.vo.WorkExperienceExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WorkExperienceMapper {

    int countByExample(WorkExperienceExample example);


    int deleteByExample(WorkExperienceExample example);


    int deleteByPrimaryKey(Integer workExperiId);


    int insert(WorkExperience record);


    int insertSelective(WorkExperience record);


    List<WorkExperience> selectByExample(WorkExperienceExample example);


    WorkExperience selectByPrimaryKey(Integer workExperiId);


    int updateByExampleSelective(@Param("record") WorkExperience record, @Param("example") WorkExperienceExample example);


    int updateByExample(@Param("record") WorkExperience record, @Param("example") WorkExperienceExample example);


    int updateByPrimaryKeySelective(WorkExperience record);


    int updateByPrimaryKey(WorkExperience record);
}