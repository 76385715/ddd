package com.show.dao;

import com.show.pojo.HealthVo;
import com.show.pojo.Healthdata;
import com.show.pojo.HealthdataQuery;
import com.show.pojo.HealthdataWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealthdataDao {
    int countByExample(HealthdataQuery example);

    int deleteByExample(HealthdataQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(HealthdataWithBLOBs record);

    int insertSelective(HealthdataWithBLOBs record);

    List<HealthdataWithBLOBs> selectByExampleWithBLOBs(HealthdataQuery example);

    List<Healthdata> selectByExample(HealthdataQuery example);

    HealthdataWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HealthdataWithBLOBs record, @Param("example") HealthdataQuery example);

    int updateByExampleWithBLOBs(@Param("record") HealthdataWithBLOBs record, @Param("example") HealthdataQuery example);

    int updateByExample(@Param("record") Healthdata record, @Param("example") HealthdataQuery example);

    int updateByPrimaryKeySelective(HealthdataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HealthdataWithBLOBs record);

    int updateByPrimaryKey(Healthdata record);
    
    List<Healthdata> getHealthdataByPage(int page);
    
    int selectHealthDataEcrByCondition(HealthVo healthVo);
    
    int selectHealthCountByCondition(HealthVo healthVo);
    
    List<Healthdata> selectHealthDataByUid(int userID);
}