package Chapter1;

public class ForDemo {
    public static void main(String[] args) {
        int count;
        for (count = 0; count < 5; count = count + 1) //this loop iterates 5 times
            //count = 0 - loop control variable set to zero
            //count < 5 - if is true, println() statement is executed
            //count = count + 1 - iteration portion of the loop is executed, which increases int count by 1
            //(count = count + 1) = count++
            //for (count = 0; count < 5; count++) better way to write this loop
            //there is also a decrement operator -- which decreases its operand by 1
            System.out.println("This is count: " + count);

        System.out.println("Done!");
    }
}
