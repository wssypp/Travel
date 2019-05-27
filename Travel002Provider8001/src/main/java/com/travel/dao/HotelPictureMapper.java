package com.travel.dao;

import com.travel.pojo.HotelPicture;
import com.travel.pojo.HotelPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelPictureMapper {
    int countByExample(HotelPictureExample example);

    int deleteByExample(HotelPictureExample example);

    int deleteByPrimaryKey(Integer hotelPictureId);

    int insert(HotelPicture record);

    int insertSelective(HotelPicture record);

    List<HotelPicture> selectByExample(HotelPictureExample example);

    HotelPicture selectByPrimaryKey(Integer hotelPictureId);

    int updateByExampleSelective(@Param("record") HotelPicture record, @Param("example") HotelPictureExample example);

    int updateByExample(@Param("record") HotelPicture record, @Param("example") HotelPictureExample example);

    int updateByPrimaryKeySelective(HotelPicture record);

    int updateByPrimaryKey(HotelPicture record);
}