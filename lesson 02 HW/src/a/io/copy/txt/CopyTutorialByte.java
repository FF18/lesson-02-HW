package a.io.copy.txt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTutorialByte {

	public static void main(String[] args) throws IOException  {

		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("c:/temp/input.txt");
		
		out = new FileOutputStream("c:/temp/output.txt");
		
		int c;
		while((c = in.read()) != -1) {
			out.write(c);
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
