package com.garden.mapper;

import com.garden.po.Concern;
import com.garden.po.ConcernExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConcernMapper {
    int countByExample(ConcernExample example);

    int deleteByExample(ConcernExample example);

    int insert(Concern record);

    int insertSelective(Concern record);

    List<Concern> selectByExample(ConcernExample example);

    int updateByExampleSelective(@Param("record") Concern record, @Param("example") ConcernExample example);

    int updateByExample(@Param("record") Concern record, @Param("example") ConcernExample example);
}