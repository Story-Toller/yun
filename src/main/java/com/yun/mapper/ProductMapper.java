package com.yun.mapper;

import com.yun.entity.*;
import com.yun.entity.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface ProductMapper {

    int countByExample(ProductExample example);


    int deleteByExample(ProductExample example);


    int deleteByPrimaryKey(String proId);


    int insert(Product record);


    int insertSelective(Product record);


    List<Product> selectByExample(ProductExample example);


    Product selectByPrimaryKey(String proId);


    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);


    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);


    int updateByPrimaryKeySelective(Product record);


    int updateByPrimaryKey(Product record);
}