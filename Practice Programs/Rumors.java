import java.util.Scanner;
public class Rumors
{
   public static void main(String[]args)
   {
      int attempts = 50; //amount of times we check to calculate the probabilities
      Scanner Keyboard = new Scanner(System.in);
      System.out.print("Please enter the number of the guests at the party: ");
      int n = Keyboard.nextInt();
      int countRumors = 0;  //how many times all people heard the rumor
      int peopleReached = 0;
      for(int i=0; i<attempts; i++)
      {
         boolean guests[] = new boolean[n];
         guests[1] = true; //Bob already heard
         boolean rumorsHeard = false; //condition to exixt the loop
         int nextPerson = -1; //next person who is going to hear the rumor
         int currentPerson = 1; //currently Bob
         while(!rumorsHeard)
         {
            nextPerson = 1 + (int)(Math.random()*(n-1));
            if (nextPerson == currentPerson)
            {
               while(nextPerson == currentPerson)
               nextPerson = 1 + (int)(Math.random()*(n-1));
            }
            
            if(guests[nextPerson])
            {
               if(rumorSpreaded(guests))
                  countRumors++;
                  peopleReached += countPeopleReached(guests);
                  rumorsHeard = true;
            }
            
            guests[nextPerson] = true;
            currentPerson = nextPerson;
         }
      }
      
      System.out.println("Probability that everyone at the party except Alice will hear the rumor :" + (int)countRumors / attempts);
      System.out.println("Expected number of people to hear the rumor: " + peopleReached / attempts); 
      
           
   }
   
   
   public static int countPeopleReached(boolean arr[])
   {
      int counter = 0;
      for(int i=1; i<arr.length; i++)
      {
         if (arr[i])
         counter ++;
         // return counter; 
      }
      return counter;
   }
   
   public static boolean rumorSpreaded(boolean arr[])
   {
      for (int i = 1; i<arr.length; i++)
      if (!arr[i])
      return false;
      return true;
   }
}
