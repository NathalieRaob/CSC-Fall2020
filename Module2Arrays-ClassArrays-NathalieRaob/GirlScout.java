/*
author: Nathalie Raobimanana
Subject: CSC 201
Professor: Emilia Butu
*/

import java.util.*;
public class GirlScout
{
   public static void main(String args[])
   {  
      Scanner input = new Scanner(System.in);
      int girls;
         int arr[] = new int[5];
         for(int i=0; i<5; i++){
         arr[i] = 0;
         }
         
      System.out.print("Total number of girls in the troop: ");
      girls = input.nextInt();
      int boxes;
      for (int i=0; i<girls; i++){
         System.out.print("Boxes of cookies for girl #" + (i+1) + "");
         boxes = input.nextInt();
            arr[(boxes - 1)/10]++;
      }
      System.out.println(" TOTAL BOXES " + " NUMBER OF GIRL SCOUTS ");
 
System.out.println(" 0 to 10 " + "    "   + arr[0] );
System.out.println(" 10 to 20 " + "    "   + arr[1] );
System.out.println(" 20 to 30 " + "    "   + arr[2] );
System.out.println(" 30 to 40 " + "    "   + arr[3] );
System.out.println(" 40 or more " + "   "   + arr[4] );   
   }

}