/*
   Programming Problem 3 - Courses:
   Design and implement a set of classes that define various courses in your curriculum. Include information about 
   each course such as the title, number, description and department that teaches the course. 
   Consider the categories of classes that constitutes your curriculum when designing your inheritance structure.
   Create a main driver class to instantiate and exercise several of the classes.
*/

//parent class
public class Courses
{  
   public String title;
   public int number;
   public String description;
   public String department;
   
   //Constructor
   public Courses(String ti, int num, String desc, String dep)
   {
      title = ti;
      number = num;
      description = desc;
      department = dep;
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