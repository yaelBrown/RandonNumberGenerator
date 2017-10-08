/*
* File: RandomNumGenerator.java
* Author: Yael Brown
* Date: October 8, 2017
* Purpose: Takes input and generates random
* numbers with a for loop.  
*/

// Import required libraries
import java.util.Random;
import java.util.Scanner;

public class RandomNumGenerator{
    private static Scanner scan;
	public static void main(String[] args) {
    	scan = new Scanner(System.in);
        Random rand = new Random();

        // Prompt for limits
        System.out.println("Enter minimum number: ");
        int max = Integer.parseInt(args[0]);
        
        System.out.println("Enter how many numbers to generate:");
        int qty = Integer.parseInt(args[1]);

        // Generate multiple random numbers. 
        for (int i = 0; i < qty; i++){
            int x = rand.nextInt(max);
        	System.out.println(x);
        }
    }
}