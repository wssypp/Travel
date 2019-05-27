package com.travel.dao;

import com.travel.pojo.HotelOrder;
import com.travel.pojo.HotelOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelOrderMapper {
    int countByExample(HotelOrderExample example);

    int deleteByExample(HotelOrderExample example);

    int deleteByPrimaryKey(Integer hotelOrderId);

    int insert(HotelOrder record);

    int insertSelective(HotelOrder record);

    List<HotelOrder> selectByExample(HotelOrderExample example);

    HotelOrder selectByPrimaryKey(Integer hotelOrderId);

    int updateByExampleSelective(@Param("record") HotelOrder record, @Param("example") HotelOrderExample example);

    int updateByExample(@Param("record") HotelOrder record, @Param("example") HotelOrderExample example);

    int updateByPrimaryKeySelective(HotelOrder record);

    int updateByPrimaryKey(HotelOrder record);
}