//Lindsey Taub CSE2-110 9/13/15


import java.util.Scanner ; //import scanner

public class Block{
    // main method required for every java program
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in ) ; // constructs the instance of Scanner
        
        System.out.print("Enter the length of the block: ") ;
        double length= myScanner.nextDouble() ; // accepts user input
        
        System.out.print("Enter the width of the block: ");
        double width= myScanner.nextDouble() ;
        
        System.out.print("Enter the height of the block: ");
        double height= myScanner.nextDouble() ;
    
        double volume = length * width * height ;
        double surfaceArea = ((length * width) + (length * height) + (width * height)) *2;
        
        System.out.println("The volume of the block of dimensions " 
        + length + "x" + width + "x" 
        + height + " is " + volume + 
        ". the surface area of the block is " 
        + surfaceArea + "." );
    
        
        
        
    } // end of main method
} //end of class