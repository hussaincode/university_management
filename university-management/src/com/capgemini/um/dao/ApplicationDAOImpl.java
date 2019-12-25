package com.capgemini.um.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.capgemini.um.beans.ApplicationBean;

public class ApplicationDAOImpl implements ApplicationDAO {
	ApplicationBean applicationBean = new ApplicationBean();

	private static List<ApplicationBean> applicationsList;
	static {
		applicationsList = new ArrayList<ApplicationBean>();
		ApplicationBean applicationBean = new ApplicationBean();
		Random random = new Random();
		applicationBean.setApplicationId(random.nextInt());
		applicationBean.setFullName("Nazia");
		applicationBean.setCourseId(101);
		applicationBean.setDob("11/12/1997");
		applicationBean.setHqualification("Be");
		applicationBean.setMarksObtained(72.25);
		applicationBean.setGoals("CTO");
		applicationBean.setEmailId("nazia143@saddam.com");
		applicationsList.add(applicationBean);

	}

	@Override
	public void setApplication() {
		ApplicationBean applicationBean = new ApplicationBean();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Full Name");
		applicationBean.setFullName(sc.nextLine());
		System.out.println("Enter Your Date of Birth");
		applicationBean.setDob(sc.nextLine());
		System.out.println("Enter Your Highest Qualification");
		applicationBean.setHqualification(sc.nextLine());
		System.out.println("Enter Marks Obtained");
		applicationBean.setMarksObtained(sc.nextDouble());
		System.out.println("Enter Your Goals");
		applicationBean.setGoals(sc.next());
		System.out.println("Enter Your Email ID");
		applicationBean.setEmailId(sc.next());
		applicationBean.setStatus("Applied");
		applicationBean.setApplicationId(new Random().nextInt(1000));
		applicationBean.setCourseId(applicationBean.getCourseId());

		applicationsList.add(applicationBean);
		System.out.println("*****Thanx for applying for this course*****");

	}// End of setApplication

	@Override
	public List<ApplicationBean> getApplication() {

		return applicationsList;
	}// End of getApplication

	public void check() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ApplicationId");
		int appId = sc.nextInt();

		String status;

		Iterator<ApplicationBean> it = applicationsList.iterator();

		while (it.hasNext()) {
			ApplicationBean app = it.next();
			if (app.getApplicationId() == appId) {
				System.out.println("1: Accept");
				System.out.println("2: Reject");
				int res = sc.nextInt();
				if (res == 1) {
					status = "Accepted";
					System.out.println(status);
					app.setStatus("Accepted");

				} else if (res == 2) {
					status = "Rejected";
					System.out.println(status);
					app.setStatus("Rejected");
				}
			}

		}
		// TODO Auto-generated method stub

	}

	public void view() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ApplicationId");
		int appId = sc.nextInt();

		// TODO Auto-generated method stub
		Iterator<ApplicationBean> it = applicationsList.iterator();

		while (it.hasNext()) {
			ApplicationBean app = it.next();
			if (app.getApplicationId() == appId) {
				System.out.println(app.getStatus());
				if(app.getStatus()=="Accepted") {
					app.setDoi("Date of Interview- 11/dec/2019");
					System.out.println(app.getDoi());
				}else if(app.getStatus()=="Rejected") {
					System.out.println("Rejeced! Thanku for applying");
				}
			}
		}
	}
}// End of class