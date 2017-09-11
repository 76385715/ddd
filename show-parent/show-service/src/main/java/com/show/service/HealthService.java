package com.show.service;

import java.util.List;

import com.show.pojo.HealthVo;
import com.show.pojo.Healthdata;
import com.show.pojo.HealthdataQuery;
import com.show.pojo.HealthdataWithBLOBs;

public interface HealthService {
	public List<Healthdata> getHealthdataByPage(int page);
	public List<Healthdata> selectByExample(HealthdataQuery example);
	public int selectHealthDataEcrByCondition(HealthVo healthVo);
	public int selectHealthCountByCondition(HealthVo healthVo);
	public List<HealthdataWithBLOBs> selectByExampleWithBLOBs(HealthdataQuery example);
	public List<Healthdata> selectHealthDataByUid(int userID);
	public HealthdataWithBLOBs selectByPrimaryKey(Integer id);
}
