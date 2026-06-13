package com.prepinsta;
import java.util.*;
public class KSumNotInArray {
	public static void main(String[]args) {
  Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String[]arr=s.split(" ");

int []ans=new int[arr.length];

for(int i=0;i<ans.length;i++) {
	ans [i]=Integer.parseInt(arr[i]);
	}

int k=sc.nextInt();
int sum=0;
int count=0;
int i=1;

while(count<k) {
	
	boolean found =false;
	for(int j=0;j<ans.length;j++) {
		if(ans[j]==i) {
			found=true;
			break;
		}
	}
	
	if(found==false) {
		sum+=i;
		count++;
	}
	i++;
}
System.out.println(sum);
	}
	
}

