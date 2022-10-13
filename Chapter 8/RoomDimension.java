/**
   RoomDimensions Class
*/
public class RoomDimension{
   
   private double length;
   private double width;
   /**
   constructor with parameter
   @param
   @param
   */
   public RoomDimension(double l, double w){
   
      length = l;
      width = w;
   }
   /**
   copy constructor
   @param RoomDimension object
   */
   public RoomDimension(RoomDimension obj){
      this.length = obj.length;
      this.width = obj.width;
   }
   /**
   area method
   @return area
   */
   public double getArea(){
      return length * width;
   }
   /**
   
   */
   public String toString(){
      String str = "Length: "+length+"\nWidth: "+width;
      return str;
   }
   /**
   
   */
   public double getLength(){
      return length;
   }
   /**
   
   */
   public double getWidth(){
      return width;
   }
}