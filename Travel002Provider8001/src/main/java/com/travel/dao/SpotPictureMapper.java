package com.travel.dao;

import com.travel.pojo.SpotPicture;
import com.travel.pojo.SpotPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpotPictureMapper {
    int countByExample(SpotPictureExample example);

    int deleteByExample(SpotPictureExample example);

    int deleteByPrimaryKey(Integer spotPictureId);

    int insert(SpotPicture record);

    int insertSelective(SpotPicture record);

    List<SpotPicture> selectByExample(SpotPictureExample example);

    SpotPicture selectByPrimaryKey(Integer spotPictureId);

    int updateByExampleSelective(@Param("record") SpotPicture record, @Param("example") SpotPictureExample example);

    int updateByExample(@Param("record") SpotPicture record, @Param("example") SpotPictureExample example);

    int updateByPrimaryKeySelective(SpotPicture record);

    int updateByPrimaryKey(SpotPicture record);
}