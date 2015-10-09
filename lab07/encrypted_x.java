/*
Lindsey Taub
lab 7
cse2
This code asks the user for a number and then based on that, makes an 'x' shape
*/
import java.util.Scanner ; // import scanner

public class encrypted_x{
    //main method
    public static void main(String[] args){
      
       
       
        Scanner myScanner = new Scanner(System.in);
        int input=0;
       boolean acceptable = false ;
       System.out.print("Enter an integer between 0-100: ");
       
       
       while(!acceptable){
           if (myScanner.hasNextInt()){
               input= myScanner.nextInt();
               if (input < 0 || input >100){
                   System.out.println ("Error: please enter an integer between 0-100: ");
                   acceptable = false;
               }
               else{
                acceptable=true;
          }
       
       
        }
            else{
            System.out.print ("Enter an integer: ");
             myScanner.next();
            }
           }
       
      
       
       for ( int i = 0; i < input; i++){
            for (int j = 0; j<input; j++){
              if (j==i){ 
                System.out.print (" ");
                }
             else if (j== (input-i-1) ){
                System.out.print(" ");
        
            }
            else if (j !=i){
                System.out.print("*");
                
                }
            }
             System.out.println(" ");
             
             
       }
       
      
       
       
    
        
        
    }//end of main method
}//end of class