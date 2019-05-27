package com.travel.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jd.pojo.TbUser;
import com.jd.pojo.TbUserExample;

public interface IUserService {
	
	int countByExample(TbUserExample example);

    boolean deleteByExample(TbUserExample example);

    boolean deleteByPrimaryKey(Long id);

    boolean insert(TbUser record);

    boolean insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserExample example);

    TbUser selectByPrimaryKey(Long id);

    boolean updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    boolean updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    boolean updateByPrimaryKeySelective(TbUser record);

    boolean updateByPrimaryKey(TbUser record);
}
