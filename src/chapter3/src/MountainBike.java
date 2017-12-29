public class MountainBike extends Bike{
    int speed;
    public int ride(int time){
        System.out.println("riding");
        int distance = time * speed * 2;
        return distance;
    }
}
