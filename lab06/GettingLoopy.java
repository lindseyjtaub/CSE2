/* Lindsey Taub
10/2/15
Lab #5
This program utilizes loops to 
a) generates a sequence of numbers up to 7 and prints out multiple 7s
b) prints out all prime numbers from 0-100
c) print out a random number of smiley faces
*/

public class GettingLoopy{
    //main method
    public static void main(String[] args){
    System.out.print("STEP 1:");
    System.out.printf("%n");
    int num=0, capacity = 7;
    while (num<7){
        ++num;
        System.out.print(num);
        while (num==7){
            System.out.println(777777);
            break;
        }
    }
  
  System.out.print( "STEP 2:" ); 
  int prime= 10;
  System.out.printf("%n");
  System.out.print("While Loop: ");
  while(prime<100){
      if ((prime%2!=0 && prime%3!=0 && prime%5!=0 && prime%7!=0)){
      System.out.print(  prime + " " );
      
  }
      prime++;
  }
    System.out.printf("%n");
    System.out.print("For Loop: ");  
  int primefor=10;
 
  for( primefor= 10; primefor<=100; primefor++){
      if (primefor%2!=0 && primefor%3!=0 && primefor%5!=0 && primefor%7!=0){
      System.out.print(  primefor + " " );
      }
       

      
      
  }
  
  System.out.printf("%n");
    int primedo= 10;
  System.out.print("Do While Loop: ");
 do{primedo++;
      if ((primedo%2!=0 && primedo%3!=0 && primedo%5!=0 && primedo%7!=0)){
      System.out.print(  primedo + " " );
      }
    
   } while(primedo <=100);

 System.out.printf("%n");
 System.out.print("STEP 3:");
 System.out.printf("%n");
int symbolnum= (int)(Math.random()*(201)) +5;
String symbol= "ツ";
int newnum= 5;
while(newnum<=symbolnum){
System.out.print(symbol);
newnum++;
}
  
  
    }// end of main method
}//end of class