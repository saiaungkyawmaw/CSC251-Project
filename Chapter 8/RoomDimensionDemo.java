/**
   RoomDimension Driver
*/
import java.util.*;

public class RoomDimensionDemo{

   public static void main(String[] args){   
      double length = 0.0;
      double width = 0.0;
      double sqFtCost = 0.0;
      String another = "";
      
      Scanner keyboard = new Scanner(System.in);
      
      do{
         System.out.print("Enter the room length: ");
         length = keyboard.nextDouble();
         System.out.print("Enter the room width: ");
         width = keyboard.nextDouble();
         RoomDimension room = new RoomDimension(length, width);
         
         System.out.print("Enter the cost per square feet: $ ");
         sqFtCost = keyboard.nextDouble();
         RoomCarpet carpet = new RoomCarpet(room, sqFtCost);
         
         System.out.println(carpet);
         
         keyboard.nextLine();
         System.out.print("Enter y to enter another room info: ");
         another = keyboard.nextLine();
      }while(another.equalsIgnoreCase("y")); 
      
      System.out.println("Thanks for using the program!");
      
   }
}