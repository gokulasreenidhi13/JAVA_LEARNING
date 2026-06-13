package com.file.handling;
import java.io.*;
public class filereader {
	public static void main(String[]args) throws IOException {

	
FileReader r=new FileReader("D:\\blabla");
int ch;
while((ch=r.read())!=-1) {
	System.out.println((char)ch);
}
	}
}
