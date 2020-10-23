/* Cell phone class */

public class Cellphone extends ElecEquipment
{
   public Cellphone(String device, double w, int c, int pu, String Manufacturer)
   {
      super(device, w, c, pu, Manufacturer);
   }
   
   public void print()
   {
      System.out.println("Device: " + nameOfDevice);
      System.out.println("Weight (lb): "+ weight);
      System.out.println("Cost ($): "+ cost);
      System.out.println("Power Usage (Watts): "+ powerUsage);
      System.out.println("Name of manufacturer: "+ nameOfManufacturer);
      System.out.println("---------------------------------------------");

   }
   
}