package Chapter2;

//demonstrate dynamic initialization
public class DynamicInitialization {
    public static void main(String[] args) {
        double radius = 4;
        double height = 5;

        //dynamically initialize volume
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Volume is " + volume);

        radius = 8;
        height = 9;

        volume = 3.1416 * radius * radius * height;

        System.out.println("Volume is " + volume);
    }
}
