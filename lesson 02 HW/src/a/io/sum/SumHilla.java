package a.io.sum;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SumHilla {

	public static void main(String[] args) {
		try {
			FileWriter out = new FileWriter("c:/temp/sum4.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		String sourceName = "c:/temp/sum4.txt";
		File source = new File(sourceName);
		int sum = 0;
		
//		try (FileWriter out = new FileWriter("c:/temp/sum4.txt")) {
		try (Scanner scan = new Scanner(source)) {
			while(sum > 0) {
				sum += scan.nextInt();
			}
		}catch(FileNotFoundException e1) {
			e1.printStackTrace();
		}
		System.out.println("Sum is: " + sum);
	}
	
}

	
//	public static void main(String[] args) {
//		File file = new File("C:/temp/sum4.txt");
//		System.out.println(file.exists());
//	}
//}