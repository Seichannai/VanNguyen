package WriteReadCSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Plotter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print y = 2x + 3 then print to the file
	
		
		
		try {
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.csv"));
		
		writer.write("X" + "," + "Y= 2x + 3\n");
		for (int i =1; i<50; i++)
		{
		int y = 2*i +3;
		writer.write(i + "," + y + "\n");
		}
		
		writer.close();
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
