public class Car {
    public void start(){
        System.out.println("started");
    }

    public void stop(){
        System.out.println("stopped");
    }

    public int drive(int howlong) {
        System.out.println("drived " + howlong + " hours");
        int distance = howlong * 60;
        return distance;
    }
}