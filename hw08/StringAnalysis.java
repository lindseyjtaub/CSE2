/*
Lindsey Taub
CSE2
HW8
This program asks the user to input a string and then asks if they want to evaluate the whole string or just a portion.
if they choose whole string the code checks to see if the string has only letters in it or not and lets the user know.
if they choose part of the string, they are then asked how many characters they want to evaluate, and based on that the code checks for if the string has just letters in it or not and lets the user know.

*/
import java.util.Scanner;

public class StringAnalysis{
       public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a string");
        String message= input.next();
        
     
        int number=0;
        
       
       System.out.println("Would you like to evaluate the whole string (yes or no): ");
       String YorN = input.next();
       while(true){
           if (YorN.equals("yes") || YorN.equals("no")){
           break;
           }
          else{ 
                System.out.println("Error you did not enter a yes or no answer. Please try again: ");
                YorN=input.next();
                }
       }
       if(YorN.equals("yes")){
          if (Analyze(message)){
              System.out.println("Your input consists of only letters.");
          }
          else{
              System.out.println("Your input contains one or more values that aren't letters.");
          }
           
       }
        else if(YorN.equals("no")){
            System.out.println("Please enter the number of characters you would like to examine:");
         while(true){
                if(input.hasNextInt()){
                number=input.nextInt();
                break;
                }
                else{
                    System.out.println("Error: you did not enter an integer. Please try again: ");
                    number=input.nextInt();
                }
            }
            if (Analyze(message, number)){
                System.out.println("This portion of your input consists of only letters.");
            }
            else{
                System.out.println("This portion of your input contains one or more characters that aren't letters.");
            }
            
        }
       
       
       
    }// end of main method
    
    public static boolean Analyze(String message){
       
        
        boolean m=false;
         
        for(int n=0; n < message.length(); n++){
           m = Character.isLetter(message.charAt(n));
          if(m==false){
               break;
           }
           
        }
        
       return m; 
    }//end of method
    public static boolean Analyze(String message, int number){
        
        boolean m=false;
      
           
                for(int n=0; n<=number; n++){
                      m= Character.isLetter(message.charAt(n));
                        
                        if (message.length()< number){
                            do{
                                n++;
                            }while (message.length() >= number);
                        }//end of if 
                    
                        if(m==false){
                            break;
                        
                        }//end of if
                    
                }//end of loop
                
         
         return m;   
      
    } //end of method
 
    
}//end of class