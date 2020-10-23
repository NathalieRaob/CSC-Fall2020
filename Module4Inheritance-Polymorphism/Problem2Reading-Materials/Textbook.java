/* Textbook class */

public class Textbook extends ReadingMaterials
{
   public Textbook(String type, String title, String aName, int page)
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