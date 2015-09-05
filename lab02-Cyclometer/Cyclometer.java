//Lindsey Taub CSE2-110 9/4/15
// This program prints the number of minutes for each trip,
//prints the number of counts for each trip,
//prints the distance of each trip in miles,
// and prints the distance for the two trips combined

public class Cyclometer {
    // main method required for every Java Program
    public static void main(String[] args) {
        //input data
        int secsTrip1=480;  // number of seconds for trip 1
        int secsTrip2=3220; // number of seconds for trip 2
        int countsTrip1=1561;   // number of rotations for trip 1
        int countsTrip2=9037;   // number of rotations for trip 2
        // intermediate variables and output data
        double wheelDiameter=27.0,
      PI=3.14159,   // the diameter of the wheel and the number PI used in calculating the diameter
            feetPerMile=5280,   // how many feet are in a mile
            inchesPerFoot=12,   // how many inches are in a foot
            secondsPerMinute=60;    // how many seconds are in a minute
        double distanceTrip1, distanceTrip2, totalDistance; // states that we want the distance of trip 1, the distance of trip 2, and the total distance to be floats with extra numerical percision
   
   System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute) +" minutes and had "+
        countsTrip1+" counts.");
    System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute) +" minutes and had "+
        countsTrip2+" counts.");
        // run the calculations; store the values
        // calculating how long each trip took ( seconds of trip divided by seconds per minute) 
        // and also prints how many rotations were in each trip
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        // the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        //Print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
   
   
    }   //end of main method
} //end of class