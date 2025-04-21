package com.StudentApp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	/**
	 * @param name
	 * @param age
	 * @param studentId
	 */
	Student(String name, int age, String studentId) {
		super();
		if(validateAge(age) && validateName(name) && validateStudentId(studentId)) {
			this.name = name;
			this.age = age;
			this.studentId = studentId;
			courses =  new ArrayList<String>();
		}
	}



	private String name;
	private int age;
	private String studentId;
	private List<String> courses;



	public void enrollCourse(String course) {
		if(validateCourse(course)) {
			if(!courses.contains(course)) {
				courses.add(course);
				System.out.println("Student enroll to course "+ course + " successfully!");	
			} else
				System.err.println("Student is already enrolled in the course "+ course);
		}

	}

	public void printStudentInfo() {
		System.out.println("========== Student information ===========");
		System.out.println("Student name : " + name);
		System.out.println("Student age : " + age);
		System.out.println("Student name :" + studentId);
		System.out.println("Student enroll in :" + courses);
	}

	public boolean validateAge(int age) {
		if(age < 19 || age > 35) {
			System.out.println("Invalid age, student age should be between 19 and 35");
			return false;
		}
		return true;
	}


	public boolean validateName(String name) {
		String nameRegex = "[a-zA-z\\s]+$";
		Pattern namePattern =  Pattern.compile(nameRegex);
		Matcher nameMatcher = namePattern.matcher(name);
		if(nameMatcher.matches()) {
			return true;
		}
		else {
			System.out.println("Invalid name! please enter alphabets only.");
			return false;
		}
	}


	public boolean validateStudentId(String studentId) {
		String studentRegex = "S-[\\d]+$";
		Pattern studentIdPattern = Pattern.compile(studentRegex);
		Matcher sIdMatcher = studentIdPattern.matcher(studentId);
		if(sIdMatcher.matches())
			return true;
		else {
			System.out.println("Invalid studentId! please follow S-Integer pattern");
			return false;
		}
	}

	public boolean validateCourse(String course) {
		if(course.equalsIgnoreCase("java") || course.equalsIgnoreCase("dsa") || course.equalsIgnoreCase("Selenium")) {
			return true;
		}else {
			System.err.println("Invalid course! please select a course [Java, DSA, Selenium]");
			return false;
		}

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getStudentId() {
		return studentId;
	}

	public List<String> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + ", courses=" + courses + "]";
	}



}
