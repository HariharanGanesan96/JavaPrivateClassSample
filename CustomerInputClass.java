package customer;

import java.text.ParseException;
import java.util.Scanner;



public class CustomerInputClass {
	public static void main(String[] args) throws NumberFormatException, ParseException {
		// TODO Auto-generated method stub
    Scanner data=new Scanner(System.in); 
    System.out.println("Enter first input");
    String input1=data.nextLine();
    System.out.println("Enter Secound input");
    String input2=data.nextLine();
    String [] inputArray1=input1.split(",");
    // System.out.println(inputArray1.length);
  
	    CustomerClass obj1=new CustomerClass(Long.parseLong(inputArray1[0]),inputArray1[1],inputArray1[2],
	    		        inputArray1[3],inputArray1[4],inputArray1[5],inputArray1[6]);
	    String [] inputArray2=input2.split(",");
    //System.out.println(inputArray2.length);
	    CustomerClass obj2=new CustomerClass(Long.parseLong(inputArray2[0]),inputArray2[1],inputArray2[2],
		        inputArray2[3],inputArray2[4],inputArray2[5],inputArray2[6]);
    
    System.out.println("Customer1:\n"+obj1+"\n");
    System.out.println("Customer2:\n"+obj2+"\n");
    
    if(obj1.equals(obj2)) {
    	System.out.println("Customer1 same as Customer2");
    }
    else {
    	System.out.println("Customer1 and Customer2 different");
    }
}
}