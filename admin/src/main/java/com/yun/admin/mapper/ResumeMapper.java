package com.yun.admin.mapper;

import com.yun.admin.entity.Resume;
import com.yun.admin.entity.vo.ResumeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ResumeMapper {

    int countByExample(ResumeExample example);


    int deleteByExample(ResumeExample example);


    int deleteByPrimaryKey(Integer resumeId);


    int insert(Resume record);


    int insertSelective(Resume record);


    List<Resume> selectByExample(ResumeExample example);


    Resume selectByPrimaryKey(Integer resumeId);


    int updateByExampleSelective(@Param("record") Resume record, @Param("example") ResumeExample example);


    int updateByExample(@Param("record") Resume record, @Param("example") ResumeExample example);


    int updateByPrimaryKeySelective(Resume record);


    int updateByPrimaryKey(Resume record);
}