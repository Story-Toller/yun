package com.yun.admin.mapper;

import com.yun.admin.entity.ResumeDeliveryRecord;
import com.yun.admin.entity.vo.ResumeDeliveryRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ResumeDeliveryRecordMapper {

    int countByExample(ResumeDeliveryRecordExample example);


    int deleteByExample(ResumeDeliveryRecordExample example);


    int deleteByPrimaryKey(Integer resumeDeliveryRecordId);


    int insert(ResumeDeliveryRecord record);


    int insertSelective(ResumeDeliveryRecord record);


    List<ResumeDeliveryRecord> selectByExample(ResumeDeliveryRecordExample example);


    ResumeDeliveryRecord selectByPrimaryKey(Integer resumeDeliveryRecordId);


    int updateByExampleSelective(@Param("record") ResumeDeliveryRecord record, @Param("example") ResumeDeliveryRecordExample example);


    int updateByExample(@Param("record") ResumeDeliveryRecord record, @Param("example") ResumeDeliveryRecordExample example);


    int updateByPrimaryKeySelective(ResumeDeliveryRecord record);


    int updateByPrimaryKey(ResumeDeliveryRecord record);
}