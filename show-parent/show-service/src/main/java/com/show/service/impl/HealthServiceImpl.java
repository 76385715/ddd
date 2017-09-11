package com.show.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.show.dao.HealthdataDao;
import com.show.pojo.HealthVo;
import com.show.pojo.Healthdata;
import com.show.pojo.HealthdataQuery;
import com.show.pojo.HealthdataWithBLOBs;
import com.show.service.HealthService;
@Service
public class HealthServiceImpl implements HealthService{
	@Autowired
	private HealthdataDao healthdataDao;

	@Override
	public List<Healthdata> getHealthdataByPage(int page) {
		return healthdataDao.getHealthdataByPage(page);
	}

	@Override
	public List<Healthdata> selectByExample(HealthdataQuery example) {
		return healthdataDao.selectByExample(example);
	}

	@Override
	public int selectHealthDataEcrByCondition(HealthVo healthVo) {
		return healthdataDao.selectHealthDataEcrByCondition(healthVo);
	}

	@Override
	public int selectHealthCountByCondition(HealthVo healthVo) {
		return healthdataDao.selectHealthCountByCondition(healthVo);
	}

	@Override
	public List<HealthdataWithBLOBs> selectByExampleWithBLOBs(HealthdataQuery example) {
		return healthdataDao.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<Healthdata> selectHealthDataByUid(int userID) {
		return healthdataDao.selectHealthDataByUid(userID);
	}

	@Override
	public HealthdataWithBLOBs selectByPrimaryKey(Integer id) {
		return healthdataDao.selectByPrimaryKey(id);
	}
}
