package com.travel.dao;

import com.travel.pojo.ScenicComment;
import com.travel.pojo.ScenicCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicCommentMapper {
    int countByExample(ScenicCommentExample example);

    int deleteByExample(ScenicCommentExample example);

    int deleteByPrimaryKey(Integer scenicCommentId);

    int insert(ScenicComment record);

    int insertSelective(ScenicComment record);

    List<ScenicComment> selectByExample(ScenicCommentExample example);

    ScenicComment selectByPrimaryKey(Integer scenicCommentId);

    int updateByExampleSelective(@Param("record") ScenicComment record, @Param("example") ScenicCommentExample example);

    int updateByExample(@Param("record") ScenicComment record, @Param("example") ScenicCommentExample example);

    int updateByPrimaryKeySelective(ScenicComment record);

    int updateByPrimaryKey(ScenicComment record);
}