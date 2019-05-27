package com.travel.dao;

import com.travel.pojo.Flightinfo;
import com.travel.pojo.FlightinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlightinfoMapper {
    int countByExample(FlightinfoExample example);

    int deleteByExample(FlightinfoExample example);

    int deleteByPrimaryKey(Integer flightinfoId);

    int insert(Flightinfo record);

    int insertSelective(Flightinfo record);

    List<Flightinfo> selectByExample(FlightinfoExample example);

    Flightinfo selectByPrimaryKey(Integer flightinfoId);

    int updateByExampleSelective(@Param("record") Flightinfo record, @Param("example") FlightinfoExample example);

    int updateByExample(@Param("record") Flightinfo record, @Param("example") FlightinfoExample example);

    int updateByPrimaryKeySelective(Flightinfo record);

    int updateByPrimaryKey(Flightinfo record);
}