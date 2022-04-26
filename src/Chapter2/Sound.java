package Chapter2;

//compute the distance to a lighting strike
public class Sound {
    public static void main(String[] args) {
        double dist, speed, time;
        speed = 1100; //sounds travels approx. 1100 feet per second through air
        time = 7.2;
        dist = speed * time;

        System.out.println("The lighting is " + dist + " feet away.");

        speed = 1100;
        time = 15.97;
        dist = speed * time;

        System.out.println("The lighting is " + dist + " feet away.");
    }
}
