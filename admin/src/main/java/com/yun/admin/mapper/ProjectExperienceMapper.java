package com.yun.admin.mapper;

import com.yun.admin.entity.ProjectExperience;
import com.yun.admin.entity.vo.ProjectExperienceExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProjectExperienceMapper {

    int countByExample(ProjectExperienceExample example);


    int deleteByExample(ProjectExperienceExample example);


    int deleteByPrimaryKey(Integer projectExperiId);


    int insert(ProjectExperience record);


    int insertSelective(ProjectExperience record);


    List<ProjectExperience> selectByExample(ProjectExperienceExample example);


    ProjectExperience selectByPrimaryKey(Integer projectExperiId);


    int updateByExampleSelective(@Param("record") ProjectExperience record, @Param("example") ProjectExperienceExample example);


    int updateByExample(@Param("record") ProjectExperience record, @Param("example") ProjectExperienceExample example);


    int updateByPrimaryKeySelective(ProjectExperience record);


    int updateByPrimaryKey(ProjectExperience record);
}