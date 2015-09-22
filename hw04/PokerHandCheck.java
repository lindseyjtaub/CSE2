
//Lindsey Taub CSE02 hw#4


public class PokerHandCheck{
    //main method
    public static void main(String[] args) {
        System.out.println("Your random cards were:");
        int card1= (int) (Math.random() *53) + 1;
         String suit1;
         String cardname1;
        if ( card1<= 13 ) {
         suit1 = "diamonds";
         
        }
        else if ( card1>= 14 && card1<=26 ) {
        suit1 = "clubs";
        card1= card1 - 13;
        }
        else if ( card1>= 27 && card1<=39 ) {
        suit1 = "hearts";
        card1= card1 - 26;
        }
        else {
        suit1 = "spades";
        card1= card1 - 39;
        }
    switch(card1){
        case 1:
        case 14:
        case 27:
        case 40:
            cardname1="ace";
            break;
        case 11:
        case 24:
        case 37:
        case 50:
            cardname1="jack";
            break;
        case 12:
        case 25:
        case 38:
        case 51:
            cardname1="queen";
            break;
        case 13:
        case 26:
        case 39:
        case 52:
            cardname1="king";
            break;
        default:
            cardname1= "" + card1;
            break;
         }
   System.out.println(" the " + cardname1 + " of " + suit1 );
   // random number 2
    int card2= (int) (Math.random() *53) + 1;
         String suit2;
         String cardname2;
        if ( card2<= 13 ) {
         suit2 = "diamonds";
         
        }
        else if ( card2>= 14 && card2<=26 ) {
        suit2 = "clubs";
        card2= card2 - 13;
        }
        else if ( card2>= 27 && card2<=39 ) {
        suit2 = "hearts";
        card2= card2 - 26;
        }
        else {
        suit2 = "spades";
        card2 = card2 - 39;
        }
    switch(card2){
        case 1:
        case 14:
        case 27:
        case 40:
            cardname2="ace";
            break;
        case 11:
        case 24:
        case 37:
        case 50:
            cardname2="jack";
            break;
        case 12:
        case 25:
        case 38:
        case 51:
            cardname2="queen";
            break;
        case 13:
        case 26:
        case 39:
        case 52:
            cardname2="king";
            break;
        default:
            cardname2= "" + card2;
            break;
         }
   System.out.println(" the " + cardname2 + " of " + suit2 );
   // random number 3
   int card3= (int) (Math.random() *53) + 1;
         String suit3;
         String cardname3;
        if ( card3<= 13 ) {
         suit3 = "diamonds";
         
        }
        else if ( card3>= 14 && card3<=26 ) {
        suit3 = "clubs";
        card3= card3 - 13;
        }
        else if ( card3>= 27 && card3<=39 ) {
        suit3 = "hearts";
        card3= card3 - 26;
        }
        else {
        suit3 = "spades";
        card3 = card3 - 39;
        }
    switch(card3){
        case 1:
        case 14:
        case 27:
        case 40:
            cardname3="ace";
            break;
        case 11:
        case 24:
        case 37:
        case 50:
            cardname3="jack";
            break;
        case 12:
        case 25:
        case 38:
        case 51:
            cardname3="queen";
            break;
        case 13:
        case 26:
        case 39:
        case 52:
            cardname3="king";
            break;
        default:
            cardname3= "" + card3;
            break;
         }
   System.out.println(" the " + cardname3 + " of " + suit3 );
   // random number 4
   int card4= (int) (Math.random() *53) + 1;
         String suit4;
         String cardname4;
        if ( card4<= 13 ) {
         suit4 = "diamonds";
         
        }
        else if ( card4>= 14 && card4<=26 ) {
        suit4 = "clubs";
        card4= card4 - 13;
        }
        else if ( card4>= 27 && card4<=39 ) {
        suit4 = "hearts";
        card4= card4 - 26;
        }
        else {
        suit4 = "spades";
        card4 = card4 - 39;
        }
    switch(card4){
        case 1:
        case 14:
        case 27:
        case 40:
            cardname4="ace";
            break;
        case 11:
        case 24:
        case 37:
        case 50:
            cardname4="jack";
            break;
        case 12:
        case 25:
        case 38:
        case 51:
            cardname4="queen";
            break;
        case 13:
        case 26:
        case 39:
        case 52:
            cardname4="king";
            break;
        default:
            cardname4= ""+ card4;
            break;
         }
   System.out.println(" the " + cardname4 + " of " + suit4 );
   // random number 5
   int card5= (int) (Math.random() *53) + 1;
         String suit5;
         String cardname5;
        if ( card5<= 13 ) {
         suit5 = "diamonds";
         
        }
        else if ( card5>= 14 && card5<=26 ) {
        suit5 = "clubs";
        card5= card5 - 13;
        }
        else if ( card5>= 27 && card5<=39 ) {
        suit5 = "hearts";
        card5= card5 - 26;
        }
        else {
        suit5 = "spades";
        card5 = card5 - 39;
        }
    switch(card5){
        case 1:
        case 14:
        case 27:
        case 40:
            cardname5="ace";
            break;
        case 11:
        case 24:
        case 37:
        case 50:
            cardname5="jack";
            break;
        case 12:
        case 25:
        case 38:
        case 51:
            cardname5="queen";
            break;
        case 13:
        case 26:
        case 39:
        case 52:
            cardname5="king";
            break;
        default:
            cardname5= "" + card5;
            break;
         }
   System.out.println(" the " + cardname5 + " of " + suit5 );
   
   String handID;
    if(((cardname1==cardname2)&&(cardname2==cardname3))||((cardname1==cardname2)&&(cardname2==cardname4))||((cardname1==cardname2)&&(cardname2==cardname5))||
            ((cardname1==cardname3)&&(cardname3==cardname4))||((cardname1==cardname3)&&(cardname3==cardname5))||((cardname1==cardname4)&&(cardname4==cardname5))||
            ((cardname2==cardname3)&&(cardname3==cardname4))||((cardname2==cardname3)&&(cardname3==cardname5))||((cardname2==cardname4)&&(cardname4==cardname5))||
            ((cardname3==cardname4)&&(cardname4==cardname5))||((card1==card2)&&(card2==card3))||((card1==card2)&&(card2==card4))||((card1==card2)&&(card2==card5))||
            ((card1==card3)&&(card3==card4))||((card1==card3)&&(card3==card5))||((card1==card4)&&(card4==card5))||((card2==card3)&&(card3==card4))||
            ((card2==card3)&&(card3==card5))||((card2==card4)&&(card4==card5))||((card3==card4)&&(card4==card5))) { 
            System.out.println("You have a triple!"); 
            }
       
       else if((cardname1 == cardname2) && (cardname3 == cardname4) || (cardname1 == cardname2) && (cardname3 == cardname5) ||
        (cardname1 == cardname2) && (cardname4 == cardname5) || (cardname1 == cardname3) && (cardname2 == cardname4) || (cardname1 == cardname3)
        && (cardname2 == cardname5) || (cardname1 == cardname4) && (cardname2 == cardname3) || (cardname1 == cardname4) && (cardname2 == cardname5)
        || (cardname1 == cardname5) && (cardname2 == cardname3) || (cardname1 == cardname5) && (cardname2 == cardname4) || (cardname2 == cardname3)
        && (cardname1 == cardname4) || (cardname2 == cardname3) && (cardname1 == cardname5) || (cardname2 == cardname3) && (cardname4 == cardname5)||
        (card1 == card2) && (card3 == card4) || (card1 == card2) && (card3 == card5) ||
        (card1 == card2) && (card4 == card5) || (card1 == card3) && (card2 == card4) || (card1 == card3)
        && (card2 == card5) || (card1 == card4) && (card2 == card3) || (card1 == card4) && (card2 == card5)
        || (card1 == card5) && (card2 == card3) || (card1 == card5) && (card2 == card4) || (card2 == card3)
        && (card1 == card4) || (card2 == card3) && (card1 == card5) || (card2 == card3) && (card4 == card5)||
        
        (cardname1 == cardname2) && (card3 == card4) || (cardname1 == cardname2) && (card3 == card5) ||
        (cardname1 == cardname2) && (card4 == card5) || (cardname1 == cardname3) && (card2 == card4) || (cardname1 == cardname3)
        && (card2 == card5) || (cardname1 == cardname4) && (card2 == card3) || (cardname1 == cardname4) && (card2 == card5)
        || (cardname1 == cardname5) && (card2 == card3) || (cardname1 == cardname5) && (card2 == card4) || (cardname2 == cardname3)
        && (card1 == card4) || (cardname2 == cardname3) && (card1 == card5) || (cardname2 == cardname3) && (card4 == card5)||
        
        (card1 == card2) && (cardname3 == cardname4) || (card1 == card2) && (cardname3 == cardname5) ||
        (card1 == card2) && (cardname4 == cardname5) || (card1 == card3) && (cardname2 == cardname4) || (card1 == card3)
        && (cardname2 == cardname5) || (card1 == card4) && (cardname2 == cardname3) || (card1 == card4) && (cardname2 == cardname5)
        || (cardname1 == cardname5) && (cardname2 == cardname3) || (cardname1 == cardname5) && (cardname2 == cardname4) || (card2 == card3)
        && (cardname1 == cardname4) || (card2 == card3) && (cardname1 == cardname5) || (card2 == card3) && (cardname4 == cardname5))
        {
      
    
          System.out.println("You have a two pair!");    
       }
    else if ( cardname1==cardname2||cardname1==cardname3||cardname1==cardname4||cardname1==cardname5||
      cardname2==cardname3||cardname2==cardname4||cardname2==cardname5||cardname3==cardname4||
      cardname3==cardname5||cardname4==cardname5||
      card1==card2||card1==card3||card1==card4||card1==card5||
      card2==card3||card2==card4||card2==card5||card3==card4||
      card3==card5||card4==card5
      ){
           System.out.println("You have a pair!");
          
      }
        
   
    else{
        System.out.println("You have a high card hand!");
    }
    
   
    }//end of main method
}//end of class
      