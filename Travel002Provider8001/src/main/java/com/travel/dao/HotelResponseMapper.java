package com.travel.dao;

import com.travel.pojo.HotelResponse;
import com.travel.pojo.HotelResponseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelResponseMapper {
    int countByExample(HotelResponseExample example);

    int deleteByExample(HotelResponseExample example);

    int deleteByPrimaryKey(Integer hotelResponseId);

    int insert(HotelResponse record);

    int insertSelective(HotelResponse record);

    List<HotelResponse> selectByExample(HotelResponseExample example);

    HotelResponse selectByPrimaryKey(Integer hotelResponseId);

    int updateByExampleSelective(@Param("record") HotelResponse record, @Param("example") HotelResponseExample example);

    int updateByExample(@Param("record") HotelResponse record, @Param("example") HotelResponseExample example);

    int updateByPrimaryKeySelective(HotelResponse record);

    int updateByPrimaryKey(HotelResponse record);
}