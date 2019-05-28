package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.UsersMapper;
import com.travel.pojo.Users;
import com.travel.pojo.UsersExample;
import com.travel.service.IUsersService;

@Service
public class UsersServiceImpl implements IUsersService {

	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public int countByExample(UsersExample example) {
		return usersMapper.countByExample(example);
	}

	@Override
	public boolean deleteByExample(UsersExample example) {
		return usersMapper.deleteByExample(example) > 0;
	}

	@Override
	public boolean deleteByPrimaryKey(Integer usersId) {
		return usersMapper.deleteByPrimaryKey(usersId) > 0;
	}

	@Override
	public boolean insert(Users record) {
		return usersMapper.insert(record) > 0;
	}

	@Override
	public boolean insertSelective(Users record) {
		return usersMapper.insertSelective(record) > 0;
	}

	@Override
	public List<Users> selectByExample(UsersExample example) {
		return usersMapper.selectByExample(example);
	}

	@Override
	public Users selectByPrimaryKey(Integer usersId) {
		return usersMapper.selectByPrimaryKey(usersId);
	}

	@Override
	public boolean updateByExampleSelective(Users record, UsersExample example) {
		return usersMapper.updateByPrimaryKeySelective(record) > 0;
	}

	@Override
	public boolean updateByExample(Users record, UsersExample example) {
		return usersMapper.updateByExample(record, example) > 0;
	}

	@Override
	public boolean updateByPrimaryKeySelective(Users record) {
		return usersMapper.updateByPrimaryKeySelective(record) > 0;
	}

	@Override
	public boolean updateByPrimaryKey(Users record) {
		return usersMapper.updateByPrimaryKey(record) > 0;
	}

}
