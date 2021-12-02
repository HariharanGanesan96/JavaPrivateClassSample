package Player;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import song.SongClass;

public class PlayerInputClass {
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
		  
		    PlayerClass obj1=new PlayerClass(inputArray1[0],date(inputArray1[1]),inputArray1[2],
		    		Integer.parseInt(inputArray1[3]),Integer.parseInt(inputArray1[4]),
		    		Integer.parseInt(inputArray1[5]),inputArray1[6],Double.parseDouble(inputArray1[7]));
		    String [] inputArray2=input2.split(",");
		    //System.out.println(inputArray2.length);
		    PlayerClass obj2=new PlayerClass(inputArray2[0],date(inputArray2[1]),inputArray2[2],
		    		Integer.parseInt(inputArray2[3]),Integer.parseInt(inputArray2[4]),
		    		Integer.parseInt(inputArray2[5]),inputArray2[6],Double.parseDouble(inputArray2[7]));
		    
		    System.out.println("Player1:\n"+obj1+"\n");
		    System.out.println("Player2:\n"+obj2+"\n");
		    
		    if(obj1.equals(obj2)) {
		    	System.out.println("Player1 same as Player2");
		    }
		    else {
		    	System.out.println("Player1 and player2 different");
		    }
		    
			}
}
