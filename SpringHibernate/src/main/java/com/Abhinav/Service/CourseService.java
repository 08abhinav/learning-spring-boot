package com.Abhinav.Service;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.Abhinav.Model.Course;

public class CourseService {
	
	private HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public void saveCourses(Course course) {
		template.save(course);
		System.out.println("Saved successfully!");
	}
	
	public List<Course> getAll(){
		return template.loadAll(Course.class);
	}
}
