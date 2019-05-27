package com.travel.dao;

import com.travel.pojo.ScenicResponse;
import com.travel.pojo.ScenicResponseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicResponseMapper {
    int countByExample(ScenicResponseExample example);

    int deleteByExample(ScenicResponseExample example);

    int deleteByPrimaryKey(Integer scenicResponseId);

    int insert(ScenicResponse record);

    int insertSelective(ScenicResponse record);

    List<ScenicResponse> selectByExample(ScenicResponseExample example);

    ScenicResponse selectByPrimaryKey(Integer scenicResponseId);

    int updateByExampleSelective(@Param("record") ScenicResponse record, @Param("example") ScenicResponseExample example);

    int updateByExample(@Param("record") ScenicResponse record, @Param("example") ScenicResponseExample example);

    int updateByPrimaryKeySelective(ScenicResponse record);

    int updateByPrimaryKey(ScenicResponse record);
}