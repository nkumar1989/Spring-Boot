package com.coursecube.springboot;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseServiceImpl implements CourseService {
	
		@Autowired
		CourseDAO courseDAO;
		
		@Override
		public void addCourse(Course mycourse) {
		System.out.println("CS-- addCourse()");
		courseDAO.save(mycourse);
		}
		
		@Override
		public void updateCourse(Course mycourse) {
		System.out.println("CS-- updateCourse()");
		courseDAO.saveAndFlush(mycourse);
		}
		
		@Override
		public void deleteCourse(Integer cid) {
		System.out.println("CS-- deleteCourse()");
		if(courseDAO.existsById(cid))
		courseDAO.deleteById(cid);
		}
		
		@Override
		public Course getCourseById(Integer cid) {
		System.out.println("CS-- getCourseById()");
		Course mycourse=courseDAO.findById(cid).get();
		return mycourse;
		}
		
		@Override
		public List<Course> getAllCourses() {
		System.out.println("CS-- getAllCourses()");
		return courseDAO.findAll();
		}
		
		@Override
		public List<Course> getCoursesByTrainer(String trainer) {
		System.out.println("CS-- getCoursesByTrainer()");
		return courseDAO.getCoursesByTrainer(trainer);
		}
		

		@Override
		public List<Course> getCoursesByCost(double cost) {
		System.out.println("CS-- getCoursesByCost()");
		return courseDAO.getCoursesByCost(cost);
		}
		
		@Override
		public Course getCoursesByCname(String cname) {
		System.out.println("CS-- getCoursesByCname()");
		return courseDAO.getCoursesByCname(cname);
		}
}