package Chapter2;

//side effects can be important
public class SideEffects {
    public static void main(String[] args) {
        int i;
        i = 0;

        if (false & (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); //displays 1

        if (false && (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); //still 1

        if (false & (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); //displays 2

        if (false && (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); //still 2
    }
}
