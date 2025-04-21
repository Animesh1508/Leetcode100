package com.StudentApp;

import java.util.ArrayList;
import java.util.List;

public class Main {

	//private static List<Student> studentList = new ArrayList<Student>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************************** Student Management System ******************************");
	
		Student s1,s2,s3;
		s1 = new Student("Animesh", 26 , "S-189");
		//s1.printStudentInfo();
		s1.enrollCourse("javac");
		s1.enrollCourse("java");
		System.out.println(s1);
		s1.printStudentInfo();
		
		
		s2 = new Student("devesh", 29 , "S-221");
		s2.enrollCourse("seleniUm");
		System.out.println(s2);
		
		s3 = new Student("mukul", 29 , "S-243");
		s3.enrollCourse("dsa");
		System.out.println(s3);
		
	}


}
