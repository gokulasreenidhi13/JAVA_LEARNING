package com.file.handling;
import java.io.*;
public class filewriter {
 public static void main(String[] args) throws IOException {
	 FileWriter w = new FileWriter("D:\\blabla",false);
	 w.write("HELLO GIRL!\n");
	 w.write("lalalala\n");
	 w.write("WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOW");
w.close();
 }
}
