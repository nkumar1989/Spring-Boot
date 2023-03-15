package com.coursecube.springboot;

import javax.persistence.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Entity
@Table(name = "mycourses")
@ApiModel(value="Contains Course Information - CourseId,CourseName,Cost,Duration,Trainer ")
public class Course {
	
		@Id
		@Column(name = "cid")
		@GeneratedValue(strategy = GenerationType.AUTO)
		@ApiModelProperty(value="Contains courseId Information")
		private int cid;
		
		@Column(name = "cname")
		@ApiModelProperty(value="Contains CourseName Information")
		private String cname;
		
		@Column(name = "cost")
		@ApiModelProperty(value="Contains Cost Information")
		private double cost;
		
		@Column(name = "duration")
		@ApiModelProperty(value="Contains Duration Information")
		private int duration;
		
		@Column(name = "trainer")
		@ApiModelProperty(value="Contains Trainer Information")
		private String trainer;
		

		public Course() {
		}
		
		public Course(String cname, double cost, int duration, String trainer) {
			
			this.cname = cname;
			this.cost = cost;
			this.duration = duration;
			this.trainer = trainer;
		}
		
		public Course(int cid, String cname, double cost, int duration, String trainer) {
			
			this.cid = cid;
			this.cname = cname;
			this.cost = cost;
			this.duration = duration;
			this.trainer = trainer;
		}

		
		public int getCid() {
					return cid;
				}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public String getTrainer() {
			return trainer;
		}

		public void setTrainer(String trainer) {
			this.trainer = trainer;
		}

		@Override
		public String toString() {
		return cid + "\t" + cname + "\t" + cost + "\t" + duration + "\t" + trainer;
		}
}
