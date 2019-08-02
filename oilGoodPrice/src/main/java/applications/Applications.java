package applications;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class Applications {
	
	public static void main(String[] args) {
		getdata();
	}
	
	
	public static void getdata(){
	URL csv = new Applications().getClass().getResource("combustiveis.csv");
	String line = "";

	try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csv.getPath()))){
		bufferedReader.readLine();
		while ((line = bufferedReader.readLine()) != null) {
			String[] result = line.split("\n");
						
				for (String str : result) {
					System.out.println(str);
				}
			}
	} catch (IOException e) {
			e.printStackTrace();
	
	}
	}
}