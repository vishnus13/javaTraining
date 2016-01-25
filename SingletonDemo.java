package com.test;

public class SingletonDemo {

	public static void main(String[] args) {

		SingleObject object = SingleObject.getInstance();

		object.showMessage();
		object.print("This is first message");
		object.print("This is second message");
	}
}

class SingleObject {

	private static SingleObject instance = new SingleObject();

	private SingleObject() {
	}

	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello ");

	}

	public void print(String str) {
		System.out.println(str);
	}
}