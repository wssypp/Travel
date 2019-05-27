package com.travel.dao;

import com.travel.pojo.Aircraft;
import com.travel.pojo.AircraftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AircraftMapper {
    int countByExample(AircraftExample example);

    int deleteByExample(AircraftExample example);

    int deleteByPrimaryKey(Integer aircraftId);

    int insert(Aircraft record);

    int insertSelective(Aircraft record);

    List<Aircraft> selectByExample(AircraftExample example);

    Aircraft selectByPrimaryKey(Integer aircraftId);

    int updateByExampleSelective(@Param("record") Aircraft record, @Param("example") AircraftExample example);

    int updateByExample(@Param("record") Aircraft record, @Param("example") AircraftExample example);

    int updateByPrimaryKeySelective(Aircraft record);

    int updateByPrimaryKey(Aircraft record);
}