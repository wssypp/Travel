package com.travel.dao;

import com.travel.pojo.Airperson;
import com.travel.pojo.AirpersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirpersonMapper {
    int countByExample(AirpersonExample example);

    int deleteByExample(AirpersonExample example);

    int deleteByPrimaryKey(Integer airpersonId);

    int insert(Airperson record);

    int insertSelective(Airperson record);

    List<Airperson> selectByExample(AirpersonExample example);

    Airperson selectByPrimaryKey(Integer airpersonId);

    int updateByExampleSelective(@Param("record") Airperson record, @Param("example") AirpersonExample example);

    int updateByExample(@Param("record") Airperson record, @Param("example") AirpersonExample example);

    int updateByPrimaryKeySelective(Airperson record);

    int updateByPrimaryKey(Airperson record);
}