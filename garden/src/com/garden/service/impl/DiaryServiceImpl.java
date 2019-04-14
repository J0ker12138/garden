package com.garden.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.mapper.DiaryMapper;
import com.garden.mapper.DiarylogMapper;
import com.garden.po.Diary;
import com.garden.po.DiaryExample.Criteria;
import com.garden.po.DiaryExample;
import com.garden.po.DiaryQueryVo;
import com.garden.po.Diarylog;
import com.garden.po.DiarylogExample;
import com.garden.po.DiarylogQueryVo;
import com.garden.po.User;
import com.garden.service.DiaryService;

@Service
public class DiaryServiceImpl implements DiaryService {
	@Autowired
	DiaryMapper diaryMapper;
	@Autowired
	DiarylogMapper diarylogMapper;

	@Override
	public List<DiaryQueryVo> getMyDiaryList(String userid) {
		// TODO Auto-generated method stub
		DiaryExample dia = new DiaryExample();
		Criteria criteria = dia.createCriteria();
		criteria.andDiaryUseridEqualTo(userid);
		criteria.andDiaryUseridIsNotNull();
		List<Diary> selectByExample = diaryMapper.selectByExample(dia);
		List<DiaryQueryVo> list = new ArrayList<DiaryQueryVo>();
		for (int i = 0; i < selectByExample.size(); i++) {
			DiaryQueryVo dir = new DiaryQueryVo();
			dir.setDiary(selectByExample.get(i));
			list.add(dir);
		}
		return list;
	}

	@Override
	
	public void addDiary(DiaryQueryVo dia) {
		// TODO Auto-generated method stub
		Diary d=dia.getDiary();
		d.setDiaryTime(new Date().toString());
		diaryMapper.insert(d);
	}

	@Override
	public void addDiarylog(DiarylogQueryVo diarylog) {
		// TODO Auto-generated method stub
		Diarylog log=diarylog.getDiarylog();
		log.setLogDate(new Date());
		diarylogMapper.insert(log);
	}

	@Override
	public void updateDiarylog(DiarylogQueryVo dia) {
		// TODO Auto-generated method stub
		DiarylogExample d=new DiarylogExample();
		com.garden.po.DiarylogExample.Criteria criterion=d.createCriteria();
		criterion.andLogDiaryidEqualTo(dia.getDiarylog().getLogDiaryid());
		criterion.andLogIdEqualTo(dia.getDiarylog().getLogDiaryid());
		diarylogMapper.updateByExample(dia.getDiarylog(), d);
		
	}

	@Override
	public void updateDiary(DiaryQueryVo dia) {
		// TODO Auto-generated method stub
		DiaryExample d=new DiaryExample();
		Criteria c=d.createCriteria();
		c.andDiaryIdEqualTo(dia.getDiary().getDiaryId());
		diaryMapper.updateByExample(dia.getDiary(), d);
	}

	@Override
	public List<DiaryQueryVo> getDiaryAndDiarylog(User u) {
		// TODO Auto-generated method stub
		DiaryExample dex=new DiaryExample();
		Criteria c=dex.createCriteria();
		c.andDiaryUseridEqualTo(u.getUserId());
		List<Diary> list=diaryMapper.selectByExample(dex);
		List<DiaryQueryVo> diarylist=new ArrayList<>();
		
		if (list!=null) {
			for (int i = 0; i < list.size(); i++) {
				List<DiarylogQueryVo> dialoglist=new ArrayList<>();
				DiaryQueryVo dq=new DiaryQueryVo();
				dq.setDiary(list.get(i));
				DiarylogExample dxp=new DiarylogExample();
				dxp.setOrderByClause("log_date desc");
				com.garden.po.DiarylogExample.Criteria criteria=dxp.createCriteria();
				criteria.andLogDiaryidEqualTo(list.get(i).getDiaryId());
				List<Diarylog> loglist=diarylogMapper.selectByExample(dxp);
				if (loglist!=null) {
				for (int j = 0; j < loglist.size(); j++) {
					DiarylogQueryVo diaq=new DiarylogQueryVo();
					diaq.setDiarylog(loglist.get(j));
					if (loglist.get(j).getLogDate()!=null) {
						diaq.setDay(loglist.get(j).getLogDate().getDate());
						diaq.setMouth(loglist.get(j).getLogDate().getMonth()+1);
					}
					dialoglist.add(diaq);
				}
				}
					
			
				dq.setLogList(dialoglist);
				diarylist.add(dq);
			}
			return diarylist;
		}
		return null;
	}

	@Override
	public List<DiarylogQueryVo> getDiaryLogList(Integer diaryId) {
		// TODO Auto-generated method stub
		DiarylogExample ex=new DiarylogExample();
		ex.setOrderByClause("log_date desc");
		com.garden.po.DiarylogExample.Criteria criteria=ex.createCriteria();
		criteria.andLogDiaryidEqualTo(diaryId);
		List<Diarylog> selectByExample = diarylogMapper.selectByExample(ex);
		List<DiarylogQueryVo> list=new ArrayList<>();
		for (int i = 0; i < selectByExample.size(); i++) {
			DiarylogQueryVo dialog=new DiarylogQueryVo();
			dialog.setDiarylog(selectByExample.get(i));
			if (selectByExample.get(i).getLogDate()!=null) {
				dialog.setMouth(selectByExample.get(i).getLogDate().getMonth()+1);
				dialog.setDay(selectByExample.get(i).getLogDate().getDate());
			}
			list.add(dialog);
		}
		return list;
	}

	@Override
	public DiaryQueryVo findDiary(Integer diaryId) {
		// TODO Auto-generated method stub
		
		Diary selectByPrimaryKey = diaryMapper.selectByPrimaryKey(diaryId);
		DiaryQueryVo dq=new DiaryQueryVo();
		dq.setDiary(selectByPrimaryKey);
		return dq;
	}

	@Override
	public DiaryQueryVo getDiaryVo(Integer id) {
		// TODO Auto-generated method stub
		Diary diary=diaryMapper.selectByPrimaryKey(id);
		DiaryQueryVo dvo=new DiaryQueryVo();
		dvo.setDiary(diary);
		return dvo;
	}
}
