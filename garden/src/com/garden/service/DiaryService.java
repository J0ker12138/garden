package com.garden.service;

import java.util.List;

import com.garden.po.DiaryQueryVo;
import com.garden.po.DiarylogQueryVo;
import com.garden.po.User;

public interface DiaryService {
	/**
	 * 根据用户id得到日记列
	 * @param userid
	 * @return
	 */
	public List<DiaryQueryVo> getMyDiaryList(String userid);
	/**
	 * 添加日記
	 * @param dia
	 */
	void addDiary(DiaryQueryVo dia);
	/**
	 * 添加日記記錄
	 * @param diarylog
	 */
	void addDiarylog(DiarylogQueryVo diarylog);
	/**
	 * 修改日志記錄
	 * @param dia
	 */
	public void updateDiarylog(DiarylogQueryVo dia);
	public void updateDiary(DiaryQueryVo dia);
	public List<DiaryQueryVo> getDiaryAndDiarylog(User u);
	public List<DiarylogQueryVo> getDiaryLogList(Integer diaryId);
	public DiaryQueryVo findDiary(Integer diaryId);
	public DiaryQueryVo getDiaryVo(Integer id);
	
}
