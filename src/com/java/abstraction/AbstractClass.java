package com.java.abstraction;

public abstract class AbstractClass {
  
	public AbstractClass() {
		System.out.println("Inside AbstractClass Constructor");
		
	}
	
void print() {
	System.out.println("Inside Print method in AbstructClass");
}

	public abstract void display();
	public static void main(String[]args) {
		AbstractChildClass sb=new AbstractChildClass;
		sb.display();
		sb.print();
		sb.show();
		result();
	}
  
}
