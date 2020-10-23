/* Basketball class */

public class Basketball extends Sport
{
   public Basketball(String sName, String tName, int player)
   {  
      
      super(sName,tName, player);
      
   }
   
   public void displayData()
   {
      System.out.println("Sport name: "+ sportName);
      System.out.println("Team name: "+ teamName);
      System.out.println("Number of players: "+ noPlayers);
      System.out.println("Los Angeles Lakers won the championships 2020! ");
      
      System.out.println("-------------------------------------");

      
   }
}