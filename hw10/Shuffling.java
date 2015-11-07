/*
Lindsey Taub
CSE2
hw10
this code prints out all cards in a deck, 
then prints them out in a randomized shuffled order, 
then picks a random hand and prints it.
*/



public class Shuffling{
  
  public static String[] shuffle(String[] list){
     for(int i=0; i<51; i++) {
         int random= (int)((Math.random()*51) +1);
         String standIn= list[random];
         list[random]= list[0];
         list[0]=standIn;
     }//end of for loop
     return list;
  }//end of shuffle method
  
  public static String[] randomizeHand(String[] list){
      String[] standIn= new String[5];
      for(int j=0; j<5; j++){
          int random= (int)((Math.random()*51)+1);
          standIn[j]=list[random];
          
          if(j>0 && standIn[j].equals(standIn[j-1]) ||
            j>1 && standIn[j].equals(standIn[j-2]) ||
            j>2 && standIn[j].equals(standIn[j-3]) ||
            j>3 && standIn[j].equals(standIn[j-4])){
                j--; //checks for repeats
            }//end of if statement
      }//end of for loop
      return standIn;
  }//end of randomizeHand
  
  public static void printArray(String[] list){
      for(int i=0; i<list.length; i++){
          System.out.print(list[i] + " ");
      }//end of for loop
      System.out.printf("\n");
  }//end of printArray
  
  public static void main(String[] args) {
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52];
    String[] hand = new String[5];
    for (int i=0; i<52; i++){
        cards[i]=rankNames[i%13]+suitNames[i/13];
        //System.out.print(cards[i]+" "); ( this was written in the code you gave us but it makes the list of cards print twice.)
    }//end of for loop
    printArray(cards);
    
    shuffle(cards);
    System.out.println("Shuffled");
    
    printArray(cards);
    
    System.out.println("Randomized Hand!");
    hand = randomizeHand(cards);
    printArray(hand);
  }//end of main method
}//end of class