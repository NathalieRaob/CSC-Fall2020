/* SportMain */

public class SportDemo
{
   public static void main(String[]args)
   {
      Sport s1, s2;
      s1 = new Basketball("Basketball", "Los Angeles Lakers", 6);
      s2 = new Football("Football", "Washington Redskins", 11);
      
      s1.displayData();
      s2.displayData();
   }
}