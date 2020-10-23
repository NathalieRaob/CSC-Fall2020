/* Main class */

public class ElecEquipmentDemo
{
   public static void main(String[]args)
   {
     ElecEquipment e1, e2;
      
      e1 = new Computer("Mac Book pro", 3.02, 1500, 85, "Foxconn");
      e2 = new Cellphone("Cell phone-Samsung", 2.9, 900, 3000, "Samsung");
      
      e1.print(); 
      e2.print(); 
     
      
   }
}