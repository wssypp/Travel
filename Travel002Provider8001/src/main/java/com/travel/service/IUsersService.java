package com.travel.service;

import com.travel.pojo.Users;
import com.travel.pojo.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUsersService {
    int countByExample(UsersExample example);

    boolean deleteByExample(UsersExample example);

    boolean deleteByPrimaryKey(Integer usersId);

    boolean insert(Users record);

    boolean insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer usersId);

    boolean updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    boolean updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    boolean updateByPrimaryKeySelective(Users record);

    boolean updateByPrimaryKey(Users record);
}