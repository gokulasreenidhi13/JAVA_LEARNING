package com.collection;
import java .util.*;

public class arrylist {

	public static void main(String[]args) {
		ArrayList<String> list=new ArrayList<>();
list.add("hello");
list.add("world");
list.add(null);
list.add("hello");
list.add("java");

System.out.println(list);
	
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.set(i)+" ");
	}
	System.out.println();
	}

