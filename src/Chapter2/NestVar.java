package Chapter2;

/* This program attempts to declare a variable
in an inner scope with the same name as one
defined in an outer scope
!!!This program will not compile!!! */
public class NestVar {
    public static void main(String[] args) {
        int count;

        for (count = 0; count <10; count++){
            System.out.println("This is count: " + count);
            int count; //can't declare count again because it is already declared
            for(count = 0; count<2; count++)
                System.out.println("This program is in error!");
        }
    }
}
