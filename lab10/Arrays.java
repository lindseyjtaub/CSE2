/*
Lindsey Taub
CSE2
This lab asks the user for a random number of names and then randomly assigns that many number
of midterm grades and prints them.
*/
import java.util.Scanner;

public class Arrays{
    public static void main(String[] args){
    int studentnum = (int) (Math.random() *6) + 5;
    String[] students = new String[studentnum];
    int[] midterm = new int[studentnum];
   
    Scanner input = new Scanner(System.in);
    int k=0;
    System.out.println("Enter " + studentnum + " student names: ");
    while(k<studentnum){
    students[k]=input.next();
    midterm[k]= (int) (Math.random() *101);
    k++;
    }
    int j=0;
    System.out.println("Here are the midterm grades of the " + studentnum + " students above: ");
    while(k==studentnum){
    System.out.println(students[j] + ": " + midterm[j]);
    j++;
        if(j== studentnum){
            break;
        }
    
    }
        
    }
}