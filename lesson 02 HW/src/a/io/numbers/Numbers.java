package a.io.numbers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Numbers {

	public static void main(String[] args) {
		File file = new File("c:/temp/numers.txt");
		// write numbers to file
		int sou[] = { 2, 54, 75, 16, 32, 5, 8, 18, 25, 60 };

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {

			for (int i = 0; i < sou.length; i++) {
				out.writeObject(sou[i] + "");
//				out.write("\r\n");
			}
			System.out.println("Write numbers from array to file "+ file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
