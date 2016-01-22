package com.test;

public class ExceptionTest {

	static void employeeAge(int age) throws MyOwnException {
		if (age < 0)
			throw new MyOwnException("Age can't be less than zero");
		else
			System.out.println("Input is valid!!");
	}

	public static void main(String[] args) {

		int a[] = new int[2];

		try {
			employeeAge(-2);                                     // User defined
			System.out.println("Access invalid element" + a[3]);// Array out of bounds Exception
		} catch (MyOwnException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally is always executed.");
		}

	}

}

/* user defined Exception */

class MyOwnException extends Exception {
	public MyOwnException(String msg) {
		super(msg);
	}
}
