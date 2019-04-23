package com.garden.mapper;

import com.garden.po.Technique;
import com.garden.po.TechniqueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TechniqueMapper {
    int countByExample(TechniqueExample example);

    int deleteByExample(TechniqueExample example);

    int deleteByPrimaryKey(Integer techId);

    int insert(Technique record);

    int insertSelective(Technique record);

    List<Technique> selectByExample(TechniqueExample example);

    Technique selectByPrimaryKey(Integer techId);
    
    List<Technique> selectRandomTech();

    int updateByExampleSelective(@Param("record") Technique record, @Param("example") TechniqueExample example);

    int updateByExample(@Param("record") Technique record, @Param("example") TechniqueExample example);

    int updateByPrimaryKeySelective(Technique record);

    int updateByPrimaryKey(Technique record);
}