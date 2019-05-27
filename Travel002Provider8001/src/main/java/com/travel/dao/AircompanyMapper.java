package com.travel.dao;

import com.travel.pojo.Aircompany;
import com.travel.pojo.AircompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AircompanyMapper {
    int countByExample(AircompanyExample example);

    int deleteByExample(AircompanyExample example);

    int deleteByPrimaryKey(Integer aircompanyId);

    int insert(Aircompany record);

    int insertSelective(Aircompany record);

    List<Aircompany> selectByExample(AircompanyExample example);

    Aircompany selectByPrimaryKey(Integer aircompanyId);

    int updateByExampleSelective(@Param("record") Aircompany record, @Param("example") AircompanyExample example);

    int updateByExample(@Param("record") Aircompany record, @Param("example") AircompanyExample example);

    int updateByPrimaryKeySelective(Aircompany record);

    int updateByPrimaryKey(Aircompany record);
}