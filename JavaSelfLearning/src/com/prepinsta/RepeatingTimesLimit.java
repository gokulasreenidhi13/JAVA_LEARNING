package com.prepinsta;
import java.util.*;
public class RepeatingTimesLimit {
  public static void main(String[]args) {
	  Scanner sc=new Scanner(System.in);
	  String s=sc.nextLine();
	  String[]arr=s.split(" ");
	  
	  int[]ans=new int[arr.length];
	  for(int i=0;i<ans.length;i++) {
		  ans[i]=Integer.parseInt(arr[i]);
	  }
	  
	  double value=ans.length/3;
	  for(int i=0;i<ans.length;i++) {
		  int count=0;
		  for(int j=i+1;j<ans.length;j++) {
			  if(ans[i]==ans[j]) {
				  count++;
			  }
		  }
	  
	  if(count>=value) {
	  System.out.print(ans[i]+" ");
	  }
	  }
  }
}
