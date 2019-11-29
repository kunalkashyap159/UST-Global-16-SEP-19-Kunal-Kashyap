package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {
	public static void main(String[] args) {

		String path = "I:\\UST_Global_Training\\Adv.Java\\text.txt";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			int i;
			while((i=reader.read())!=-1) {
				System.out.print((char)i);
			}
			
//			int i1 = reader.read();
//			char ch1 = (char)i1;
//			System.out.println(ch1);
//			
//			int i2 = reader.read();
//			char ch2 = (char)i2;
//			System.out.println(ch2);
//			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//end of main()
}//end of FileReadingClass
