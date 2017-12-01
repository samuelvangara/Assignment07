package com.corejava.assignment7;
import java.io.BufferedReader;
import java.io.FileReader;

public class NumberOfWords {

	public static void main(String[] args) throws Exception {
		int count= 1;
FileReader a = new FileReader("F:\\arun.txt"); // read the file 
BufferedReader br = new BufferedReader (a);  
String l = br.readLine (); // stores the complete words in string l

 for(int i =0; i<l.length(); i++){
     char ch = l.charAt(i);
     if(Character.isWhitespace(ch))
     { 
    	 count++; 
     }
 }
 System.out.println("There are " + count +" words.");
}
}
