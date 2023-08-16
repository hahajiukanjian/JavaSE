package com.dyt.frame;

import com.dyt.bean.Appointment;
import com.dyt.bean.Department;
import com.dyt.bean.Doctor;
import com.dyt.bean.Schedule;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.UUID;

public class HospitalManager {
	// 1、系统需要存储全部科室信息
	private ArrayList<Department> allDepartments = new ArrayList<>();
	// 2、系统需要记录全部的预约信息
	private ArrayList<Appointment> appointments = new ArrayList<>();

	private Scanner sc = new Scanner(System.in);

	public void start() {
		while (true) {
			System.out.println("====欢迎进入仁爱医院信息管理系统====");
			System.out.println("1、科室管理-添加科室");
			System.out.println("2、科室管理-删除科室");
			System.out.println("3、科室管理-修改科室");
			System.out.println("4、医生管理-录入医生");
			System.out.println("5、医生管理-医生坐诊设置(可设置当天和未来6天的坐诊情况)");
			System.out.println("6、医生管理-展示全部医生的坐诊详情(当前和未来6天的坐诊详情)");
			System.out.println("7、医生管理-挂号预约");
			System.out.println("8、搜索某个医生当前和未来6天内的病人预约详情(展示每天预约病人的具体信息)");
			System.out.print("请输入操作命令：");

			switch (sc.next()) {
				case "1" :
					addDepartment();
					break;
				case "2" :
					break;
				case "3" :
					break;
				case "4" :
					addDoctor();
					break;
				case "5" :
					setDoctorJob();
					break;
				case "6" :
					showAllDoctorInfos();
					break;
				case "7" :
					break;
				case "8" :
					break;
				default:

			}
		}
	}

	/**
	 * 1、科室管理-添加科室
	 */
	private void addDepartment() {
		System.out.println("====添加科室====");
		OUT:
		while (true) {
			System.out.print("请您输入科室的名称：");
			String name = sc.next();
			// 判断科室名是否存在
			for (int ii = 0; ii < allDepartments.size(); ii++) {
				Department department = allDepartments.get(ii);
				if (Objects.equals(department.getName(), name)) continue OUT;
			}
			Department department = new Department();
			department.setName(name);
			allDepartments.add(department);
			System.out.println("添加科室成功！");
			break;
		}
	}

	/**
	 * 4、医生管理-录入医生
	 */
	private void addDoctor() {
		System.out.println("====录入医生====");

		Doctor doctor = new Doctor();
		Department department = getDepartmentByCommand();
		if (department == null) {
			System.out.println("当前没有科室，无法录入医生！");
			return;
		}
//		while (true) {
//			// 1、选择科室
//			System.out.println("请选择科室");
//			for (int ii = 0; ii < allDepartments.size(); ii++) {
//				Department department = allDepartments.get(ii);
//				System.out.println((ii + 1) + "、" + department.getName());
//			}
//
//			// 2、接受命令
//			System.out.print("请输入");
//			int command = sc.nextInt();
//			if (command < 1 || command > allDepartments.size()) {
//				System.out.println("选择有误，请重新选择");
//				continue;
//			}
//			// 3、得到科室
//			Department department = allDepartments.get(command - 1);
		 doctor.setDepartmentName(department.getName());

		 // 4、录入医生ID
		 doctor.setDoctorId(UUID.randomUUID().toString());

		 // 5、录入医生基本信息
		 System.out.print("请输入医生姓名：");
		 String name = sc.next();
		 doctor.setName(name);

		 System.out.print("请输入医生性别：");
		 String gender = sc.next();
		 doctor.setGender(gender);

		 System.out.print("请输入医生年龄：");
		 int age = sc.nextInt();
		 doctor.setAge(age);

		 System.out.print("请输入医生主治方向：");
		 String specialty = sc.next();
		 doctor.setSpecialty(specialty);

		 System.out.print("请输入医生入职日期(格式：yyyy-MM-dd)：");
		 String joinDateString = sc.next();
		 LocalDate joinDate = LocalDate.parse(joinDateString);
		 doctor.setJoinDate(joinDate);

		 department.getDoctors().add(doctor);
	}

	/**
	 * 5、设置医生坐诊信息
	 */
	private void setDoctorJob() {
		System.out.println("====医生坐诊设置====");
		Department department = getDepartmentByCommand();
		if (department == null) {
			System.out.println("系统当前无科室可供选择！");
			return;
		}

		// 1、选择医生
		ArrayList<Doctor> doctors = department.getDoctors();
		if (doctors.size() == 0) {
			System.out.println("当前科室没有医生！");
			return;
		}

		while (true) {
			System.out.println("当前科室的医生如下：");
			for (int ii = 0; ii < doctors.size(); ii++) {
				Doctor doctor = doctors.get(ii);
				System.out.println((ii + 1) + "、" + doctor.getName());
			}
			System.out.print("请输入：");

			// 2、接受命令
			int command = sc.nextInt();
			if (command < 1 || command > doctors.size()) {
				System.out.println("选择有误，请重新选择！");
				continue;
			}
			Doctor doctor = doctors.get(command - 1);
			// 3、设置医生未来七天坐诊情况
			/*
			  此时schedules中并没有任何Schedule的实例对象
			  我们的业务是需要7天的安排
			  因此需要在集合schedules中添加7个Schedule实例对象
			  使用updateSchedules(schedules);
			 */
			ArrayList<Schedule> schedules = doctor.getSchedules();
			updateSchedules(schedules); // 更新未来七天的时间

			// 4、修改坐诊信息，依次展示这个医生的坐诊详情
			for (int ii = 0; ii < schedules.size(); ii++) {
				Schedule schedule = schedules.get(ii);
				updateDoctorSchedule(schedule);
			}
			break;
		}
	}

	/**
	 * 6、显示医院全部医生的排班信息
	 */
	private void showAllDoctorInfos() {
		System.out.println("====全部医生的坐诊信息如下====");
		// 遍历全部的科室
		for (int ii1 = 0; ii1 < allDepartments.size(); ii1++) {
			Department department = allDepartments.get(ii1);
			System.out.println((ii1 + 1) + department.getName());
			System.out.println("----------------------------------------");
			// 遍历科室中医生集合
			for (int ii2 = 0; ii2 < department.getDoctors().size(); ii2++) {
				Doctor doctor = department.getDoctors().get(ii2);
				System.out.println(doctor.getName() + "医生的坐班信息如下");
				ArrayList<Schedule> schedules = doctor.getSchedules();
				updateSchedules(schedules);
				for (int ii3 = 0; ii3 < schedules.size(); ii3++) {
					Schedule schedule = schedules.get(ii3);
					System.out.println(schedule.getToday());
					if (!schedule.isUpdate()) {
						System.out.println("未排班\t\t\t");
						continue;
					}
					System.out.println("\t上午\t");
					if (schedule.isMorning()) {
						System.out.println("坐诊时间为：" + schedule.getMstart() + "-" + schedule.getMend());
						System.out.println("总数/预约数：" + schedule.getmTotalNumber() + "/" + schedule.getmAppointNumbe());
					} else System.out.println("休息");
					System.out.println();
					System.out.println("\t下午\t");
					if (schedule.isMorning()) {
						System.out.println("坐诊时间为：" + schedule.getMstart() + "-" + schedule.getMend());
						System.out.println("总数/预约数：" + schedule.getmTotalNumber() + "/" + schedule.getmAppointNumbe());
					} else System.out.println("休息");
				}
			}
		}
	}

	/**
	 * @Desc 通过用户在界面上输入的命令，获取科室
	 * @return Department
	 */
	private Department getDepartmentByCommand() {
		if (allDepartments.isEmpty())
			return null;

		while (true) {
			// 选择科室
			System.out.println("请选择科室");
			for (int ii = 0; ii < allDepartments.size(); ii++) {
				Department department = allDepartments.get(ii);
				System.out.println((ii + 1) + "、" + department.getName());
			}

			// 接受命令
			System.out.print("请输入：");
			int command = sc.nextInt();
			if (command < 1 || command > allDepartments.size()) {
				System.out.println("选择有误，请重新选择");
				continue;
			}
			// 得到科室，返回科室
			Department department = allDepartments.get(command - 1);
			return department;
		}
	}

	/**
	 * 修改当前医生的排班
	 * 修改schedules集合中每一个Schedule对象的信息
	 * @param schedule
	 */
	private void updateDoctorSchedule(Schedule schedule) {
		LocalDate today = schedule.getToday();
		System.out.println(today + "的安排如下：");
		if (!schedule.isUpdate()) {
			System.out.println("未排班");
		} else {
			// 排班的信息（上午 和 下午）
			System.out.print("\t上午\t");
			if (schedule.isMorning()) {
				System.out.println();
				System.out.println("坐诊时间为：" + schedule.getMstart() + "-" + schedule.getMend());
				System.out.println("总数/预约数：" + schedule.getmTotalNumber() + "/" + schedule.getmAppointNumbe());
			} else System.out.println("休息");
			System.out.println();
			System.out.print("\t下午\t");
			if (schedule.isMorning()) {
				System.out.println();
				System.out.println("坐诊时间为：" + schedule.getMstart() + "-" + schedule.getMend());
				System.out.println("总数/预约数：" + schedule.getmTotalNumber() + "/" + schedule.getmAppointNumbe());
			} else System.out.println("休息");
		}
		System.out.print("是否修改排班(y/n)：");
		String rs = sc.next();
		if ("y".equals(rs) || "Y".equals(rs)) {
			schedule.setUpdate(true);

			System.out.print("上午是否看诊(y/n)：");
			String moring = sc.next();
			if ("y".equals(moring) || "Y".equals(moring)) {
				System.out.println("输入开始看诊时间和结束看诊时间：");
				String start = sc.next();
				String end = sc.next();
				System.out.print("输入上午能够看诊的总人数：");
				int totalNumber = sc.nextInt();

				schedule.setMorning(true);
				schedule.setMstart(LocalTime.parse(start));
				schedule.setMend(LocalTime.parse(end));
				schedule.setmTotalNumber(totalNumber);
			} else schedule.setMorning(false);

			System.out.print("下午是否看诊(y/n)：");
			String afternoon = sc.next();
			if ("y".equals(afternoon) || "Y".equals(afternoon)) {
				System.out.println("输入开始看诊时间和结束看诊时间：");
				String start = sc.next();
				String end = sc.next();
				System.out.print("输入上午能够看诊的总人数：");
				int totalNumber = sc.nextInt();

				schedule.setAfternoon(true);
				schedule.setAstart(LocalTime.parse(start));
				schedule.setAend(LocalTime.parse(end));
				schedule.setaTotalNumber(totalNumber);
			} else schedule.setAfternoon(false);
		}
	}

	/**
	 * 修改医生的排班情况
	 * 在Doctor的schedules集合中添加7个Schedule对象
	 * @param schedules
	 */
	private void updateSchedules(ArrayList<Schedule> schedules) {
		// 如果当前集合为空，创建7个空的Schedule对象填入集合当中
		if (schedules.isEmpty()) {
			for (int ii = 0; ii < 6; ii++) {
				Schedule schedule = new Schedule();
				LocalDate now = LocalDate.now();
//				这样写不行，now不是long数据类型的
//				schedule.setToday(schedule.getToday().plusDays(now + ii));
				schedule.setToday(now.plusDays(ii));
				schedules.add(schedule);
			}
			return;
		}

		// 如果集合当中的对象时间相较于当前时间已过期，把过期的对象从集合中删除
		int size = schedules.size();
		for (int ii = 0; ii < size; ii++) {
			Schedule schedule = schedules.get(ii);
			LocalDate now = LocalDate.now();
			LocalDate schDate = schedule.getToday();
			if (now.equals(schDate)) break;
			else if (now.isAfter(schDate)) {
				schedules.remove(schedule);
				ii--;
			}
		}

		// 如果集合中的对象不满7个(即：医生的坐诊时间不满7天)，将剩下的部分用空Schedule对象填充
		// 获取现在集合中最后一个对象的时间
		LocalDate last = schedules.get(schedules.size() - 1).getToday();
		size = schedules.size();
		for (int ii = 0; ii < (6 - size); ii++) {
			// 创建Schedule对象，将last+ii赋值给新创建的对象中的时间上
			Schedule schedule = new Schedule();
			schedule.setToday(last.plusDays(ii + 1));
			schedules.add(schedule);
		}
	}

}