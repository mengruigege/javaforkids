public class Bike {
    String brand;
    String model;
    volatile int height;

    public void stop(){
        System.out.println("stopped");
    }

    public int ride(int time){
        System.out.println("riding");
        int distance = time * 15;
        return distance;
    }
}
