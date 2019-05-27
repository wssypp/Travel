package com.travel.dao;

import com.travel.pojo.Airticketorder;
import com.travel.pojo.AirticketorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirticketorderMapper {
    int countByExample(AirticketorderExample example);

    int deleteByExample(AirticketorderExample example);

    int deleteByPrimaryKey(Integer airticketorderId);

    int insert(Airticketorder record);

    int insertSelective(Airticketorder record);

    List<Airticketorder> selectByExample(AirticketorderExample example);

    Airticketorder selectByPrimaryKey(Integer airticketorderId);

    int updateByExampleSelective(@Param("record") Airticketorder record, @Param("example") AirticketorderExample example);

    int updateByExample(@Param("record") Airticketorder record, @Param("example") AirticketorderExample example);

    int updateByPrimaryKeySelective(Airticketorder record);

    int updateByPrimaryKey(Airticketorder record);
}