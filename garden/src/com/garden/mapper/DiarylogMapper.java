package com.garden.mapper;

import com.garden.po.Diarylog;
import com.garden.po.DiarylogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiarylogMapper {
    int countByExample(DiarylogExample example);

    int deleteByExample(DiarylogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(Diarylog record);

    int insertSelective(Diarylog record);

    List<Diarylog> selectByExample(DiarylogExample example);

    Diarylog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") Diarylog record, @Param("example") DiarylogExample example);

    int updateByExample(@Param("record") Diarylog record, @Param("example") DiarylogExample example);

    int updateByPrimaryKeySelective(Diarylog record);

    int updateByPrimaryKey(Diarylog record);
}