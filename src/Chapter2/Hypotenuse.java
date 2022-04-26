package Chapter2;

/* use the Pythagorean theorem
to find the length of the hypotenuse
given the lengths of the two opposing sides */
public class Hypotenuse {
    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x * x + y * y);
        /* .sqrt() method returns a double value
        that is the square root of its double argument */

        System.out.println("Hypotenuse is " + z);

        x=7;
        y=9;

        z=Math.sqrt(x*x+y*y);

        System.out.println("Hypotenuse is " + z);

    }
}
