package car;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CarRead {

	public static void main(String[] args) {

		// read text from file
		try (BufferedReader in = new BufferedReader(new FileReader("c:/temp/car.txt"))) {
			String line = in.readLine(); // read the first line
			while (line != null) {
				System.out.println(line);
				line = in.readLine(); // read the next line
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
