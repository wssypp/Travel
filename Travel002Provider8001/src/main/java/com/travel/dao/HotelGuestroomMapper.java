package com.travel.dao;

import com.travel.pojo.HotelGuestroom;
import com.travel.pojo.HotelGuestroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelGuestroomMapper {
    int countByExample(HotelGuestroomExample example);

    int deleteByExample(HotelGuestroomExample example);

    int deleteByPrimaryKey(Integer hotelGuestroomId);

    int insert(HotelGuestroom record);

    int insertSelective(HotelGuestroom record);

    List<HotelGuestroom> selectByExample(HotelGuestroomExample example);

    HotelGuestroom selectByPrimaryKey(Integer hotelGuestroomId);

    int updateByExampleSelective(@Param("record") HotelGuestroom record, @Param("example") HotelGuestroomExample example);

    int updateByExample(@Param("record") HotelGuestroom record, @Param("example") HotelGuestroomExample example);

    int updateByPrimaryKeySelective(HotelGuestroom record);

    int updateByPrimaryKey(HotelGuestroom record);
}