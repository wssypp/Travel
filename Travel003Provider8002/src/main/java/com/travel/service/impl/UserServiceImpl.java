package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.pojo.TbUser;
import com.jd.pojo.TbUserExample;
import com.travel.dao.TbUserMapper;
import com.travel.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private TbUserMapper userMapper;
	
	public int countByExample(TbUserExample example) {
		return userMapper.countByExample(example);
	}

	public boolean deleteByExample(TbUserExample example) {
		return userMapper.deleteByExample(example) > 0;
	}

	public boolean deleteByPrimaryKey(Long id) {
		return userMapper.deleteByPrimaryKey(id) > 0;
	}

	public boolean insert(TbUser record) {
		return userMapper.insert(record) > 0;
	}

	public boolean insertSelective(TbUser record) {
		return userMapper.insertSelective(record) > 0;
	}

	public List<TbUser> selectByExample(TbUserExample example) {
		return userMapper.selectByExample(example);
	}

	public TbUser selectByPrimaryKey(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public boolean updateByExampleSelective(TbUser record, TbUserExample example) {
		return userMapper.updateByExampleSelective(record, example) > 0;
	}

	public boolean updateByExample(TbUser record, TbUserExample example) {
		return userMapper.updateByExample(record, example) > 0;
	}

	public boolean updateByPrimaryKeySelective(TbUser record) {
		return userMapper.updateByPrimaryKeySelective(record) > 0;
	}

	public boolean updateByPrimaryKey(TbUser record) {
		return userMapper.updateByPrimaryKey(record) > 0;
	}

	
}
