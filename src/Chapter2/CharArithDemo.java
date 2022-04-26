package Chapter2;

//char variables can be handle like integers
public class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch contains " + ch);

        ch++; //a char can be incremented
        System.out.println("ch now contains " + ch);

        ch = 90; // a char can be assigned an integer value
        System.out.println("ch now contains " + ch);
        //90 is the ASCII value that corresponds to letter Z
    }
}
