/* Football class */

public class Football extends Sport
{
   public Football(String sName, String tName, int player)
   {
      super(sName,tName, player);
   }
   
   public void displayData()
   {
      System.out.println("Sport name: "+ sportName);
      System.out.println("Team name: "+ teamName);
      System.out.println("Number of players: "+ noPlayers);
      System.out.println("Redskins have won 5 championships ");
      
      System.out.println("-------------------------------------");

      
   }

}