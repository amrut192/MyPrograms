package com.amrut.test;

public class Person {

	String f = "amrut";
		
	public static void main(String[] args) {
		Person p = new Person(); 
		System.out.println(p.f);
		Util.M1(p);
		System.out.println(p.f);

	}
}
class Util {
	public static void M1(Person p1){
		p1.f = "abc";
	}
}