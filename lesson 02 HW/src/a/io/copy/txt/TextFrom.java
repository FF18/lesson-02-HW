package a.io.copy.txt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFrom {

	public static void main(String[] args) {
		
		File file =new File("c:/temp/forcopy.txt");
		try (FileWriter out = new FileWriter(file, true)){
			
			out.write("you so nice");
			out.write("\r\n");
			System.out.println("data written to " + file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
