package com.travel.dao;

import com.travel.pojo.EntranceTicketType;
import com.travel.pojo.EntranceTicketTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntranceTicketTypeMapper {
    int countByExample(EntranceTicketTypeExample example);

    int deleteByExample(EntranceTicketTypeExample example);

    int deleteByPrimaryKey(Integer entranceTicketTypeId);

    int insert(EntranceTicketType record);

    int insertSelective(EntranceTicketType record);

    List<EntranceTicketType> selectByExample(EntranceTicketTypeExample example);

    EntranceTicketType selectByPrimaryKey(Integer entranceTicketTypeId);

    int updateByExampleSelective(@Param("record") EntranceTicketType record, @Param("example") EntranceTicketTypeExample example);

    int updateByExample(@Param("record") EntranceTicketType record, @Param("example") EntranceTicketTypeExample example);

    int updateByPrimaryKeySelective(EntranceTicketType record);

    int updateByPrimaryKey(EntranceTicketType record);
}