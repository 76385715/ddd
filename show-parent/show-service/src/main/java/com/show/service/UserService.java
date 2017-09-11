package com.show.service;

import java.util.List;

import com.show.pojo.Userinfo;
import com.show.pojo.UserinfoQuery;

public interface UserService {
	List<Userinfo> selectByExample(UserinfoQuery example);
	int countByExample(UserinfoQuery example);
}
