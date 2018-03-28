package w12d3;

import java.util.Arrays;

public class SH2_String {
	private static String data[] = {"First_Name", "Last_Name" ,"Middle_Name" , 
			                        "Address" , "Mobile_Number", "Mail_ID"};
	public static int iterativeSearch (String a[], String s) {

        Arrays.sort(data);
		
		System.out.println ("=>This is the given integer order: "+"[First_Name, Last_Name, Middle_Name, Address, Mobile_Number, Mail_ID]");
		System.out.println ();
		System.out.println ("=>This is the ascending order: "+Arrays.toString(data));
		
	    int ndx = 0;
	    while (ndx < a. length && a[ndx] != s) ndx++;
	    if (ndx >=a. length) return -1;
	    if (s == a[ndx]) return ndx;
	    else return -1;
	}

	public static void main (String [] args) {
	    
		String goal = "Address";
	    int result = iterativeSearch(data, goal);
	    if (result < 0)
	    System.out.println("      =>The search could not find: " + goal);
	  else
	    System.out.println("      =>The goal of '"+goal+"' was found at index: " + result);

	}

	}
