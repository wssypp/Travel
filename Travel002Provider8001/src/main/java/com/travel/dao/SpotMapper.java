package com.travel.dao;

import com.travel.pojo.Spot;
import com.travel.pojo.SpotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpotMapper {
    int countByExample(SpotExample example);

    int deleteByExample(SpotExample example);

    int deleteByPrimaryKey(Integer spotId);

    int insert(Spot record);

    int insertSelective(Spot record);

    List<Spot> selectByExample(SpotExample example);

    Spot selectByPrimaryKey(Integer spotId);

    int updateByExampleSelective(@Param("record") Spot record, @Param("example") SpotExample example);

    int updateByExample(@Param("record") Spot record, @Param("example") SpotExample example);

    int updateByPrimaryKeySelective(Spot record);

    int updateByPrimaryKey(Spot record);
}