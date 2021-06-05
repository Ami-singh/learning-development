package com.amish.learning;

public class RightMostSetBit {
	
	public static int getFirstSetBitPos(int n) 
    { 
		System.err.println((Math.log10(n & -n)));
		System.err.println(Math.log10(2));
		System.err.println(((Math.log10(n & -n)) / Math.log10(2)));
        return (int)((Math.log10(n & -n)) / Math.log10(2)) + 1; 
    } 
  
    // Drive code 
    public static void main(String[] args) 
    { 
        int n = 15; 
        getFirstSetBitPos(n);
        System.out.println(getFirstSetBitPos(n)); 
    } 
}
