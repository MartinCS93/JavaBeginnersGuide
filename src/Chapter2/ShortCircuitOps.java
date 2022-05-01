package Chapter2;

//demonstrate the sort-circuit operators
public class ShortCircuitOps {
    public static void main(String[] args) {
        int n, d;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0; //now set to 0
        if (d != 0 && (n % d) == 0) //short circuit operator prevents a division by 0
            System.out.println(d + " is a factor of " + n); //this will not be printed

        //if (d != 0 & (n % d) == 0) //both expressions are evaluated, allowing a division by zero to occur
        // System.out.println(d + " is a factor of " + n);

        //Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
