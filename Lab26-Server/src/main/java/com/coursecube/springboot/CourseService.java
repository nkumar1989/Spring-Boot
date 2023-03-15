package com.coursecube.springboot;

import java.util.List;


public interface CourseService {
	
		public void addCourse(Course mycourse);
		
		public void updateCourse(Course mycourse);
		
		public void deleteCourse(Integer cid);
		
		public Course getCourseById(Integer cid);
		
		public List<Course> getAllCourses();
		
		public List<Course> getCoursesByTrainer(String trainer);
		
		public List<Course> getCoursesByCost(double cost);
		
		public Course getCoursesByCname(String cname);
		
}
