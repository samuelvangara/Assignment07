package com.corejava.assignment7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileReader a = new FileReader("F:\\arun.txt"); // read the file 
			BufferedReader br = new BufferedReader (a);  
			String l = br.readLine ();
			System.out.println(l.replaceAll("hi", "hello"));
			br.close();
	} catch (IOException e){
		e.printStackTrace();
	}
}
}