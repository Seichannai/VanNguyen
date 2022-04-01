package WriteReadCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class Smoother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		

				
		
String path= "Salter.csv";
String line ="";

ArrayList <String> valuesX = new ArrayList<>();
ArrayList <String> valuesY = new ArrayList<>();

try {
	
	BufferedWriter writer = new BufferedWriter(new FileWriter("Smoother.csv"));
	
	writer.write("X" + "," + "Y Average \n");

	



try
{
	BufferedReader br = new BufferedReader(new FileReader(path));
	while ((line = br.readLine()) != null) {
		String[] values= line.split(",");
		
		valuesX.add(values[0]);
		valuesY.add(values[1]);
		
		
		
		
	}
	
	
	for (int i =1; i< valuesY.size()-1; i ++)
	{
	
	int y = (Integer.parseInt(valuesY.get(i))+ Integer.parseInt(valuesY.get(i+1)))/2;
	
	writer.write(valuesX.get(i) + "," + Integer.toString(y) + "\n" );
	
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
