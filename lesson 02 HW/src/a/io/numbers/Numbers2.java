package a.io.numbers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Numbers2 {

	public static void main(String[] args) {
		File file = new File("c:/temp/numers2.txt");
		

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {

			for (int i = 0; i < 10; i++) {
				out.write(i);
//				out.write("\r\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
