package com.travel.dao;

import com.travel.pojo.ScenicOrder;
import com.travel.pojo.ScenicOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicOrderMapper {
    int countByExample(ScenicOrderExample example);

    int deleteByExample(ScenicOrderExample example);

    int deleteByPrimaryKey(Integer scenicOrderId);

    int insert(ScenicOrder record);

    int insertSelective(ScenicOrder record);

    List<ScenicOrder> selectByExample(ScenicOrderExample example);

    ScenicOrder selectByPrimaryKey(Integer scenicOrderId);

    int updateByExampleSelective(@Param("record") ScenicOrder record, @Param("example") ScenicOrderExample example);

    int updateByExample(@Param("record") ScenicOrder record, @Param("example") ScenicOrderExample example);

    int updateByPrimaryKeySelective(ScenicOrder record);

    int updateByPrimaryKey(ScenicOrder record);
}