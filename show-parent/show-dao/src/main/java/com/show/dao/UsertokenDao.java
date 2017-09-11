package com.show.dao;

import com.show.pojo.Usertoken;
import com.show.pojo.UsertokenQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsertokenDao {
    int countByExample(UsertokenQuery example);

    int deleteByExample(UsertokenQuery example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Usertoken record);

    int insertSelective(Usertoken record);

    List<Usertoken> selectByExample(UsertokenQuery example);

    Usertoken selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Usertoken record, @Param("example") UsertokenQuery example);

    int updateByExample(@Param("record") Usertoken record, @Param("example") UsertokenQuery example);

    int updateByPrimaryKeySelective(Usertoken record);

    int updateByPrimaryKey(Usertoken record);
}