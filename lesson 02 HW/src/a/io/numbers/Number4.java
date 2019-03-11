package a.io.numbers;

import java.io.FileWriter;
import java.io.IOException;

public class Number4 {

	// ARM: Auto Resource Management

	public static void main(String[] args) {
		// write text to file
		try (FileWriter out = new FileWriter("c:/temp/number4.txt"/*, true*/)) {
			// write numbers to file
			out.write( 2+ ","+ 54+ ","+ 75+ ","+ 16+ ","+ 32+ ","+ 5+ ","+ 8+ ","+ 18+ ","+ 25+ ","+ 60);
//			out.write(123 +"");
//			out.write(123 );
			out.write("\r\n");
			System.out.println("data written");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
