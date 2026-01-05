package com.day22_Exception;

public class StackOverflowError {

	public static void main(String[] args) {
	disp();
	}
	static void disp() {
		System.out.println("hello");
		disp();
	}

}

//=======================================ERROR HANDLED=============================================
/*
package com.day22_Exception;

public class StackOverflowError {

	public static void main(String[] args) {
	disp();
	}
	static void disp() {
		System.out.println("heloo from disp");
		try {
			disp();
		} catch (Error e) {
			System.out.println("error handled");
		}
	}

}
*/