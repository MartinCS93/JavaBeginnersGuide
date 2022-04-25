package Chapter1;

public class MoonAndEarth {
    public static void main(String[] args) {
        double gravityPercentage, weightOnEarth, weightOnMoon;
        gravityPercentage = 0.17; // % for pounds moon/earth
        weightOnEarth = 50;
        weightOnMoon = weightOnEarth * gravityPercentage;
        System.out.println(weightOnEarth + " pounds on Earth are " + weightOnMoon + " pounds on the Moon.");

        System.out.println();

        weightOnEarth = 165.8;
        weightOnMoon = weightOnEarth * gravityPercentage;
        System.out.println(weightOnEarth + " pounds on Earth are " + weightOnMoon + " pounds on the Moon.");

        System.out.println();

        weightOnEarth = 3985.45;
        weightOnMoon = weightOnEarth * gravityPercentage;
        System.out.println(weightOnEarth + " pounds on Earth are " + weightOnMoon + " pounds on the Moon.");

    }
}
