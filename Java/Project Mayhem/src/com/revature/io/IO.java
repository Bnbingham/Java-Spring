package com.revature.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {
	private static final String outFile = "output.txt";  //project file is the origin
	private static final String inFile = "input.txt";
	/*
	 *Input and output
	 * when you write to a file it will create it if it is not there
	 * to read you must have the designated file
	 * writing will completely overwrite the contents of the document
	 * FileOutputStream(fileOutput, boolean) false it overwrites, true it adds to
	 * add next line with "\n"
	 * 
	*/
	public void writeOutputStreamContents(String contents) {
		OutputStream os =null;
		File file = new File(outFile); 		
		
		//Write method
		try {
			os = new FileOutputStream(file,true); //possibility this file does not exist
			os.write(contents.getBytes());  //possibility of other exceptions
		} catch (FileNotFoundException e) {  //want this exception first because its more specific
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(os!=null) { // outside of the original try/catch block to ensure that it is always closed
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
	
	//Read a string from a file
			public String readInputStreamContents() {
				InputStream is=null;
				File file = new File(inFile);
				StringBuilder s = new StringBuilder();
				
				try {
					is = new FileInputStream(file);
					int b=0;						//Reads the document one char at a time
					while((b=is.read())!=-1) {		//makes sure we ahven't reached the end of the file. Also added catch clause
						char c=(char)b;
						s.append(c);				//using string builder so you don't fill the string pool with 1string per char in the doc
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(is!=null) {
					try {
						is.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				return s.toString(); //stringBuilder to string 
				
			}
	
}
