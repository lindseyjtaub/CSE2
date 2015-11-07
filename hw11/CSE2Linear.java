/*
Lindsey Taub
CSE2
hw 11
This program asks the user for 15 grades, and only accepts them if they are integers between 0 and 100 in ascending order
then it asks for another grade and searches for it in the array using binary search and lets the user know if it is present or not
as well as tells the users how many iterations it took to get that result
it then scrambles the array and asks the user for another grade and searches for it in the array using linear search
it then lets the user know if  it is present or not and how many iterations it took to get that result.
*/
import java.util.Scanner;
import java.util.Random;
public class CSE2Linear{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int k=0;
        int[] grades= new int[15];
        int num=0;
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        while(k<15){
            if(!input.hasNextInt()){
                System.out.println("Error: please enter an integer: ");
                input.next();
            }// end of if statement
            else{
                int temp= input.nextInt();
                if(temp>100){
                    System.out.println("Error: please enter a number between 0 and 100: ");
                }//end of if
                else if(num>temp){
                    System.out.println("Error: please enter a number larger than the last: ");
                }//end of else if
                else{
                    num=temp;
                    grades[k]=temp;
                    k++;
                 }//end of inner else
            }//end of else
            
        }//end of while
        System.out.println("grades: ");
        int j=0;
        while (j<15){
            System.out.print(grades[j] + " ");
            j++;
        }//end of while
        System.out.printf("%n");
        System.out.print("Enter a grade to search for: ");
        int gradeL= input.nextInt();
        binary(grades, gradeL);
        
        System.out.println("Scrambled: ");
            scrambled(grades, j) ;
            
        System.out.printf("%n");
        System.out.print("Enter a grade to search for: ");
        int gradeK= input.nextInt();
        linear(gradeK, grades);
        
        
        
    }//end of main method
    public static void binary(int[] grades, int gradeL ){
        int m=0;
        int lowest=0;
        int highest=grades.length-1;
        int mid=(lowest + highest)/2;
       while(lowest<=highest){
           m++;
           if(grades[mid]< gradeL){
            lowest=mid+1;
            mid= (lowest + highest)/2;
           }//end of if
           else if(grades[mid]== gradeL){
             System.out.println( gradeL + " was found with " +m + " iterations."); 
             break;
           }//end of else if
           else{
               highest = mid-1;
               mid = (lowest + highest)/2;
           }//end of else
           if (lowest>highest){
               System.out.println( gradeL + " was not found with "  +m + " iterations.");
           }//end of if
          
       }//end of while
    }//end of binary method
    public static void scrambled(int[] grades, int n){
     for( n=0; n<14; n++) {
         int random= n+ (int)((Math.random()*(grades.length-n)));
         int standin= grades[n];
         grades[n]=grades[random];
         grades[random]= standin;
          
         System.out.print(grades[n] + " ");
     }//end of for loop
    }// end of scrambled method
    public static void linear(int gradeK, int[] grades){
        int s=0;
        for(int t=0; t<15; t++){
             s++;
            if (grades[t]==gradeK){
                System.out.println(gradeK + " was found with " +s + " iterations.");
                break;
            }//end of if
            else if (t==14 && grades[14]!=gradeK){
                System.out.println(gradeK + " was not found with " +s + " iterations.");
        
                
            }//end of else if
        }//end of for
    }// end of linear method
    
}//end of class
