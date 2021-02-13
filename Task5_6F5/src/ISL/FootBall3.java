package ISL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;


public class FootBall3 {
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
		
		

		OptionalInt min = table.stream().mapToInt(ISLMain::getPoints).min();
	    if (min.isPresent()) {
	      System.out.printf("\nLowest number of points is %d\n", min.getAsInt());
	    } else {
	      System.out.println("min failed");
	    }

	    

	    List<String> s = table.stream()
	    	    .filter(p -> p.getWon() <12)
	    	    .map(ISLMain::getClub)
	    	    .collect(Collectors.toList());
	    	                   
	    	
		    
    	try {
		      FileWriter writer = new FileWriter("football3.txt");
		      writer.write("Lowest number of points is " + min.getAsInt() + "\n");
		      writer.write("Team with less than 5 wins: " + s + "\n");
		      writer.close();
		      System.out.println("Created : football3.txt and updated it.");
		    } catch (IOException e) {
		      System.out.println("An exception occurred.");
		      e.printStackTrace();
		    }
	}
	
}
