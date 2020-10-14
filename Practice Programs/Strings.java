/* Chapter 2, page130.
   Problem #2: Write a program that uses  Scanner to read two strings from the keyboar. Display each string, along with its length,
   on two separate lines. Then create a new string by joining the two strings, separated by a blank. Display the new string and its length 
   on a third line.
*/

import java.util.Scanner;

public class Strings
{
   public static void main (String[]args)
   {
      Scanner Keyboard = new Scanner(System.in);
      
      //initialize variables
      String str1, str2;
      int count;
      
      System.out.println("Please enter two strings of your choice");
      str1 = Keyboard.next();
      str2 = Keyboard.next();
     
      count = str1.length(); //the method length returns the number of characters in str1
      System.out.println("You have entered " + str1 + " and the length is " + count);
      
      count = str2.length();
      System.out.println("You have entered "+ str2 + " and the length is " + count);
      
      String str3 = str1+" "+str2;
      count = str3.length();
      System.out.println("The new string is "+ str3 + " and the length is " + count);
      
      
   }
}