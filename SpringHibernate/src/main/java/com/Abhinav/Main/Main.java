package com.Abhinav.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Abhinav.Model.Course;
import com.Abhinav.Service.CourseService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		CourseService csvc = (CourseService)ctx.getBean(CourseService.class);
		
		Course c = new Course();
		c.setId(101);
		c.setName("Full stack developement");
		c.setCost(999.5);
		
		csvc.saveCourses(c);
	}

}
