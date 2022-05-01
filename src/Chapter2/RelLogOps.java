package Chapter2;

//demonstrate the relation and logical operators
public class RelLogOps {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;
        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("this won't execute");
        if (i >= j) System.out.println("this won't execute");
        if (i > j) System.out.println("this won't execute");

        System.out.println();

        b1 = true;
        b2 = false;
        if (b1 & b2) System.out.println("this won't execute");
        if (!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if (b1 | b2) System.out.println("b1 | b2 is true");
        if (b1 ^ b2) System.out.println("b1 ^ b2 is true");

        System.out.println();

        int x, y;
        x = 10;
        System.out.println("x is: " + x);
        y = ++x;
        System.out.println("y is: " + y);
        System.out.println("x is now: " + x);

        System.out.println();

        int a, b;
        a = 10;
        System.out.println("a is: " + a);
        b = a++;
        System.out.println("b is: " + b);
        System.out.println("a is now: " + a);
    }
}
