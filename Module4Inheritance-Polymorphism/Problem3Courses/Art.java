/* Art class */

public class Art extends Courses
{
   public Art(String ti, int num, String desc, String dep)
   {
      super(ti, num, desc, dep);
   }
   
   public void print()
   {
      System.out.println("Course: " + title);
      System.out.println("Course Number: "+ number);
      System.out.println("Description: "+ description);
      System.out.println("Department: "+ department);
      System.out.println("---------------------------------------------");

   }
   
}