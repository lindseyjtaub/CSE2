/*
Lindsey Taub
CSE2 110
this code creates a bar graph based on a college students weekly spendings
also estimates spendings for the next 4 years based on weekly average
*/
import java.util.Scanner ; // import scanner


public class BarGraph{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );//constructs the instance of Scanner
    
 
       System.out.println("Enter expenses for Monday: $");
        
        while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
      
            }
             double dateInputM = myScanner.nextDouble();
        while (dateInputM<0){
            System.out.print("please only enter positive number: $");
            myScanner.next();
            break;
        }
      
       
             
               
               
     System.out.println("Enter expenses for Tuesday: $");
         while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
      
            }
              double dateInputT= myScanner.nextDouble();
           while (dateInputT<0){
            System.out.print("please only enter positive number: $");
            myScanner.next();
               break;
           }
     
               
               
               
     System.out.println("Enter expenses for Wednesday: $");
          while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
            }      
             double dateInputW= myScanner.nextDouble();  
           while (dateInputW<0){
            System.out.print("please only enter positive number: $");
            myScanner.next();
            break;}
         
    
       
     
     
     System.out.println("Enter expenses for Thursday: $");
             while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
      
            }   
        double dateInputTH= myScanner.nextDouble();
          while (dateInputTH<0){
            System.out.print("please only enter positive number: $");
            myScanner.next();
              break;
          }
      
       
     
     System.out.println("Enter expenses for Friday: $");
               while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
      
            }
             
           double  dateInputF= myScanner.nextDouble();
          while (dateInputF<0){
            System.out.print("please only enter positive number: $");
            myScanner.next();
            break;
          }
          
        
      
     
     
     System.out.println("Enter expenses for Saturday: $");
               while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
      
            }
         double  dateInputST= myScanner.nextDouble();
          while (dateInputST<0){
            System.out.print("please only enter positive number: $");
            myScanner.next();
            break;
              
          }
       
      
     
     
     System.out.println("Enter expenses for Sunday: $");
            while (!myScanner.hasNextDouble()) {
            System.out.print("Sorry, you did not enter an integer. Try again: $");
            myScanner.next();
      
            }
   double  dateInputSU= myScanner.nextDouble();     
        while (dateInputSU<0){
            System.out.print("please only enter positive number: $");
            myScanner.next();
       break;
        }

            
        
        
       
        
    String point="*";
   
    int pointM= (int)(dateInputM + 0.5) ;
    int pointT= (int)(dateInputT + 0.5) ;
    int pointW= (int)(dateInputW + 0.5) ;
    int pointTH= (int) (dateInputTH + 0.5);
    int pointF= (int)(dateInputF + 0.5);
    int pointST= (int)(dateInputST + 0.5);
    int pointSU= (int)(dateInputSU + 0.5);    
    int pointnumM=1;
    int pointnumT=1;
    int pointnumW=1;
    int pointnumTH=1;
    int pointnumF=1;
    int pointnumST=1;
    int pointnumSU=1;
   System.out.print("Mon:") ;
    while(pointnumM<=pointM){
        System.out.print(point);
        pointnumM++;
    }
    
    System.out.printf("%n");
     System.out.print("Tues:") ;
    while(pointnumT<=pointT){
        System.out.print(point);
        pointnumT++;
    
    }
    
    System.out.printf("%n");
   System.out.print("Weds:") ;
    while(pointnumW<=pointW){
        System.out.print(point);
        pointnumW++;
    }
    
    System.out.printf("%n");
    System.out.print("Thurs:") ;
    while(pointnumTH<=pointTH){
        System.out.print(point);
        pointnumTH++;
    }
    
    System.out.printf("%n");
    System.out.print("Fri:") ;
    while(pointnumF<=pointF){
        System.out.print(point);
        pointnumF++;
    }
    
    System.out.printf("%n");
      System.out.print("Sat:") ;
    while(pointnumST<=pointST){
        System.out.print(point);
        pointnumST++;
    }
    
    System.out.printf("%n");
      System.out.print("Sun:") ;
    while(pointnumSU<=pointSU){
        System.out.print(point);
        pointnumSU++;
    }



 float dailyavg= (float) ((dateInputM+dateInputT+dateInputW+dateInputTH+dateInputF+dateInputST+dateInputSU)/7);
 double rounded= (double)dailyavg- dailyavg %.01;
 System.out.printf("%n");
while(1==1){
System.out.println("Your average daily expenses are: $" + rounded);
break;
}//this part of code was glitchy unless I used a loop
 System.out.printf("%n");
double avgweek= rounded*7;
double week=0;
double total=0;
double num= (Math.random()*1.2 +.8);
for(int i=0; i<=208;i++){
  
  
week= avgweek * num;
total= total + week;




}    System.out.println("Estimated expenditure for 4 years: $" +(total-(total %.01)));
  
    



    
    
        

   
      
    
        
    }//end of main method
}//end of class