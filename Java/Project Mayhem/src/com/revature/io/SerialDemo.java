package com.revature.io;

import com.revature.beans.Human;

public class SerialDemo {

	public static void main(String[] args) {
		IO io=new IO();
		
//write to string
		String a="banana";
		io.writeOutputStreamContents("Lady Gaga "+a+"\n"); //after running the program and creating the document, refresh the project to show the doc
		
////read from text document
//		System.out.println(io.readInputStreamContents());  //save in the project level file
		
//		Human h1 = new Human("Brad",822, 9);
//		Human h2 = new Human("JP",231, 4);
//		Human h3 = new Human("Tina",32, 566);
//		
//		IOWithCollections.humanList.add(h1);
//		IOWithCollections.humanList.add(h2);
//		IOWithCollections.humanList.add(h3);
//		
////write to the file first
//		//java makes sure not every object can be written to a file
//		//implement Serializable into human class first
//		IOWithCollections.writeHumnaFile();
//		//press f5 to refresh and display the file in the explorer
//		//file is a crazy mess for us to read, but java understands it.
		
//read from the file
//		takes crazy object text and converts it to readable text
		IOWithCollections.readHumanFile();
		System.out.println(IOWithCollections.humanList.toString());
		
		
	}

}
