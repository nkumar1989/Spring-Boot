package com.coursecube.springboot;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/myapi")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	

	@ApiOperation(value = " Adds Course Information",response = void.class,notes = "Adds Course Information" )
	@PostMapping("/addCourse")
	public void addCourse(@RequestBody Course mycourse) {
		
		System.out.println("CC--addCourse()");
		courseService.addCourse(mycourse);
	}
	
		@ApiOperation(value = " Updates Course Information",response = void.class,notes = "Updates Course Information" )
		@PutMapping("/updateCourse")
		public void updateCourse(@RequestBody Course mycourse) {
			
			System.out.println("CC--updateCourse()");
			courseService.updateCourse(mycourse);
		}
		
		@ApiOperation(value = " Deletes Course Information",response = void.class,notes = "Deletes Course Information" )
		@DeleteMapping("/deleteCourse/{cid}")
		public void deleteCourse(@PathVariable Integer cid) {
			
				System.out.println("CC--deleteCourse()");
				courseService.deleteCourse(cid);
		}
		
		@ApiOperation(value = " Returns Course Information By Course Id",response = Course.class,notes = " Returns Course Information By Course Id" )
		@GetMapping("/mycourse/cid/{cid}")
		public Course getCourseById(@PathVariable Integer cid) {
			
				System.out.println("CC--getCourseById()");
				return courseService.getCourseById(cid);
		}
		
		@ApiOperation(value = " Returns All the Courses Information ",response = List.class,notes = " Returns All the Courses Information " )
		@GetMapping("/mycourses")
		public List<Course> getAllCourses() {
			
			System.out.println("CC--getAllCourses()");
			return courseService.getAllCourses();
		}
		
		@ApiOperation(value = " Returns Course Information By Trainer Name",response = List.class,notes = " Returns Course Information By Trainer Name" )
		@GetMapping("/mycourse/trainer/{trainer}")
		public List<Course> getCoursesByTrainer(@PathVariable String trainer) {
			
				System.out.println("CC--getCoursesByTrainer()");
				return courseService.getCoursesByTrainer(trainer);
		}

		@ApiOperation(value = " Returns Course Information By Cost",response = List.class,notes = " Returns Course Information By Cost" )
		@GetMapping("/mycourse/cost/{cost}")
		public List<Course> getCoursesByCost(@PathVariable double cost) {
			
				System.out.println("CC--getCoursesByCost()");
				return courseService.getCoursesByCost(cost);
		}
		
		@ApiOperation(value = " Returns Course Information By Course Name",response = Course.class,notes = " Returns Course Information By Course Name" )
		@GetMapping("/mycourse/cname/{cname}")
		public Course getCoursesByCname(@PathVariable String cname) {
			
				System.out.println("CC--getCoursesByCname()");
				return courseService.getCoursesByCname(cname);
		}
}
