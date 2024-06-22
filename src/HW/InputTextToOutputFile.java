//package HW;
//package HW;

import java.util.*;
import java.lang.*;
import java.io.FileWriter;

public class InputTextToOutputFile{
	
public static void main(String[] args) {
System.out.print("What is the name of your output file? ");
Scanner kb=new Scanner(System.in); 
String filename=kb.nextLine(); 

try{
FileWriter wr=new FileWriter(filename); 
while(true){ 
String line=kb.nextLine();
if (line.contains("STOP!")){
wr.write(line+'\n'); 
break;
}
wr.write(line+'\n');
}
wr.close(); 
}
catch(Exception e){ 

}
}

}