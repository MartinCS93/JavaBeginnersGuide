package Chapter1;

public class GalToLitTable {
    //this program will convert gallons(from 1 to 100) to liters and print a blank line after converting 10 times
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0; //line counter is initially set to zero
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; //convert gallons to liters
            System.out.println(gallons + " gallons is " + liters + " liters .");

            counter ++; //increment the line counter with each loop iteration
            if(counter == 10) { //if counter is 10, output a blank line
                System.out.println();
                counter = 0; //reset the line counter
            }
        }
    }
}
