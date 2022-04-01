package WriteReadCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Salter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
	Random rand = new Random();
				
		
String path= "output.csv";
String line ="";

ArrayList <String> valuesX = new ArrayList<>();
ArrayList <String> valuesY = new ArrayList<>();

try {
	
	BufferedWriter writer = new BufferedWriter(new FileWriter("Salter.csv"));
	
	writer.write("X" + "," + "Y +/- rand\n");

	



try
{
	BufferedReader br = new BufferedReader(new FileReader(path));
	while ((line = br.readLine()) != null) {
		String[] values= line.split(",");
		
		valuesX.add(values[0]);
		valuesY.add(values[1]);
		
		
		
		
	}
	
	
	for (int i =1; i< valuesY.size(); i ++)
	{
	
	
	writer.write(valuesX.get(i) + "," + (Integer.parseInt(valuesY.get(i))+rand.nextInt(50)-rand.nextInt(50)) + "\n" );
	
	}
	
	
	br.close();
	writer.close();
	
}catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}

	
} catch (IOException e) {
	e.printStackTrace();
}

	
	}
	
}
