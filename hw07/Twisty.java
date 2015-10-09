/*


*/
import java.util.Scanner ; // import scanner

public class Twisty{
    //main method
    public static void main(String[] args){
        Scanner input = new Scanner( System.in);
        
        boolean acceptablelength = false;
        int length=0;
        System.out.print("Input your desired length: ");
     while( !acceptablelength ){
            if (input.hasNextInt() ){
            length = input.nextInt();
            acceptablelength = true;
            }
        else{
            System.out.println("Error: please type in an integer.");
            System.out.print("Input your desired length:  ");
             input.next();
        }
    }   

    boolean acceptablewidth = false;
        int width=0;
        System.out.print("Input your desired width: ");
     while( !acceptablewidth ){
         if (input.hasNextInt() ){
              width = input.nextInt();
             if (width<0){
                 System.out.println("Error: please type in an integer.");
            System.out.print("Input your desired width:  ");
            input.next();
             }
                
                
            acceptablewidth = true;
    
         
        }
        else{ 
            System.out.println("Error: please type in an integer.");
            System.out.print("Input your desired width:  ");
             input.next();
        }
    }  
    
    System.out.println( "length: "+ length + " width: " + width);
        
    
        
    
      
        
        
        
        
    }// end of main method
}//end of class