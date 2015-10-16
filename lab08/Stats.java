/*
Lindsey Taub
CSE2
Lab08
This code asks user for five inputs and finds the mean and median of the inputs
*/
import java.util.Scanner;

public class Stats{
   
    public static double CalculateMean(double one, double two, double three, double four, double five){
        return ((one+two+three+four+five)/5);
        
    }

    public static double CalculateMedian(double one, double two, double three, double four, double five){
        return three;
        
    }

    public static void printInput(double mean, double median){
        System.out.println("mean is: " + mean);
        System.out.println("median is: " + median);
        
    }
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean acceptable=false;
      double one=0;
      double two=0;
      double three=0;
      double four=0;
      double five=0;
       int n=1;
       double last = 0;
        System.out.println("Please enter a double:");
        while(!acceptable){
            if(n==1){
                one = input.nextDouble();
                 last = one;
                n++;
                
        }
          else  if(n==2){
                System.out.println("Enter a double larger than the last:");
                two=input.nextDouble();
                if(two<last){
                    System.out.println("Error: you didnt insert a larger number.");
                    
                }
                else{
                    last = two;
                    n++;
                    
                }
            }
           else if(n==3){
                 System.out.println("Enter a double larger than the last:");
                 three=input.nextDouble();
                if(three<last){
                    System.out.println("Error: you didnt insert a larger number.");
                    
                }
                else{
                    last = three;
                    n++;
                    
                }
                
            }
           else if(n==4){
                 System.out.println("Enter a double larger than the last:");
                four=input.nextDouble();
                if(four<last){
                    System.out.println("Error: you didnt insert a larger number.");
                    
                }
                else{
                    last = four;
                    n++;
                   
                }
                
            }
       else if(n==5){
                 System.out.println("Enter a double larger than the last:");
                five= input.nextDouble();
                if(five<last){
                    System.out.println("Error: you didnt insert a larger number.");
                    
                }
                else{
                    last = five;
                    n++;
                    
                }
       }
        else{
             double  mean =CalculateMean(one, two, three, four, five);      
         double median = CalculateMedian(one,two,three,four,five);
        printInput(mean, median);            
            acceptable=true;
        }
                
            
   
    }
            
    
    }//end of main method
}

