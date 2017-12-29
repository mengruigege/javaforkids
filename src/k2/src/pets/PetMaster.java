package pets;

public class PetMaster {
    public static void main(String[] args){
        Bear bigbear = new Bear("blackbear");
        bigbear.talk();

        Talkable mr = new Talkable() {
            @Override
            public void talk() {
                System.out.println("I am bear");
            }
        };
        mr.talk();

        Talkable xd = () -> {
            System.out.println("I'm a bear(xiongda)");
        };
        xd.talk();
    }
}
