/**
   LandTrack class driver
*/
import java.util.*;

public class LandTrackDemo{

   public static void main(String[] args){
   
      double length = 0.0;
      double width = 0.0;
      String another = "";
      ArrayList<LandTrack> trackList = new ArrayList<LandTrack>();
      
      Scanner keyboard = new Scanner(System.in);
      
      do{
         System.out.print("Enter the land track length: ");
         length = keyboard.nextDouble();
         System.out.print("Enter the land track width: ");
         width = keyboard.nextDouble();
         trackList.add(new LandTrack(length, width));
         
         keyboard.nextLine();
         System.out.print("Enter y to add another land track info: ");
         another = keyboard.nextLine();
      }while(another.equalsIgnoreCase("y"));
      
         System.out.println();
      for (int i = 0; i < trackList.size(); i++){
         double area = trackList.get(i).getArea();
         System.out.println("LandTrack-" + (i+1) + "\n" + trackList.get(i) + "\nArea: " + area);
         System.out.println();
      }
      
      System.out.print("Enter the first track number to compare: ");
      int first = keyboard.nextInt() - 1;
      System.out.print("Enter the second track number to compare: ");
      int second = keyboard.nextInt() - 1;
      
      if(trackList.get(first).equals(trackList.get(second))){
         System.out.println("These two tracks have the same size.");
      }
      else
         System.out.println("These two tracks don't have the same size.");
   }
}
