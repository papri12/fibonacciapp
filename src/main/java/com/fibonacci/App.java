package com.fibonacci;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	int first_number = 0, second_number = 1, third_number;
    	System.out.print("Enter The Number You want to print: ");
    	int count = scanner.nextInt();
    	System.out.print("Enter The Fibonacci Series: " + first_number + second_number);
    	for(int count_number = 1; count_number <= count-2; count_number++)
    	{
    		third_number = first_number + second_number;
    		System.out.print(" " + third_number);
    		first_number = second_number;
    		second_number = third_number;
    	}
    }
}
