package com.easy;

public class Qn38 {

	public static void main(String[] args) {
		int n = 23;
		if(n/10 == 2) System.out.println(n);
		System.out.println(countAndSay(1));

	}
	
	public static String countAndSay(int n) {
		
		
		if(n == 1) return "1";
		
		int temp = 1;
		
	    StringBuilder sb = new StringBuilder();
	    int repeatedCounter = 0;
	    for(int i=0; i<n; i++) {
	    	int remainder = n%10;
	    	if(n/10 == remainder) {
	    		n = n/10;
	    		repeatedCounter++;
	    	}
	    	
	    }
	      
	    return ""; 
        
    }

}
