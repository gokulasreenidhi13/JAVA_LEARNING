package com.file.handling;
import java.io.*;
public class bffreader {
	public static void main(String[]args) throws IOException {
		BufferedReader bff= new BufferedReader(new FileReader("D:\\blabla"));
		String l;
		while((l=bff.readLine())!=null) {
			System.out.println(l);
		}
		bff.close();
	}

}
