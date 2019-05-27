package com.travel.dao;

import com.travel.pojo.County;
import com.travel.pojo.CountyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountyMapper {
    int countByExample(CountyExample example);

    int deleteByExample(CountyExample example);

    int deleteByPrimaryKey(Integer countyId);

    int insert(County record);

    int insertSelective(County record);

    List<County> selectByExample(CountyExample example);

    County selectByPrimaryKey(Integer countyId);

    int updateByExampleSelective(@Param("record") County record, @Param("example") CountyExample example);

    int updateByExample(@Param("record") County record, @Param("example") CountyExample example);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKey(County record);
}