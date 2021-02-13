package ISL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ReadFromCSV.PointsTable;

public class FootBall5 {
	public static void main(String[] args) {
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

		System.out.println("\nSorted by Comparator in Team class");
	    table.stream().sorted().forEach(System.out::println);

	    System.out.println();
	    System.out.println("Sorted by lambda");
	    table.stream()
	         .sorted((c1, c2) -> 
	            ((Integer) c1.getDrawn()).compareTo(c2.getDrawn()))
	         .forEach(System.out::println);

	    try {
		      FileWriter writer = new FileWriter("football5.txt");
		      writer.write("Sorted by Comparator in Team class\n");
		      table.stream().sorted()
		        .forEach(str -> {
		        	try {
						writer.write(str.toString() + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
		        });
		      
		      writer.write("\nSorted by lambda\n");
		      table.stream().sorted((c1, c2) -> 
	            ((Integer) c1.getDrawn()).compareTo(c2.getDrawn()))
		        .forEach(str -> {
		        	try {
						writer.write(str.toString() + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
		        });
		      writer.close();
		      System.out.println("Created : football5.txt and updated it.");
		    } catch (IOException e) {
		      System.out.println("An exception occurred.");
		      e.printStackTrace();
		    }
	}
}
