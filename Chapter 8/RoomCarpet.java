/**
   RoomCarpet class
*/
public class RoomCarpet{

   private RoomDimension room;
   private double sqFt;
   /**
   constructor w/ parameter
   
   */
   public RoomCarpet(RoomDimension obj, double sqFt){
      room = new RoomDimension(obj);
      this.sqFt = sqFt; 
   }
   /**
   method to calculate total cost
   */
   public double totalCost(){
      return room.getArea() * sqFt;
   }
   /**
   
   */
   public String toString(){
      String str = String.format("Length: %,.2f  :  Width: %,.2f \nArea: %,.2f  :  Total Cost: %,.2f",
                                 room.getLength(),room.getWidth(),room.getArea(),totalCost());
      return str;
   }
}