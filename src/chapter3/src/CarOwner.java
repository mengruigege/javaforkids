import rui.meng.*;

public class CarOwner {
    public static void main(String[] args){
        JamesBondCar myCar = new JamesBondCar();
        myCar.start();
        int distance = myCar.drive(3);
        System.out.println("My car has been driven " + distance + " miles");
        myCar.stop();

        Person mengRui = new Chinese();
        Person.name = "Meng Rui";
        mengRui.height = 1.45;
        mengRui.age = 11;
        mengRui.job = "Student";
        mengRui.sex = "male";
        mengRui.eat();
        mengRui.sleep();
        mengRui.work();

        MountainBike myBike = new MountainBike();
        myBike.speed = 21;
        myBike.brand = "ofo";
        myBike.height = 24;
        myBike.model = "big";
        int s = myBike.ride(2);
        System.out.println("my bike ride " + s + " miles");
        myBike.stop();
    }
}
