/* 
PRACTICE PROGRAM

Author: Nathalie Raob
Book: JAVA, an introduction to problem solving and programming, 8th Edition, Walter Savitch.


Chapter 2,page 130.
#1: Write a program that reads three whole numbers and displays the average of the three numbers

*/

import java.util.Scanner;

public class Average
{
   public static void main(String[]args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int num1, num2, num3, sum;
      double average;
      
      System.out.println("Please enter three whole number in your choice, just use space:");
      num1 = keyboard.nextInt();
      num2 = keyboard.nextInt();
      num3 = keyboard.nextInt();
      
      sum = num1 + num2 + num3;
      average = sum / 3;
      System.out.println("The average of the three whole number entered is " + average);
      
   }
}