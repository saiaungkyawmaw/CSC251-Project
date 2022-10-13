/**
   LandTrack class
*/

public class LandTrack{
      
      private double length;
      private double width;
      
      /**
      this constructor sets length and width acoording to the parameter
      @param l land track length
      @param w land track width
      */
      public LandTrack(double l, double w){
      
         length = l;
         width = w;
      }
      /**
      copy constructor
      @param obj LandTrack object
      */
      public LandTrack(LandTrack obj){
      
         length = obj.length;
         width = obj.width;
      }
      /**
      method to compare object's values and returns boolean values
      @param obj2 LandTrack object to compared to
      @return true or false status
      */
      public boolean equals(LandTrack obj2){
      
         if (this.length == obj2.length && this.width == obj2.width){
            return true;
         }
         else{
            return false;
         }
      }
      /**
      method to calculate and return area
      @return LandTrack area
      */
      public double getArea(){
      
         return length * width;
      }
      /**
      method to return object's values in string
      @return object's values in string
      */
      public String toString(){
         
         String str = "Length: " + length+
                     "\nWidth: " + width;
         return str;
      }
}