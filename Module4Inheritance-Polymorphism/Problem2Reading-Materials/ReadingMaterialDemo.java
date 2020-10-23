/* Main class */

public class ReadingMaterialDemo
{
   public static void main(String[]args)
   {
      ReadingMaterials r1, r2, r3;
      
      r1 = new Book("Book", "Think like a Monk", "Jay Shetty", 450);
      r2 = new Novel("Novel", "Little Women", "Louisa May Alcott", 500);
      r3 = new Textbook("Textbook", "JAVA - An introduction to problem solving and programming", "Walter Savitch", 1016);
      
      r1.printMessage();
      r2.printMessage();
      r3.printMessage();
   }
}