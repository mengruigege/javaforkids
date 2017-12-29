public class PetMaster {
    public static void main(String[] args){
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.talk("Tweet!!Tweet!!");
        System.out.println(petReaction);
        myPet.sleep();

        Fish myLittleFish = new Fish();
        myLittleFish.dive(2);
        myLittleFish.dive(3);
        myLittleFish.sleep();

        String fishReaction = myLittleFish.talk("Hello");
        System.out.println(fishReaction);
    }
}
