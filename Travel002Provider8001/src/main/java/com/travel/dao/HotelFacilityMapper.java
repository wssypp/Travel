package com.travel.dao;

import com.travel.pojo.HotelFacility;
import com.travel.pojo.HotelFacilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelFacilityMapper {
    int countByExample(HotelFacilityExample example);

    int deleteByExample(HotelFacilityExample example);

    int deleteByPrimaryKey(Integer hotelFacilityId);

    int insert(HotelFacility record);

    int insertSelective(HotelFacility record);

    List<HotelFacility> selectByExample(HotelFacilityExample example);

    HotelFacility selectByPrimaryKey(Integer hotelFacilityId);

    int updateByExampleSelective(@Param("record") HotelFacility record, @Param("example") HotelFacilityExample example);

    int updateByExample(@Param("record") HotelFacility record, @Param("example") HotelFacilityExample example);

    int updateByPrimaryKeySelective(HotelFacility record);

    int updateByPrimaryKey(HotelFacility record);
}