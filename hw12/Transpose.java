/*
Lindsey Taub
CSE2
hw 12
This program asks the user for a height and a width and verifies that the height and width are positive numbers.
Then the program creates a matrix of that height and width and assigns each member a random number between 10 and -10. and prints the matrix
It then transposes the matrix so that the columns become the rows and the rows become the columns, and prints that.
If the user inputted the same numbers for both height and width, before printing both the matrix and the transposed matrix,
it will warn the user that their matrix will not be rectangular.
*/

import java.util.Scanner;

public class Transpose{
    public static int[][] randomMatrix(int height, int width){
        int[][] array= new int [height][width];
        for(int j=0; j<array.length; j++ ){
            for(int k=0; k<array[j].length; k++){
            array[j][k]=(int)((Math.random()*21)-10);
            }//end of inner for
        }//end of outter for
        return array;
    }//end of randomMatrix method
    
    public static void printMatrix(int matrix[][]){ 
         int n=matrix.length;
         int m=matrix[0].length;
         for(int i=0; i<n; i++){
            if(m== n){
                System.out.println("Warning: matrix not rectangular.");
                break;
            }//end of if
        }//end of for
        for(int j=0; j<matrix.length; j++ ){
            for(int k=0; k<matrix[0].length; k++){
                if(matrix[j][k]<0 || matrix[j][k]>9){
                    System.out.print(matrix[j][k]+ " ");
                }//end of if
                else{
                System.out.print(" "+matrix[j][k]+ " ");
                }//end of else
            }//end of inner for
                System.out.println();
        }//end of outter for{
        
    }//end of printMatrix method
    
    public static int[][] transposeMatrix(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] t= new int[col][row];
        for(int j=0; j<col; j++){
            for(int k=0; k<row; k++){
                t[j][k]=matrix[k][j];
            }//end of inner for
        }//end of outter for
        return t;
    }//end of transposeMatrix method
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int height=0;
        int tempH;
        System.out.println("Enter a height: ");
        while(height==0){
            if(!input.hasNextInt()){
                System.out.println("Error: please enter an integer: ");
                input.next();
            }//end of if
            else{
                tempH=input.nextInt();
                if(tempH<=0){
                    System.out.println("Error: please enter a positive number: ");
                }//end of inner if
                else{
               height= tempH;
               
                }//end of inner else  
            }//end of else
        }//end of while
         int width=0;
        int tempW;
        System.out.println("Enter a width: ");
        while(width==0){
            if(!input.hasNextInt()){
                System.out.println("Error: please enter an integer: ");
                input.next();
            }//end of if
            else{
                tempW=input.nextInt();
                if(tempW<=0){
                    System.out.println("Error: please enter a positive number: ");
                }//end of inner if
                else{
               width= tempW;
              
                }//end of inner else  
            }//end of else
        }//end of while
        
      
      
     int matrix[][]= randomMatrix(height, width);
      printMatrix(matrix);
      int t[][] = transposeMatrix(matrix);
      System.out.println();
      System.out.println("Transposed:");
      printMatrix(t);
    }//end of main method
    
}//end of class