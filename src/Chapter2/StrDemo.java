package Chapter2;

//demonstrate escape sequences in strings
public class StrDemo {
    public static void main(String[] args) {
        System.out.println("First line\nSecond line"); //use \n to generate a new line
        System.out.println("A\tB\tC"); //use \t(tab) to align output
        System.out.println("D\tE\tF");
        System.out.println("AAAA\tBBBB\tCCCC");
        System.out.println("\t\tAAAA\t\tBBBB\t\tCCCC");
        System.out.println("\"Another one bites the dust\""); // use \" for double quote
        System.out.println("Character\b\b\b"); // use \b for backspace

    }
}
