// Lindsey Taub CSE2-110 9/11/15
// this program uses scanner to get the original cost of the check, the percent tip desired, and the number of people to split the check between
// then it determines how much each person needs to pay
import java.util.Scanner ; // import scanner

public class Check{
    // main method required for every java program
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in ) ; // constructs the instance of Scanner
        
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        
        double checkCost= myScanner.nextDouble(); // accepts user input
        
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble(); // prompts user for the tip percent that they want to pay and accept the input
            tipPercent /= 100 ; //we want to convert to the percentage into a decimal value
            
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();// prompts user for # of people who went to dinner
    
        // outputs the amount each member of the group needs to spend in order to pay the check
        double totalCost;
        double costPerPerson;
        int dollars,    //whole dollar amount of cost
            dimes, pennies; //for storing digits to the right of the decimal point for the cost$
            
        totalCost = checkCost * (1+ tipPercent);
        costPerPerson = totalCost / numPeople ;
        //get the whole amount and drops decimal fraction
        dollars=(int) costPerPerson;
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7 where the % (mod) operator returns the remainder after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(costPerPerson *10) % 10;
        pennies=(int)(costPerPerson *100) % 10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies) ;
        
    } // end of main method
} // end of class