package a.io.txt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadText2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		try (FileWriter out = new FileWriter("c:/temp/letterHW.txt", true)) {

			out.write("Text file");

			System.out.println("Please write word");
			String str = scan.next();

			out.write("\r\n");
			out.write(str);
			out.write("\r\n");

			System.out.println("Data Written");
			System.out.println("Print quit to quit");

			str = scan.next();

			out.write(str);
			out.write("\r\n");
			out.write("I quit from file");

			System.out.println("I quit from file");
			out.write("\r\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
