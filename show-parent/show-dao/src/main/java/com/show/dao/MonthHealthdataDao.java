package com.show.dao;

import com.show.pojo.MonthHealthdata;
import com.show.pojo.MonthHealthdataKey;
import com.show.pojo.MonthHealthdataQuery;
import com.show.pojo.MonthHealthdataWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonthHealthdataDao {
    int countByExample(MonthHealthdataQuery example);

    int deleteByExample(MonthHealthdataQuery example);

    int deleteByPrimaryKey(MonthHealthdataKey key);

    int insert(MonthHealthdataWithBLOBs record);

    int insertSelective(MonthHealthdataWithBLOBs record);

    List<MonthHealthdataWithBLOBs> selectByExampleWithBLOBs(MonthHealthdataQuery example);

    List<MonthHealthdata> selectByExample(MonthHealthdataQuery example);

    MonthHealthdataWithBLOBs selectByPrimaryKey(MonthHealthdataKey key);

    int updateByExampleSelective(@Param("record") MonthHealthdataWithBLOBs record, @Param("example") MonthHealthdataQuery example);

    int updateByExampleWithBLOBs(@Param("record") MonthHealthdataWithBLOBs record, @Param("example") MonthHealthdataQuery example);

    int updateByExample(@Param("record") MonthHealthdata record, @Param("example") MonthHealthdataQuery example);

    int updateByPrimaryKeySelective(MonthHealthdataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MonthHealthdataWithBLOBs record);

    int updateByPrimaryKey(MonthHealthdata record);
}