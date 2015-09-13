//Lindsey Taub CSE2-110 9/13/15


import java.util.Scanner ; //import scanner

public class Timer{
    //main method required for every java program
    public static void main(String[] args) {
      Scanner myScanner = new Scanner( System.in ) ; // constructs the instance of Scanner
      
      System.out.print("Enter the current time: ");
      int currentTime = myScanner.nextInt(); // accepts user input
      
      System.out.print("Enter the time that you will be eating dinner: ");
      int dinnerTime= myScanner.nextInt() ; // prompts user for the time they want to eat dinner and accepts the input
      
      int untilDinner= ( dinnerTime - currentTime)  ;
      int hours = (dinnerTime - currentTime) /100 ; // to get first digits
      int minutes= (dinnerTime - currentTime) % 100; // to get last 2 digits
      
      
      
      System.out.println("You have " 
      + hours + " hours and " + minutes + 
      " minutes until Dinner.");
      
    
        
    } // end of main method
} // end of class