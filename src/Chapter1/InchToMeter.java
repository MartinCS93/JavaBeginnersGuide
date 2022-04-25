package Chapter1;

public class InchToMeter {
    //this program converts inches to meters and print a blank line after converting 12 times
    public static void main(String[] args) {
        double inches;
        double meters;
        int counter;
        counter = 0; //set counter value to 0
        double conversion;
        conversion = 39.37; //one meters equals approx. 39.37 inches

        for(inches = 1; inches <= 144; inches++){
            meters = inches / conversion;
            System.out.println(inches + " inches equals " + meters + " meters.");
            counter++; //increment the counter
            if(counter == 12) {
                System.out.println();
                counter = 0; //set counter back to 0
            }
        }
    }
}
