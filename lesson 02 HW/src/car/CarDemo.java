package car;

import java.io.FileWriter;
import java.io.IOException;

public class CarDemo {

	public static void main(String[] args) {
		try (FileWriter out = new FileWriter("c:/temp/car.txt")) {

			Skoda skoda = new Skoda(0, null, 0);
			skoda.setNum(1214);
			skoda.setColor("white");
			skoda.setSpeed(100);

			out.write("skoda number: " + skoda.getNum() + ", color: "
			+ skoda.getColor() + ", speed: " + skoda.getSpeed());
			out.write("\r\n");
			System.out.println("skoda number: " + skoda.getNum() + ", color: "
			+ skoda.getColor() + ", speed: " + skoda.getSpeed());
			
			
			
			Hyundai hyundai = new Hyundai(0, null, 0);
			hyundai.setNum(1014);
			hyundai.setColor("grey");
			hyundai.setSpeed(95);

			out.write("hyundai number: " + hyundai.getNum() + ", color: "
			+ hyundai.getColor() + ", speed: " + hyundai.getSpeed());
			out.write("\r\n");
			System.out.println("hyundai number: " + hyundai.getNum() + ", color: "
			+ hyundai.getColor() + ", speed: " + hyundai.getSpeed());
			
			
			
			Honda honda = new Honda(0, null, 0);
			honda.setNum(2214);
			honda.setColor("blue");
			honda.setSpeed(105);

			out.write("honda number: " + honda.getNum() + ", color: "
			+ honda.getColor() + ", speed: " + honda.getSpeed());
			out.write("\r\n");
			System.out.println("honda number: " + honda.getNum() + ", color: "
			+ honda.getColor() + ", speed: " + honda.getSpeed());
			
			
			
			Porsche porsche = new Porsche(0, null, 0);
			porsche.setNum(5214);
			porsche.setColor("red");
			porsche.setSpeed(150);

			out.write("porsche number: " + porsche.getNum() + ", color: "
			+ porsche.getColor() + ", speed: " + porsche.getSpeed());
			out.write("\r\n");
			System.out.println("porsche number: " + porsche.getNum() + ", color: "
			+ porsche.getColor() + ", speed: " + porsche.getSpeed());
			
			
			
			Toyota toyota = new Toyota(0, null, 0);
			toyota.setNum(3214);
			toyota.setColor("beige");
			toyota.setSpeed(110);

			out.write("toyota number: " + toyota.getNum() + ", color: "
			+ toyota.getColor() + ", speed: " + toyota.getSpeed());
			out.write("\r\n");
			System.out.println("toyota number: " + toyota.getNum() + ", color: "
			+ toyota.getColor() + ", speed: " + toyota.getSpeed());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
