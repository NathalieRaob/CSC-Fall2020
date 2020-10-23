/* SportMain */

public class SportDemo
{
   public static void main(String[]args)
   {
      Sport s1,s2,s3;
      s1 = new Basketball("Basketball", "Los Angeles Lakers", 5);
      s2 = new Football("Football", "Washington Redskins", 11);
      s3 = new Baseball("Baseball", "Texas Rangers", 9);
      
      s1.displayData();
      s2.displayData();
      s3.displayData();
   }
}