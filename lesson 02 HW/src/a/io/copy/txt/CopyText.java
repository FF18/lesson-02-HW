package a.io.copy.txt;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

public class CopyText {

	public static void main(String[] args) {
		
		File file = new File("c:/temp/copytext.txt");

		try (FileWriter out = new FileWriter(file, true)){
			
			out.write("c:/temp/forcopy.txt");

			out.write("\r\n");
			out.write("aaa bbb zz ccc");
			
			out.write("\r\n");
			
			System.out.println("yes, take data ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
