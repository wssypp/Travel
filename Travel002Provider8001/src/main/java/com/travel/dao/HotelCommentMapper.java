package com.travel.dao;

import com.travel.pojo.HotelComment;
import com.travel.pojo.HotelCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelCommentMapper {
    int countByExample(HotelCommentExample example);

    int deleteByExample(HotelCommentExample example);

    int deleteByPrimaryKey(Integer hotelCommentId);

    int insert(HotelComment record);

    int insertSelective(HotelComment record);

    List<HotelComment> selectByExample(HotelCommentExample example);

    HotelComment selectByPrimaryKey(Integer hotelCommentId);

    int updateByExampleSelective(@Param("record") HotelComment record, @Param("example") HotelCommentExample example);

    int updateByExample(@Param("record") HotelComment record, @Param("example") HotelCommentExample example);

    int updateByPrimaryKeySelective(HotelComment record);

    int updateByPrimaryKey(HotelComment record);
}