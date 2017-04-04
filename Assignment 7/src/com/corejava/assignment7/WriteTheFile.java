package com.corejava.assignment7;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class WriteTheFile {
	public static void main(String[] args)
	{
		try{
			String content = " Hello write this in to the file";
		    File file = new File("F:\\arun.txt");
		    FileWriter fw = new FileWriter(file);
		    BufferedWriter bw= new BufferedWriter(fw);
		    bw.write(content);
		    bw.close();
		}
		catch (IOException e)
		{
 e.printStackTrace();
		}
	}
}
