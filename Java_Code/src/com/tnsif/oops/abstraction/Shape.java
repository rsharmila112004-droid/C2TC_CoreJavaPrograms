package com.tnsif.oops.abstraction;

public abstract class Shape {
 protected float area; // 10.9f //datatype declaration
     
     //abstract method 
	 abstract void calArea(); // return
	 
	 //concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }

}
