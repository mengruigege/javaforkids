public class JamesBondCar extends Car{
    public int drive(int howlong) {
        System.out.println("JamesBond drived " + howlong + " hours");
        int distance = howlong * 180;
        return distance;
    }
}
