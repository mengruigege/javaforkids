package lambdapets;

public class PetMasterLamda {
    public static void main(String[] args) {
        Talkative dog = new Talkative() {
            @Override
            public String talk(String petName) {
                return "my name is " + petName;
            }
        };
        Pet pet1 = new Pet(dog, "jf");
        String s = pet1.speakup();
        System.out.println(s);

        Talkative parrot = (name) -> {
            return "my parrot name is " + name;
        };
        Pet pet2 = new Pet(parrot,"gh");
        String x = pet2.speakup();
        System.out.println(x);
    }
}
