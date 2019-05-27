package com.travel.dao;

import com.travel.pojo.Bank;
import com.travel.pojo.BankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankMapper {
    int countByExample(BankExample example);

    int deleteByExample(BankExample example);

    int deleteByPrimaryKey(Integer bankId);

    int insert(Bank record);

    int insertSelective(Bank record);

    List<Bank> selectByExample(BankExample example);

    Bank selectByPrimaryKey(Integer bankId);

    int updateByExampleSelective(@Param("record") Bank record, @Param("example") BankExample example);

    int updateByExample(@Param("record") Bank record, @Param("example") BankExample example);

    int updateByPrimaryKeySelective(Bank record);

    int updateByPrimaryKey(Bank record);
}