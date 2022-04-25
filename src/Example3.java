public class Example3 {
    //Difference between int and double
    public static void main(String[] args) {
        int v; //declaring int variable
        double x; //declaring double variable (floating-point)

        v = 10; // assign v the value 10
        x = 10.0; //assign x the value 10.0

        System.out.println("Original value of v: " + +v);
        System.out.println("Original value of x: " + x);
        System.out.println(); //printing a blank line

        //diving both by 4
        v = v / 4;
        x = x / 4;

        System.out.println("v after division: " + v); //fractional component lost
        System.out.println("x after division: " + x); //fractional component preserved
    }
}
