/*
Lindsey Taub
CSE02 110
This code checks digits in an ISBN number
*/
import java.util.Scanner; // import scanner
import java.text.*;

public class CheckDigit{
    //main method required for every java program
    public static void main(String[] args) {
     Scanner myScanner= new Scanner(System.in);//constructs the instance of Scanner
    System.out.print("Please enter a 10 digit barcode: ");
  String input;
  boolean b = true;
 do{ 
      input= myScanner.next();
      if(input.length()!=10){
    System.out.print("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
   
      }
    } while(input.length()!=10);
    
    
   char zerochar=input.charAt(0);
   char onechar=input.charAt(1);
   char twochar= input.charAt(2);
   char threechar= input.charAt(3);
   char fourchar= input.charAt(4);
   char fivechar=input.charAt(5);
   char sixchar= input.charAt(6);
   char sevenchar= input.charAt(7);
   char eightchar= input.charAt(8);
   char checkchar= input.charAt(9);
  int w= 0; 
  while(b){
   if (zerochar=='1'||zerochar== '2'|| zerochar=='3'|| zerochar== '4'||zerochar== '5' ||zerochar== '6' || zerochar=='7'|| zerochar=='8'|| zerochar=='9' || zerochar=='0'){
       w+=1;}
    if (onechar=='1'||onechar== '2'|| onechar=='3'|| onechar== '4'||onechar== '5' ||onechar== '6' || onechar=='7'|| onechar=='8'|| onechar=='9' || onechar=='0'){
     w+=1;}
    if (twochar=='1'||twochar== '2'|| twochar=='3'|| twochar== '4'||twochar== '5' ||twochar== '6' || twochar=='7'|| twochar=='8'|| twochar=='9' || twochar=='0'){
     w+=1;}
    if (threechar=='1'||threechar== '2'|| threechar=='3'|| threechar== '4'||threechar== '5' ||threechar== '6' || threechar=='7'|| threechar=='8'|| threechar=='9' || threechar=='0'){
     w+=1;}
    if (fourchar=='1'||fourchar== '2'|| fourchar=='3'|| fourchar== '4'||fourchar== '5' ||fourchar== '6' || fourchar=='7'|| fourchar=='8'|| fourchar=='9'|| fourchar=='0'){
     w+=1;}
    if (fivechar=='1'||fivechar== '2'|| fivechar=='3'|| fivechar== '4'||fivechar== '5' ||fivechar== '6' || fivechar=='7'|| fivechar=='8'|| fivechar=='9'|| fivechar=='0'){
     w+=1;}
    if (sixchar=='1'||sixchar== '2'|| sixchar=='3'|| sixchar== '4'||sixchar== '5' ||sixchar== '6' || sixchar=='7'|| sixchar=='8'|| sixchar=='9'|| sixchar=='0'){
     w+=1;}
    if (sevenchar=='1'||sevenchar== '2'|| sevenchar=='3'|| sevenchar== '4'||sevenchar== '5' ||sevenchar== '6' || sevenchar=='7'|| sevenchar=='8'|| sevenchar=='9' ||sevenchar== '0'){
     w+=1;}
    if (eightchar=='1'||eightchar== '2'|| eightchar=='3'|| eightchar== '4'||eightchar== '5' ||eightchar== '6' || eightchar=='7'|| eightchar=='8'|| eightchar=='9' || eightchar=='0'){
     w+=1;}
    if (checkchar=='1'||checkchar== '2'|| checkchar=='3'|| checkchar== '4'||checkchar== '5' ||checkchar== '6' || checkchar=='7'|| checkchar=='8'|| checkchar=='9'||checkchar=='0'|| checkchar=='X'){
     w+=1;}
    if (w == 10) {
        b = false;
        continue;
    }
    System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits:");
    break;
        
    }
    
    

      
   
    
int zeroint= (int) zerochar;
int oneint= (int) onechar;
int twoint= (int) twochar;
int threeint= (int) threechar;
int fourint=(int) fourchar;
int fiveint= (int) fivechar;
int sixint= (int) sixchar;
int sevenint=(int) sevenchar;
int eightint=(int) eightchar;
int checkint=(int) checkchar;

int zero=(zeroint* 10);
int one=(oneint* 9);
int two=(twoint * 8);
int three=(threeint * 7);
int four= (fourint *6);
int five=(fiveint *5);
int six=(sixint *4);
int seven=(sevenint *3);
int eight= (eightint *2);
int checkX;
if (checkchar== 'X'){
 checkX=10;

}



int sum= (zero+one+two+three+four+five+six+seven+eight);

int check= (sum % 11);


if (check == checkint){
 System.out.println("This is a valid ISBN.");
}
else if (check == 10 && check != checkint) {
 System.out.println("This is not a valid ISBN. Check digit should be X");
}
else{
 System.out.println("This is NOT a valid ISBN. Check digit should be " + check );
}


   
   
   
 
    
   
    
  
        
    }// end of main method
}//end of class