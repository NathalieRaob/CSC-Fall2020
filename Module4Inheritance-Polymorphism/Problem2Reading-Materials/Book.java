/* book class */

public class Book extends ReadingMaterials
{
   public Book(String type, String title, String aName, int page)
   {
      super(type, title, aName, page);
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