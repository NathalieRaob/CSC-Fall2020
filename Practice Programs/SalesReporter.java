/* A Sales Report Program */

import java.util.Scanner;
public class SalesReporter
{
   private double highestSales;
   private double averageSales;
   private SalesAssociate[] team; //The array object is created in getData
   private int numberOfAssociates;
   
   //Reads the number of sales associates and data for each one
   public void getData()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter number of sales associates:");
      numberOfAssociates = keyboard.nextInt();
      team = new SalesAssociate[numberOfAssociates + 1];
      for(int i=1; i<=numberOfAssociates; i++)
      {
         team[i] = new SalesAssociate();
         System.out.println("Enter data for associate " + i);
         team[i].readInput();
         System.out.println();
      }
   }
   
   /* Computes the average and highest sales figures. Precondition: There is at least one salesAssociate*/
   public void computeStats()
   {
      double nextSales = team[1].getSales();
      highestSales = nextSales;
      double sum = nextSales;
      for (int i=2; i<=numberOfAAssociates; i++)
      {
         nextSales = team[i].getSales();
         sum = sum + nextSales;
         if(nextSales > highestSales)
            highestSales = nextSales; //highest sales so far
      }
      averageSales = sum / numberOfAssociates;
   }
   
}
//(Continued)