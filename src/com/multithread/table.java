package com.multithread;

public class table {
	/*static*/ synchronized void printtable(int n) {
	for(int i=1;i<=n;i++) {
		System.out.println(i+"*"+n+"="+i*n);
	}
}
}
