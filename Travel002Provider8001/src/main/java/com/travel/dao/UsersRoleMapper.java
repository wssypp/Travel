package com.travel.dao;

import com.travel.pojo.UsersRole;
import com.travel.pojo.UsersRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersRoleMapper {
    int countByExample(UsersRoleExample example);

    int deleteByExample(UsersRoleExample example);

    int deleteByPrimaryKey(Integer usersRoleId);

    int insert(UsersRole record);

    int insertSelective(UsersRole record);

    List<UsersRole> selectByExample(UsersRoleExample example);

    UsersRole selectByPrimaryKey(Integer usersRoleId);

    int updateByExampleSelective(@Param("record") UsersRole record, @Param("example") UsersRoleExample example);

    int updateByExample(@Param("record") UsersRole record, @Param("example") UsersRoleExample example);

    int updateByPrimaryKeySelective(UsersRole record);

    int updateByPrimaryKey(UsersRole record);
}