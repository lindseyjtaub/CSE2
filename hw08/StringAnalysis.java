/*
Lindsey Taub
CSE2
HW8


*/
import java.util.Scanner;

public class StringAnalysis{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String yes="yes";
        String no= "no";
        System.out.println("Please enter a string");
        String message= input.next();
        
      boolean acceptable=false;
     int number=0;
       while(!acceptable){
       System.out.println("Would you like to evaluate the whole string (yes or no): ");
       String YorN = input.next();
       if(YorN.equals(yes)){
           Analyze(message);
           break;
       }
        else if(YorN.equals(no)){
            Analyze(message, number);
            break;
        }
        else{ 
        System.out.println("Error you did not enter a yes or no answer.");
            
        }
       
       }//end of while loop
    }// end of main method
    public static boolean Analyze(String message){
       
        int n= 0;
        char m;
        while(message.length()>= n){
            m= message.charAt(n);
           if (Character.isLetter(message.charAt(n))){
               System.out.print(message.charAt(n));
               n++;
           }
           else{
               
               System.out.println("Error: Not a valid string. Try Again: ");
               Scanner input = new Scanner(System.in);
               message= input.next();
               
           }
        }
        
       return true; 
    }//end of method
    public static boolean Analyze(String message, int number){
        Scanner input = new Scanner(System.in);
        boolean acceptable=false;
        char m;
        
        int n=0;
        while(!acceptable){
            System.out.println("How many characters would you like to evaluate?: ");
            
            if (input.hasNextInt()){
                number=input.nextInt();
                m=message.charAt(n);
                while(number>= n){
                    
                    if (Character.isLetter(message.charAt(n))){
                        System.out.print(message.charAt(n));
                        n++;
                        if (message.length()< number){
                            do{
                                n++;
                            }while (message.length() >= number);
                        }//end of inner inner if 
                        return true;
                     }//end of inner if
                    else{
                        
                     System.out.println("Error: Not a valid string. Please try again: ");
                     message=input.next();
                       
                       
                        } //end of inner else
                } //end of inner while
                acceptable=true;
            }//end of outter if
            else{
               
                System.out.println("Error, this is not a valid integer.");
                
            }//end of outter else
            
        }//end of outter while
        return true;
    }//end of method
    
}//end of class