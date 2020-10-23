/* 
   DEsign and implement a set of classws that define various types of electronics equipment (Computers, cell phones, pagers, digital cameras etc)
   Include data that describe various attributes of the electronics, such as the weight, cost, power usage, and the names of the manufacturers.
   Include methods that are named appropriately for each class and that print an appropriate message.
   Create a  main driver class to instantiate and exercise several of the classes.
 */
 
 public class ElecEquipment
{  
   public String nameOfDevice;
   public double weight;
   public int cost;
   public int powerUsage;
   public String nameOfManufacturer;
   
   //Constructor
   public ElecEquipment(String device, double w, int c, int pu, String Manufacturer)
   {
      nameOfDevice = device;
      weight = w;
      cost = c;
      powerUsage = pu;
      nameOfManufacturer = Manufacturer;
      
      
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