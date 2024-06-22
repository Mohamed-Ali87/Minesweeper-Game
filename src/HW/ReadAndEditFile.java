//package HW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndEditFile {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		BufferedReader buf = null;
		String line;
		while(true){
        System.out.println("What is the name of your file?");
        String answer = kb.next();
        try {
        	
			buf = new BufferedReader(new FileReader(answer) );
			while((line = buf.readLine()) != null) {
				System.out.println(line);
				
			}
			break;
		} 
        
        catch (IOException e) {
			System.out.println("File Not Found " + answer);
        }
		}
		
	}
	
	

}
