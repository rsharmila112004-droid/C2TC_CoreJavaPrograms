package com.tnsif.oops.encapsulation;

public class OopsConceptDemo {
		//var declaration or data members
		private int serialNum;
		private String name;//private can be accessed within the class only
		private int age;
		
		//getter and setter  
		public String getName() {//to get the var name
			return name;
		}
		public int getAge() {
			return age;
		}
		public int getSerialNum() {
			return serialNum;
			
		}
		public void setSerialNum(int serialNum) {
			this.serialNum = serialNum;
		}
		public void setName(String name) {  //to set the var name
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return"OopsConceptDemo [Serial Number = " + serialNum + "," + "name=" +name + ", age=" +age + "]";
		}

	

}
