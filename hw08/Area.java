/*
Lindsey Taub
CSE2
HW08
This code asks the user for a shape and based on that asks them for values and then calculates the area.
*/
import java.util.Scanner;


public class Area{
   public static double Accept(){
       Scanner input= new Scanner(System.in);
       boolean acceptable= true;
       double nums=0;
       while(acceptable){
           
           if(input.hasNextDouble()){
             nums=input.nextDouble();
             acceptable=false;
           }
           else{
               System.out.println("Error: you did not enter a double. Try again: " );
                input.nextLine();
               
           }
      
   }
   return nums;
   }
 
   public static void Triangle(){
        System.out.println("Enter the width:");
       double width= Accept();
        System.out.println("Enter the height:");
        double height = Accept();
        System.out.println("Triangle area is: " + ((height*width)/2));
        return;
   }
   public static void Rectangle(){
       System.out.println("Enter the length:");
       double length= Accept();
       System.out.println("Enter the width:");
       double width= Accept();
       System.out.println("Rectangle area is: " + (width*length));
       return;
   }
   public static void Circle(){
       System.out.println("Enter the radius:");
       double radius= Accept();
       System.out.println("Circle area is: " + (3.14*(radius*radius)));
       return;
   }
   
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   boolean ok=false;
   String circle="circle";
   String rectangle="rectangle";
   String triangle="triangle";
   
    while(!ok){
        System.out.println("please choose triangle, rectangle, or circle: ");
        String shape= input.next();
        if (shape.equals(triangle)){
            Triangle();
            ok=true;
        }
        else if (shape.equals(circle)){
             Circle();
            ok=true;
        }
        else if(shape.equals(rectangle)){
            Rectangle();
            ok=true;
        }
        else{
            System.out.println("You did not enter an acceptable shape.");
        }
    
   
       
   }
       
  }
}