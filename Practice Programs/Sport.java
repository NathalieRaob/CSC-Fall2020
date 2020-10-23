/* Problem 1 - Sports Statistics
   
   -Design and implement a set of classes that keeps track of various sports statistics. 
   -Have each low-level class represent a 
      specific sport. 
   -Tailor the services of the classes to the sport in question,
   -and move common attributes to the higher-level classes as appropriate.
   
    Create
   main driver class to instantiate and exercise several of the classes.
   
*/

//Parent class
public class Sport
{
   public String sportName;
   public String teamName;
   public int noPlayers;
   
   //constructor
   public Sport(String sName, String tName, int player)
   {
      sportName = sName;
      teamName = tName;
      noPlayers = player;
   }
   
   //methods
   public void displayData()
   {
      System.out.println("Sport name: " + sportName);
      System.out.println("Team name: " + teamName);
      System.out.println("Number of players: " + noPlayers);
      System.out.println("-------------------------------------");
   }
}