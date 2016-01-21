package com.test;

class Parent {
	Parent() {
		System.out.println("parent class constructor");
	}

	public void disp(String s) {
		System.out.println("This method prints a string " + s);
	}

	public void disp(String s, int i) {
		System.out.println("this method has a string " + s + "and " + i);

	}

	public void disp(String s, int i, char c) {
		System.out.println("this method has a String " + s + "integer " + i
				+ "character " + c);
	}

	void mul(float a, float b) {
		System.out.println("parent class" + (a * b));
	}
}

class Child extends Parent {
	public void disp(String s, int i) {
		System.out.println("This method prints a string " + s);
	}

	void mul(float a, float b) {
		System.out.println("child class" + (a * b));
	}

	Child() {
		System.out.println("child constructor");
	}

	Child(int a) {
		System.out.println("child constructor param " + a);// Constructor Overloading
	}
}

public class MainClass extends Child {

	public static void main(String[] args) {
		Parent parentObj = new Child();// child class instance in base class
										// reference
		Child obj = new Child(10);// own instance
		obj.disp("Ram");// different method signature
		obj.disp("Ram Age", 20, 'M');// different method signature
		obj.disp("Ram", 3);// different method signature
		parentObj.disp("Sita");
		parentObj.disp("sita", 22);
		parentObj.mul(12, 10);// auto type conversion)
		obj.mul(14.9F, 15.8F);
	}

}
