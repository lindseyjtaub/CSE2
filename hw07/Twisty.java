/*
Lindsey Taub
CSE2
Twisty.java
The purpose of this code is to ask the user for a width and a length, and based on that print out a twist

*/
import java.util.Scanner ; // import scanner

public class Twisty{
    //main method
    public static void main(String[] args){
        Scanner input = new Scanner( System.in);
        
        
        int length=0;
        boolean acceptablelength = false;
        System.out.print("Input your desired length: ");
    
         while( !acceptablelength ){
            if (input.hasNextInt() ){
            length = input.nextInt();
            if (length<0 || length>80){
              System.out.println("Error: please type in an integer. Input your desired length: ");   
            }
            else{
            acceptablelength = true;
            
                
            }
            }
        else{
            
            System.out.print("Input your desired length:  ");
             input.next();
        }
    }   

     int width=0;
        boolean acceptablewidth = false;
        System.out.print("Input your desired width: ");
    
         while( !acceptablewidth ){
            if (input.hasNextInt() ){
            width = input.nextInt();
            if (width<0 || width>length){
              System.out.println("Error: please type in an integer. Input your desired width: ");   
            }
            else{
            acceptablewidth = true;
            
                
            }
            }
        else{
            
            System.out.print("Input your desired width:  ");
             input.next();
        }
    }   

    
   
  
        int i=0;
        int j=1;
        int k=0;
        int l=1;
        if(width%2==0){
       for ( int m = 0; m < width; m++){
           
            for (int n = 0; n<length; n++){
                
              if (n==i*width+m || n==l*width-m-1 || n==j*width+m || n==(k+2)*width-m-1){ 
                  if(n==i*width+m){
                    System.out.print("#"); // r down #
                    i+=2;
                
                
              }
              
              if (n==(k+2)*width-m-1){
                System.out.print("#");// r up #
                k+=2;
               
             }
             
             if (n==l*width-m-1){
                System.out.print("/");//r up /
                l+=2;
                
            }
             if(n==j*width+m){
                System.out.print("\\");// r down \
                j+=2;
                
            }
              }
        else{
                System.out.print(" ");
            }
        }
            System.out.println("");
                i=0;
                j=1;
                k=0;
                l=1;
                } 
            }
    else{
         i=0;
         j=1;
         k=0;
         l=1;
         for (int m=0; m<width; m++){
             for(int n=0; n<length; n++){
                 if (n==i*width+m || n==l*width-m-1 || n==j*width+m || n==(k+2)*width-m-1){
                     if(n==i*width+m && n==l*width-m-1){
                         System.out.print("#");
                         i+=2;
                         l+=2;
                     }
                 if (n==(k+2)*width-m-1 && n==j*width+m) {
                     System.out.print("\\");
                     k+=2;
                     j+=2;
                     
                 }
                 
                 else{
                     if(n==i*width+m && n!=l*width-m-1){
                         System.out.print("#");
                         i+=2;
                     }
                    if (n==(k+2)*width-m-1 && n!=j*width+m){
                        System.out.print("#");
                        k+=2;
                    }
                    if(n==l*width-m-1 && n!=i*width+m){
                        System.out.print("/");
                        l+=2;
                    }
                   if(n==j*width+m && n!=(k+2)*width-m-1){
                       System.out.print("\\");
                       j+=2;
                   }  
                 }
                     
                 }
                else{
                    System.out.print(" ");
                }
             }
         
        
             System.out.println("");
             
              i=0;
              j=1;
              k=0;
              l=1;
         
       }
       
        
    }  
        
    }// end of main method
}//end of class