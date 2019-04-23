package com.garden.mapper;

import com.garden.po.Plant;
import com.garden.po.PlantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlantMapper {
    int countByExample(PlantExample example);

    int deleteByExample(PlantExample example);

    int deleteByPrimaryKey(Integer plantId);

    int insert(Plant record);

    int insertSelective(Plant record);

    List<Plant> selectByExampleWithBLOBs(PlantExample example);

    List<Plant> selectByExample(PlantExample example);

    Plant selectByPrimaryKey(Integer plantId);

    int updateByExampleSelective(@Param("record") Plant record, @Param("example") PlantExample example);

    int updateByExampleWithBLOBs(@Param("record") Plant record, @Param("example") PlantExample example);

    int updateByExample(@Param("record") Plant record, @Param("example") PlantExample example);

    int updateByPrimaryKeySelective(Plant record);

    int updateByPrimaryKeyWithBLOBs(Plant record);

    int updateByPrimaryKey(Plant record);

	List<Plant> selectRandomPlant();
}