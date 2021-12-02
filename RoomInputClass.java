package room;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import song.SongClass;

public class RoomInputClass {
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
		  
		    RoomClass obj1=new RoomClass(Integer.parseInt(inputArray1[0]),Integer.parseInt(inputArray1[1]),inputArray1[2],
		    		Integer.parseInt(inputArray1[3]),date(inputArray1[4]),Double.parseDouble(inputArray1[5]));
		    String [] inputArray2=input2.split(",");
		    //System.out.println(inputArray2.length);
		    RoomClass obj2=new RoomClass(Integer.parseInt(inputArray2[0]),Integer.parseInt(inputArray2[1]),inputArray2[2],
		    		Integer.parseInt(inputArray2[3]),date(inputArray2[4]),Double.parseDouble(inputArray2[5]));
		    
		    
		    System.out.println("Room1:\n"+obj1+"\n");
		    System.out.println("Room2:\n"+obj2+"\n");
		    
		    if(obj1.equals(obj2)) {
		    	System.out.println("Room1 same as Room2");
		    }
		    else {
		    	System.out.println("Room1 and Room2 different");
		    }
}
}