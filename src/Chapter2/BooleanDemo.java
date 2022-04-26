package Chapter2;

//demonstrate boolean values
public class BooleanDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is " + b + ".");
        b = true;
        System.out.println("b is " + b + ".");

        if (b) System.out.println("This is executed.");
        //boolean value can control the if statement

        b = false;
        if (b) System.out.println("This is not executed");

        System.out.println(("10 > 9 is " + (10 > 9) + "."));
        //outcome of a relational operator is a boolean value
    }
}
