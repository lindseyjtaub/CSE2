/*
Lindsey Taub
Lab 11
CSE2
This program creates two arrays both with 5000 numbers in it and between the range of 0-100000
array1 generate random numbers and stores them. It then uses a linear search to find the max and min
array2 generates random numbers but in ascending order and stores them. It then finds the max and the min (array[0] and array[49999])
then the user is asked for an input, if the value is less than 0 the program exits
if it is <=0 the code uses binary search to look for that value.
if the value is not in the array, it prints the upper and lower bound value that the number would be in between had it been in the array.
*/
import java.util.Scanner;

public class Search{
    public static void main(String[] args){
        int[] array1= new int[5000];
        int[] array2= new int[5000];
        int k=0;
        int i=0;
        while(k<5000){
            array1[k]=(int)(Math.random()*100001);
            k++;
        }//end of while loop
        int max;
        int min;
        if(array1[0]>array1[1]){
            max=array1[0];
            min=array1[1];
        }// end of if
        else{
           max=array1[1];
           min=array1[0];
        } // end of else
        
        for(int m=0; m<5000; m++ ){
            if(array1[m]>max){
                max=array1[m];
            }//end of if
            else if(array1[m]<min){
                min=array1[m];
            }//end of else if
        }//end of for
       System.out.println("The maximum of array1 is: " + max);
       System.out.println("The minimum of array1 is: " + min);
       
      
       int last=0;
       int temp;
            for(int j=0; j<array2.length; j++){
                 array2[j]=(int)(Math.random()*(100000-last))+last;
                last=array2[j];
                
                    
            }//end of for
           int max2=array2[array2.length-1];
           int min2=array2[0];
           System.out.println("The maximum of array2 is: " + max2);
           System.out.println("The minimum of array2 is: " + min2);
        Scanner input = new Scanner(System.in);   
        System.out.println("Enter an integer >=0: ");
        int userin= input.nextInt();
        if (userin<0){
           System.exit(0);
        }//end of if
       
        int lowest=0;
        int highest=array2.length-1;
        int mid=(lowest + highest)/2;
       while(lowest<=highest){
           if(array2[mid]< userin){
            lowest=mid+1;
            mid= (lowest + highest)/2;
           }//end of if
           else if(array2[mid]== userin){
             System.out.println( userin + " was found."); 
             break;
           }//end of else if
           else{
               highest = mid-1;
               mid = (lowest + highest)/2;
           }//end of else
           if (lowest>highest){
               System.out.println( userin + " was not found.");
               if(userin>100000){
                   System.out.println("The number above the key was none");
                   
               }//end of inner if
               else{
                    System.out.println("The number above the key was "+ array2[lowest] );
               }//end of inner else
               if(userin<array2[0]){
                    System.out.println("The number below the key was none ");
               }//end of if
               else{
                    System.out.println("The number below the key was " + array2[highest]);
               }//end of inner else
               break;
           }//end of if
                
       }//end of while
       
         
    }//end of main method
}//end of class
