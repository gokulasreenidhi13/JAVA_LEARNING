package com.file.handling;
import java.io.*;
public class basicfilefun {

    public static void main(String[] args) throws IOException {

        File file = new File("D:\\blabla\\");

        if(file.createNewFile()) {
            System.out.println("File Created");
        }
        else {
            System.out.println("Already Exists");
        }
        
        /*System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());*/
      
        
       /* System.out.println(file.delete());*/
        
        
}
}

