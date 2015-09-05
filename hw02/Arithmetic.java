//Lindsey Taub CSE2-110 9/5/15

public class Arithmetic {
    public static void main(String[] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
         
        //Total cost of each kind of item; sales tax for that total cost
         double pretotalSockCost$= ((sockCost$*nSocks)+(sockCost$*nSocks*taxPercent))*100;
         int sock$ = (int) pretotalSockCost$;
         double totalSockCost$= sock$/100.0; //total cost of socks
         
         double pretotalGlassCost$= ((glassCost$*nGlasses)+(glassCost$*nGlasses*taxPercent))*100 ; //total cost of glasses
         int glass$ = (int) pretotalGlassCost$;
         double totalGlassCost$= glass$/100.0;
         
         double preEnvelopeCost$=((envelopeCost$*nEnvelopes)+(envelopeCost$*nEnvelopes*taxPercent))*100 ; //total cost of envelopes
         int envelope$ = (int) preEnvelopeCost$;
         double totalEnvelopeCost$= envelope$/100.0;
        //Total cost of purchases (before tax)
         double pretotalBeforeTax$= ((sockCost$*nSocks)+(glassCost$*nGlasses)+(envelopeCost$*nEnvelopes))*100 ;
         int beforetax$= (int) pretotalBeforeTax$;
         double totalBeforeTax$= beforetax$/100.0;
         
         //Total actually paid for this transaction, including sales tax. 
         double preActualTotal$= (totalBeforeTax$+(totalBeforeTax$*taxPercent))*100;
         int total$= (int) preActualTotal$;
         double ActualTotal$= total$/100.0;
         
        
         
         System.out.println("Cost of each type of item seperately with tax:");
         System.out.println("    Socks: " +totalSockCost$);
         System.out.println("    Glasses: " +totalGlassCost$);
         System.out.println("    Envelopes: " +totalEnvelopeCost$);
         
         System.out.println("Total before tax: " +totalBeforeTax$);
         
         System.out.println("Total with tax: " +ActualTotal$);
     
        
    } // end of main method
} // end of class