package com.garden.mapper;

import com.garden.po.Diary;
import com.garden.po.DiaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiaryMapper {
    int countByExample(DiaryExample example);

    int deleteByExample(DiaryExample example);

    int deleteByPrimaryKey(Integer diaryId);

    int insert(Diary record);

    int insertSelective(Diary record);

    List<Diary> selectByExample(DiaryExample example);

    Diary selectByPrimaryKey(Integer diaryId);

    int updateByExampleSelective(@Param("record") Diary record, @Param("example") DiaryExample example);

    int updateByExample(@Param("record") Diary record, @Param("example") DiaryExample example);

    int updateByPrimaryKeySelective(Diary record);

    int updateByPrimaryKey(Diary record);
}