package com.travel.dao;

import com.travel.pojo.Route;
import com.travel.pojo.RouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RouteMapper {
    int countByExample(RouteExample example);

    int deleteByExample(RouteExample example);

    int deleteByPrimaryKey(Integer routeId);

    int insert(Route record);

    int insertSelective(Route record);

    List<Route> selectByExample(RouteExample example);

    Route selectByPrimaryKey(Integer routeId);

    int updateByExampleSelective(@Param("record") Route record, @Param("example") RouteExample example);

    int updateByExample(@Param("record") Route record, @Param("example") RouteExample example);

    int updateByPrimaryKeySelective(Route record);

    int updateByPrimaryKey(Route record);
}