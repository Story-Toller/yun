package com.yun.admin.mapper;

import com.yun.admin.entity.Skill;
import com.yun.admin.entity.vo.SkillExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SkillMapper {

    int countByExample(SkillExample example);


    int deleteByExample(SkillExample example);


    int deleteByPrimaryKey(Integer skillId);


    int insert(Skill record);


    int insertSelective(Skill record);


    List<Skill> selectByExample(SkillExample example);


    Skill selectByPrimaryKey(Integer skillId);


    int updateByExampleSelective(@Param("record") Skill record, @Param("example") SkillExample example);


    int updateByExample(@Param("record") Skill record, @Param("example") SkillExample example);


    int updateByPrimaryKeySelective(Skill record);


    int updateByPrimaryKey(Skill record);
}