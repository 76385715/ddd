package com.show.dao;

import com.show.pojo.Planning;
import com.show.pojo.PlanningQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanningDao {
    int countByExample(PlanningQuery example);

    int deleteByExample(PlanningQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Planning record);

    int insertSelective(Planning record);

    List<Planning> selectByExampleWithBLOBs(PlanningQuery example);

    List<Planning> selectByExample(PlanningQuery example);

    Planning selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Planning record, @Param("example") PlanningQuery example);

    int updateByExampleWithBLOBs(@Param("record") Planning record, @Param("example") PlanningQuery example);

    int updateByExample(@Param("record") Planning record, @Param("example") PlanningQuery example);

    int updateByPrimaryKeySelective(Planning record);

    int updateByPrimaryKeyWithBLOBs(Planning record);

    int updateByPrimaryKey(Planning record);
}