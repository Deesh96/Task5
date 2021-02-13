package ISL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FootBall1 {
	public static void main(String args[]) {
		readAndWrite();
		
	}
	public static void readAndWrite() {
		List<ISLMain> table = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("points_table1.csv"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(",");
		        table.add(new ISLMain(Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3]),Integer.parseInt(values[4]),Integer.parseInt(values[5]),Integer.parseInt(values[6])));
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		table.forEach(x -> System.out.println(x));
		
		try {
		      FileWriter writer = new FileWriter("football1.txt");
		      table.forEach(x -> {
				try {
					writer.write(x + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		      writer.close();
		      System.out.println("Created : football.txt and updated it.");
		    } catch (IOException e) {
		      System.out.println("An exception occurred.");
		      e.printStackTrace();
		    }
	}

}
