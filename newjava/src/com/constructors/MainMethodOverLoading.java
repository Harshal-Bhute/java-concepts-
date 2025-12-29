package com.constructors;
//how can we call other main methods

public class MainMethodOverLoading {

	public static void main(String[] args) {
		main(15);
		main(1.2f);
		main();
		main('a');

	}



static public void main(int[] args) {
	System.out.println("main accepting int argument");
}

static public void main(float d) {
	System.out.println("main accepting string input");
}

static public void main() {
	System.out.println("main accepting any argument");
}

static public void main(char a) {
	System.out.println("main is accepting char input");
}
}
