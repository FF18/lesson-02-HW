package a.io.sum;

import java.io.FileWriter;
import java.io.IOException;

public class Sum {

	// program read numbers and print to file sum

	public static void main(String[] args) {
		// write text to file
		try (FileWriter out = new FileWriter("c:/temp/sum.txt"/*, true*/)) {
			int sum = 0;
			for(int i=0; i<10; i++) {
				sum = sum + i;
			} // sum numbers from 0 to 9
			out.write(sum +"");
			out.write("\r\n");
			System.out.println("Sum numbers written to file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
