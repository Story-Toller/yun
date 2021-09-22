package com.yun.admin.mapper;

import com.yun.admin.entity.Honor;
import com.yun.admin.entity.vo.HonorExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HonorMapper {

    int countByExample(HonorExample example);


    int deleteByExample(HonorExample example);


    int deleteByPrimaryKey(Integer honorId);


    int insert(Honor record);


    int insertSelective(Honor record);


    List<Honor> selectByExample(HonorExample example);


    Honor selectByPrimaryKey(Integer honorId);


    int updateByExampleSelective(@Param("record") Honor record, @Param("example") HonorExample example);


    int updateByExample(@Param("record") Honor record, @Param("example") HonorExample example);


    int updateByPrimaryKeySelective(Honor record);


    int updateByPrimaryKey(Honor record);
}