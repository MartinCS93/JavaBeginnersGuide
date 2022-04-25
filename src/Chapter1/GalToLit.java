package Chapter1;

public class GalToLit {
    //this program converts Gallons to Liters
    public static void main(String[] args) {
        double gallons; //holds the number of gallons
        double liters; //holds conversion to liters

        gallons = 10; //start with 10 gallons
        //there are 3.7854 liters in a gallon
        liters = gallons * 3.7854; //convert to liters
        System.out.println(gallons + " gallons is " + liters + " liters.");

        gallons = 17.3;
        liters = gallons * 3.7854;
        System.out.println(gallons + " gallons is " + liters + " liters.");

        gallons = 25.8;
        liters = gallons * 3.7854;
        System.out.println(gallons + " gallons is " + liters + " liters.");

    }
}
