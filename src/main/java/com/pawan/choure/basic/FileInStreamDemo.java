package com.pawan.choure.basic;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create file object
		File file = new File("DevFile.txt");

		int ch;
		StringBuffer strContent = new StringBuffer("");
		FileInputStream fin = null;

		try {
		fin = new FileInputStream(file);

		while ((ch = fin.read()) != -1)
		strContent.append((char) ch);

		fin.close();

		} catch (FileNotFoundException e) {
		System.out.println("File " + file.getAbsolutePath()
		+ " could not be found on filesystem");
		} catch (IOException ioe) {
		System.out.println("Exception while reading the file" + ioe);
		}

		System.out.println("File contents :");
		System.out.println(strContent);


	}

}
