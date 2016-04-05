package week04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UniversityEnrolmentSystem {

	public static void main(String args[]) {
		System.out.println("in main");
		
		System.out.println("main: getting line..");
		String s;
		try {
			s = readFirstLineFromFileWithFinallyBlock("test");
			System.out.println("main: s: " + s);
			System.out.println("done");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("caught Exception!");
			e.printStackTrace();
		
			// subclass FileNotFoundException has already been caught by the
			// above generic Exception 
//		} catch (FileNotFoundException e) {
//			System.out.println("caught FileNotFoundException!");
//			e.printStackTrace();
//			
		}
		
	}
	
	public static String readFirstLineFromFileWithFinallyBlock(String path)
			throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		try {
			System.out.println("try: returning br.readLine()");
			return br.readLine();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("finally: here");
			if (br != null) br.close();
		}
		return "hello there";
	}
}
