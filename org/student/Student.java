package org.student;

import org.dept.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name: Mahiya");
	}

	public void studentDept() {
		System.out.println("CSE Department");
	}

	public void studentId() {
		System.out.println("Student ID: 212121");
	}

	public static void main(String[] args) {

		Student stud = new Student();
		stud.studentName();
		stud.studentId();
		stud.collegeName();
		stud.deptName();
	}

}
