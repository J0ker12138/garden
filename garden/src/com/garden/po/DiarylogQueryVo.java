package com.garden.po;

public class DiarylogQueryVo {
		private Diarylog diarylog;
		private Integer mouth;
		
		public Integer getMouth() {
			return mouth;
		}

		public void setMouth(Integer mouth) {
			this.mouth = mouth;
		}

		public Integer getDay() {
			return day;
		}

		public void setDay(Integer day) {
			this.day = day;
		}

		private Integer day;
		public Diarylog getDiarylog() {
			return diarylog;
		}

		public void setDiarylog(Diarylog diarylog) {
			this.diarylog = diarylog;
		}
}
