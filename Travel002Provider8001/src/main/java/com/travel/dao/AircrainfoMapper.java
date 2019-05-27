package com.travel.dao;

import com.travel.pojo.Aircrainfo;
import com.travel.pojo.AircrainfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AircrainfoMapper {
    int countByExample(AircrainfoExample example);

    int deleteByExample(AircrainfoExample example);

    int deleteByPrimaryKey(Integer aircrainfoId);

    int insert(Aircrainfo record);

    int insertSelective(Aircrainfo record);

    List<Aircrainfo> selectByExample(AircrainfoExample example);

    Aircrainfo selectByPrimaryKey(Integer aircrainfoId);

    int updateByExampleSelective(@Param("record") Aircrainfo record, @Param("example") AircrainfoExample example);

    int updateByExample(@Param("record") Aircrainfo record, @Param("example") AircrainfoExample example);

    int updateByPrimaryKeySelective(Aircrainfo record);

    int updateByPrimaryKey(Aircrainfo record);
}