package com.garden.po;

import java.util.List;

public class DiaryQueryVo {
  private Diary diary;
  private List<DiarylogQueryVo> logList;




public List<DiarylogQueryVo> getLogList() {
	return logList;
}

public void setLogList(List<DiarylogQueryVo> logList) {
	this.logList = logList;
}

public Diary getDiary() {
	return diary;
}

public void setDiary(Diary diary) {
	this.diary = diary;
}
  
}