package com.collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class HashSetClass {

	public static void main(String[] args) {
		int []arr= {1,1,2,2,3,4,4,5,6,6};
		
		HashSet /*LinkedHashSet*/ /*TreeSet*/<Integer> s=new HashSet<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }

        System.out.println(s);
		
  /*  s.add(1);
    s.add(2);
    s.add(3);
    s.add(null);
    s.add(null);
    
    System.out.println(s);*/
	}

}
