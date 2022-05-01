package Chapter2;

//demonstrate automatic conversion from long to double
public class LongToDouble {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L; //automatic conversion from long to double

        System.out.println("L and D: " + L + " " + D);

        /* *** there is no automatic conversion from double to long ***
           *** there are no automatic conversions from the numeric types to char or boolean ***
           *** char and boolean are not compatible with each other ***
           *** integer literal can be assigned to char ***
         */

    }
}
