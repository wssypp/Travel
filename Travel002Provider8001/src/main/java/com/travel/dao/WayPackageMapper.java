package com.travel.dao;

import com.travel.pojo.WayPackage;
import com.travel.pojo.WayPackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WayPackageMapper {
    int countByExample(WayPackageExample example);

    int deleteByExample(WayPackageExample example);

    int deleteByPrimaryKey(Integer wayPackageId);

    int insert(WayPackage record);

    int insertSelective(WayPackage record);

    List<WayPackage> selectByExample(WayPackageExample example);

    WayPackage selectByPrimaryKey(Integer wayPackageId);

    int updateByExampleSelective(@Param("record") WayPackage record, @Param("example") WayPackageExample example);

    int updateByExample(@Param("record") WayPackage record, @Param("example") WayPackageExample example);

    int updateByPrimaryKeySelective(WayPackage record);

    int updateByPrimaryKey(WayPackage record);
}