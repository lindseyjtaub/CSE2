// Lindsey Taub CSE2-110 9/18/15
//

public class CardGenerator{
    //main method
    public static void main(String[] args) {
  String suit;
  String cardName;
  int card= (int) (Math.random() *52 + 1);
  if ( card<= 13 ) {
      suit = "diamonds";
      switch(card){
          case 1:
          cardName=("ace");
              break;
          case 2:
              cardName= ("2");
              break;
          case 3:
              cardName=("3");
                break;
          case 4:
              cardName=("4");
                break;
          case 5:
               cardName=("5");
              break;
         case 6:
             cardName=("6");
             break;
          case 7:
              cardName=("7");
              break;
          case 8:
               cardName=("8");
                break;
          case 9:
              cardName=("9");
                break;
          case 10:
              cardName=("10");
              break;    
          case 11:
            cardName=("jack");
            break;
          case 12:
          cardName=("queen");
          break;
          case 13:
          cardName=("king");
          break;
          default:
                cardName= ""+ card;
                break;
      
      }
     System.out.println( "You picked the " + cardName + " of " + suit);
      
  }
  
  else if ( card>= 14 && card<=26 ) {
      suit = "clubs";
      switch(card){
          case 14:
            cardName=("ace");
            break;
          case 15:
              cardName= ("2");
              break;
          case 16:
              cardName=("3");
                break;
          case 17:
              cardName=("4");
                break;
          case 18:
               cardName=("5");
              break;
         case 19:
             cardName=("6");
             break;
          case 20:
              cardName=("7");
              break;
          case 21:
               cardName=("8");
                break;
          case 22:
              cardName=("9");
                break;
          case 23:
              cardName=("10");
              break;
          case 24:
             cardName=("jack");
                break;
          case 25:
            cardName=("queen");
                break;
          case 26:
            cardName=("king");
                break;
              default:
                cardName= ""+ card;
                break;
        
      }
      
     System.out.println( "You picked the " + cardName + " of " + suit);
      
  }
   else if ( card>= 27 && card<=39 ) {
      suit = "hearts";
      switch(card){
          case 27:
            cardName=("ace");
            break;
          case 28:
              cardName=("2");
              break;
          case 29:
              cardName=("3");
                break;
          case 30:
             cardName=("4");
                break;
          case 31:
               cardName=("5");
              break;
         case 32:
              cardName=("6");
             break;
          case 33:
               cardName=("7");
              break;
          case 34:
               cardName=("8");
                break;
          case 35:
              cardName=("9");
                break;
          case 36:
              case 15:
              cardName= ("2");
              break;
          case 38:
            cardName=("queen");
                break;
          case 39:
            cardName=("king");
                break;
                default:
                cardName= ""+ card;
                break;
      
      }
     System.out.println( "You picked the " + cardName + " of " + suit);
      
  }
  else if ( card>= 40 && card<=52 ) {
      suit = "spades";
      switch(card){
          case 40:
            cardName=("ace");
            break;
          case 41:
              cardName=("2");
              break;
          case 42:
              cardName=("3");
                break;
          case 43:
              cardName=("4");
                break;
          case 44:
              cardName=("5");
              break;
         case 45:
             cardName=("6");
             break;
          case 46:
              cardName=("7");
              break;
          case 47:
              cardName=("8");
                break;
          case 48:
              cardName=("9");
                break;
          case 49:
              cardName=("10");
              break;
          case 50:
            cardName=("jack");
                break;
          case 51:
            cardName=("queen");
                break;
          case 52:
            cardName=("king");
                break;
                default:
                cardName= ""+ card;
                break;
      
      }
     System.out.println( "You picked the " + cardName + " of " + suit );
      
        
      }
   
   
   
   
    } // end of main method
} // end of class