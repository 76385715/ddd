package com.show.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.show.dao.UserinfoDao;
import com.show.pojo.Userinfo;
import com.show.pojo.UserinfoQuery;
import com.show.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserinfoDao userinfoDao;
	@Override
	public List<Userinfo> selectByExample(UserinfoQuery example) {
		return userinfoDao.selectByExample(example);
	}
	@Override
	public int countByExample(UserinfoQuery example) {
		return userinfoDao.countByExample(example);
	}

}
