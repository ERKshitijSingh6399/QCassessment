package com.app;

import java.util.Scanner;
import com.app.model.Student;

public class Main {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String name,email,city;
		long contact;
		int age;
		System.out.println("Student 1: Enter Name, Age, Email, City, ContactNo. -");
		name=s.nextLine();
		age=Integer.parseInt(s.nextLine());
		email=s.nextLine();
		city=s.nextLine();
		contact=Long.parseLong(s.nextLine());
		Student s1=new Student(name,age,email,city,contact);
		
		System.out.println("Student 2: Enter Name, Age, Email, City, ContactNo. -");
		name=s.nextLine();
		age=Integer.parseInt(s.nextLine());
		email=s.nextLine();
		city=s.nextLine();
		contact=Long.parseLong(s.nextLine());
		Student s2=new Student(name,age,email,city,contact);
//		Student s1=new Student("name1",10,"email1@g.com","city1",9988997789L);
//		Student s2=new Student("name2",12,"email2@g.com","city2",9172812727L);
		daolayer.ins(s1, s2);
		s.close();
	}

}
