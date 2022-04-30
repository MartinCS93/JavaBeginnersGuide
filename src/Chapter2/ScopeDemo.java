package Chapter2;

//demonstrate block scope
public class ScopeDemo {
    public static void main(String[] args) {
        int x; // x known to all code within main

        x = 10;
        if (x == 10) {//start new scope
            int y = 20; //known only to this block
            //x and y both known here
            System.out.println("x and y: " + x + " and " + y);
            x = y * 2;
            ;
        }
        //y = 100; //Compilation error. y is not known here outside its scope

        System.out.println("x is now: " + x);
    }
}
