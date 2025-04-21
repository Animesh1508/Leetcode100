package com.StudentApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

	private static List<Student> studentList = new ArrayList<Student>();
	
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
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		System.out.println(studentList);
		
		
		Student searchResult = findStudentById("S-2433");
		System.out.println("Student search result: " + searchResult);
		
		sortByName();
	}
	
	private static void sortByName() {
		Comparator<Student> studentnameComparator = new Comparator<Student>() {


			@Override
			public int compare(Student o1, Student o2) {
				
				
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		Collections.sort(studentList, studentnameComparator);
		System.out.println(studentList);
		
	}

	public static Student findStudentById(String studentId) {
		Student searchResult = null;
		try {
		 searchResult =  studentList.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId)).findFirst()
		.orElseThrow(() -> new RuntimeException("No data found!!"));
		}
		catch(RuntimeException e) {
			System.err.println("Student with ID" + studentId + "not found!!");
		}
		
		return searchResult;
		
	}


}
