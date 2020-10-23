/*
   Design and implement a set of classes that define various types of reading material: books, novels, magazines, technical journals,
   textbooks, and so on. Include data values that describe various attributes of the material, such as the number of pages and the 
   names of the primary characters. Include methods that ate named appropriately for each class and that print an appropriate message.
   Create a main driver class to instantiate and exercise several of the classes.
*/

//main class
public class ReadingMaterials
{
  public String materialType;
  public String mtitle;
  public String authorName;
  public int noPages;
  
  //constructor
  public ReadingMaterials(String type, String title, String aName, int page )
  {
      materialType = type;
      mtitle = title;
      authorName = aName;
      noPages = page;
  }
  
  public void printMessage()
  {
    System.out.println("Type of reading material: "+ materialType);
    System.out.println("Title of the "+ materialType + ": " + mtitle );
    System.out.println("Author's name: "+ authorName);
    System.out.println("Number of pages: "+ noPages);
    System.out.println("-------------------------------------------------");

  }
}