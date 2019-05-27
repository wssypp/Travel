package com.travel.dao;

import com.travel.pojo.HotelService;
import com.travel.pojo.HotelServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelServiceMapper {
    int countByExample(HotelServiceExample example);

    int deleteByExample(HotelServiceExample example);

    int deleteByPrimaryKey(Integer hotelServiceId);

    int insert(HotelService record);

    int insertSelective(HotelService record);

    List<HotelService> selectByExample(HotelServiceExample example);

    HotelService selectByPrimaryKey(Integer hotelServiceId);

    int updateByExampleSelective(@Param("record") HotelService record, @Param("example") HotelServiceExample example);

    int updateByExample(@Param("record") HotelService record, @Param("example") HotelServiceExample example);

    int updateByPrimaryKeySelective(HotelService record);

    int updateByPrimaryKey(HotelService record);
}