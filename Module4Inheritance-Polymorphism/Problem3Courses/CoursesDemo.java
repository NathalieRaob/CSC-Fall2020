/* Driver Class */

public class CoursesDemo
{
   public static void main(String[]args)
   {
      Courses c1, c2, c3;
      
      c1 = new CS("Computer Science I", 201, "Introduces  algorithm and problem solving methods. Emphasizes structures and especially object-oriented programming concepts.", "Department of Computer Science");
      c2 = new Calculus("Calculus I", 263, "Presents concepts of limits, derivatives, differentiation of various types of functions and use of differentiation rules, application of differentiation.", "Department of Mathematique");
      c3 = new Art("Current Issues in Web Design", 115, "Explores contemporary subjects and currents trends pertaining to web design and emphasizes the roles of design and production techniques fundamental to web development.", "Department of Art");
      
      c1.print(); 
      c2.print(); 
      c3.print();
      
   }
}