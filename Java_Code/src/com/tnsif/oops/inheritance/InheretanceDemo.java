package com.tnsif.oops.inheritance;
class A{
	void display(){
		System.out.println("Hello World");
	}
}
class B extends A{
	void show() {
		System.out.println("sri");
	}
	
}
class c extends  B{
	
}
public class InheretanceDemo {

	public static void main(String[] args) {
		B obj=new B();
		obj.show();
		obj.display();

	}

}
