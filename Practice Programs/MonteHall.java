public class MonteHall
{
   public static void main(String[]args)
   {
      int n = 9;
      int s = switching(n);
      int ns = no_switching(n);
      System.out.println("Switching success: "+ s +" of " + n);
      System.out.println("Switching success: "+ ns +" of "+ n);
   }
   
   public static int switching(int n)
   {
      int i = 0;
      int success = 0;
      
      while (i<n)
      {
         int prize = (int)(3 * Math.random());
         int selected = (int)(3 * Math.random());
         int opened = (int)(3 * Math.random());
         int win = prize;
         
         while(opened == prize || opened==selected)
         {
            opened = (int)(Math.random()*3);
         }
         int extra_door = 0+1+2-selected-opened;
         
         //switch
         selected = extra_door;
         if(selected == win)
         {
            success += 1;
         }
         
         i+=1;
      }
      return success;
   }
   
   public static int no_switching(int n)
   {
      int i=0;
      int success = 0;
      
      while(i<n)
      {
         int prize = (int)(3*Math.random());
         int selected = (int)(3*Math.random());
         int opened = (int)(3*Math.random());
         int win = prize;
         
         while(opened == prize || opened==selected)
         {
            opened = (int)(3*Math.random());
         }
         
         int extra_door = 0+1+2-selected-opened;
         
         //no switch
         if(selected == win)
         {
            success+=1;
         }
         i+=1;
      }
      return success;
   }
}
