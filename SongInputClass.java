package song;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SongInputClass {
	 public static Date date(String s) throws ParseException {
		    Date dat;
		    SimpleDateFormat formatter1=new SimpleDateFormat("dd-MM-yyyy"); 
		    dat=(Date) formatter1.parse(s);
		    	return dat;
		    }
			public static void main(String[] args) throws NumberFormatException, ParseException {
				// TODO Auto-generated method stub
		    Scanner data=new Scanner(System.in); 
		    System.out.println("Enter first input");
		    String input1=data.nextLine();
		    System.out.println("Enter Secound input");
		    String input2=data.nextLine();
		    String [] inputArray1=input1.split(",");
		    // System.out.println(inputArray1.length);
		  
		    SongClass obj1=new SongClass(inputArray1[0],inputArray1[1],inputArray1[2],
		    		Double.parseDouble(inputArray1[3]),Integer.parseInt(inputArray1[4]),date(inputArray1[5]));
		    String [] inputArray2=input2.split(",");
		    //System.out.println(inputArray2.length);
		    SongClass obj2=new SongClass(inputArray2[0],inputArray2[1],inputArray2[2],
		    		Double.parseDouble(inputArray2[3]),Integer.parseInt(inputArray2[4]),date(inputArray2[5]));
		    
		    
		    System.out.println("Song1:\n"+obj1+"\n");
		    System.out.println("Song2:\n"+obj2+"\n");
		    
		    if(obj1.equals(obj2)) {
		    	System.out.println("Song1 same as song2");
		    }
		    else {
		    	System.out.println("Song1 and song2 different");
		    }
		    
			}

}
