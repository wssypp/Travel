package com.travel.dao;

import com.travel.pojo.ScenicEntranceTicket;
import com.travel.pojo.ScenicEntranceTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicEntranceTicketMapper {
    int countByExample(ScenicEntranceTicketExample example);

    int deleteByExample(ScenicEntranceTicketExample example);

    int deleteByPrimaryKey(Integer scenicEntranceTicketId);

    int insert(ScenicEntranceTicket record);

    int insertSelective(ScenicEntranceTicket record);

    List<ScenicEntranceTicket> selectByExample(ScenicEntranceTicketExample example);

    ScenicEntranceTicket selectByPrimaryKey(Integer scenicEntranceTicketId);

    int updateByExampleSelective(@Param("record") ScenicEntranceTicket record, @Param("example") ScenicEntranceTicketExample example);

    int updateByExample(@Param("record") ScenicEntranceTicket record, @Param("example") ScenicEntranceTicketExample example);

    int updateByPrimaryKeySelective(ScenicEntranceTicket record);

    int updateByPrimaryKey(ScenicEntranceTicket record);
}