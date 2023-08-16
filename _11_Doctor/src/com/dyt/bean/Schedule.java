package com.dyt.bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {
	private LocalDate today; // 当前是否看诊的日期
	private boolean update; // 是否修改过
	// 上午看诊
	private boolean morning; // 判断上午是否看诊
	private LocalTime mstart;
	private LocalTime mend;
	private int mTotalNumber; // 上午能够接诊的总人数
	private int mAppointNumbe; // 上午已经接诊的人数

	// 下午看诊
	private boolean afternoon; // 判断上午是否看诊
	private LocalTime astart;
	private LocalTime aend;
	private int aTotalNumber;
	private int aAppointNumbe;

	public LocalDate getToday() {
		return today;
	}

	public void setToday(LocalDate today) {
		this.today = today;
	}

	public boolean isMorning() {
		return morning;
	}

	public void setMorning(boolean morning) {
		this.morning = morning;
	}

	public LocalTime getMstart() {
		return mstart;
	}

	public void setMstart(LocalTime mstart) {
		this.mstart = mstart;
	}

	public LocalTime getMend() {
		return mend;
	}

	public void setMend(LocalTime mend) {
		this.mend = mend;
	}

	public int getmTotalNumber() {
		return mTotalNumber;
	}

	public void setmTotalNumber(int mTotalNumber) {
		this.mTotalNumber = mTotalNumber;
	}

	public int getmAppointNumbe() {
		return mAppointNumbe;
	}

	public void setmAppointNumbe(int mAppointNumbe) {
		this.mAppointNumbe = mAppointNumbe;
	}

	public boolean isAfternoon() {
		return afternoon;
	}

	public void setAfternoon(boolean afternoon) {
		this.afternoon = afternoon;
	}

	public LocalTime getAstart() {
		return astart;
	}

	public void setAstart(LocalTime astart) {
		this.astart = astart;
	}

	public LocalTime getAend() {
		return aend;
	}

	public void setAend(LocalTime aend) {
		this.aend = aend;
	}

	public int getaTotalNumber() {
		return aTotalNumber;
	}

	public void setaTotalNumber(int aTotalNumber) {
		this.aTotalNumber = aTotalNumber;
	}

	public int getaAppointNumbe() {
		return aAppointNumbe;
	}

	public void setaAppointNumbe(int aAppointNumbe) {
		this.aAppointNumbe = aAppointNumbe;
	}

	public boolean isUpdate() {
		return update;
	}

	public void setUpdate(boolean update) {
		this.update = update;
	}
}
