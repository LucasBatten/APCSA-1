import java.util.*;
//Activity 5 Lucas Batten and Josh Turcotte
public class activity5{
   public static void main(String[]args){
   score();
   averageScore(totalScore);   
   }
   public static double score(){
      Scanner console = new Scanner (System.in);
      int players = 0;
      System.out.println("How many players would you like to add the scores of?");
      players = console.nextDouble();
      System.out.println("List the scores for each player");
      double totalScore = 0;
      int i =0;
      if (i<players){
         totalScore = totalScore + console.nextInt();
         i++;
      }
      System.out.println(totalScore);
      return totalScore;      
   }
   public static double averageScore(){
    double average = 0;
    average = totalScore/
   return
   
   }
}
