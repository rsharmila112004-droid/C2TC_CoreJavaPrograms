package com.tnsif.nonaccessmodifiers;

public class StaticDemo {
	static int count; //static variable
	
	//static block
	
	static {
		count = 20;
		System.out.println("shows the static" + "count assigned:" + count);
	}
	
	//static method
	static void show() {
		System.out.println("Methods runs in static" + "with count of:" + count);
			
	}
	public static void main(String[] args) {
		System.out.println("static in main" + "method:" +count);
		show();
	}

}
