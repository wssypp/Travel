package com.travel.dao;

import com.travel.pojo.Restaurant;
import com.travel.pojo.RestaurantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RestaurantMapper {
    int countByExample(RestaurantExample example);

    int deleteByExample(RestaurantExample example);

    int deleteByPrimaryKey(Integer restaurantId);

    int insert(Restaurant record);

    int insertSelective(Restaurant record);

    List<Restaurant> selectByExample(RestaurantExample example);

    Restaurant selectByPrimaryKey(Integer restaurantId);

    int updateByExampleSelective(@Param("record") Restaurant record, @Param("example") RestaurantExample example);

    int updateByExample(@Param("record") Restaurant record, @Param("example") RestaurantExample example);

    int updateByPrimaryKeySelective(Restaurant record);

    int updateByPrimaryKey(Restaurant record);
}