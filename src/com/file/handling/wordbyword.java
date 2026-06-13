package com.file.handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class wordbyword {
	public static void main(String[]args) throws IOException {
		BufferedReader bff= new BufferedReader(new FileReader("D:\\blabla"));
		String l;
		while((l=bff.readLine())!=null) {
			String[]word=l.split(" ");
			for(String w:word) {
				System.out.println(w);
			}
			
		}
		bff.close();
}
	}