package w12d3;

import java.util.Arrays;

public class SH1_Integer {
	public static int data [] = {12, 8, 4, 6, 10, 2};
	public static int count (int a [], int s ) {
		Arrays.sort(data);
		
		System.out.println ("=>This is the given integer order: "+"[12, 8, 4, 6, 10, 2]");
		System.out.println ();
		System.out.println ("=>This is the ascending order: "+Arrays.toString(data));
		
		int ndx = 0;
		while (ndx < a.length && a[ndx] < s) ndx++;
		if (ndx >= a.length) return -1;
		if (s == a [ndx]) return ndx;
		else return -1;

	}
	public static void main (String [] args) {
		int goal = 6;
int result = count( data, goal);
if(result <0)
	System.out.println ("The search could not find: " + goal);
else
	System.out.println("      =>The goal of " + goal + " was found at index: " + result);

	}

}