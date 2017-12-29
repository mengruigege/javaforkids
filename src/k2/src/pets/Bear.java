package pets;

public class Bear implements Talkable {
    String name;

    public Bear(String name){
        this.name = name;
    }

    public void talk(){
        System.out.println("Hello, I'm " + name);
    }
}
