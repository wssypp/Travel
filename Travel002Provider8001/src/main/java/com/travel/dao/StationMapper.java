package com.travel.dao;

import com.travel.pojo.Station;
import com.travel.pojo.StationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StationMapper {
    int countByExample(StationExample example);

    int deleteByExample(StationExample example);

    int deleteByPrimaryKey(Integer stationId);

    int insert(Station record);

    int insertSelective(Station record);

    List<Station> selectByExample(StationExample example);

    Station selectByPrimaryKey(Integer stationId);

    int updateByExampleSelective(@Param("record") Station record, @Param("example") StationExample example);

    int updateByExample(@Param("record") Station record, @Param("example") StationExample example);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);
}