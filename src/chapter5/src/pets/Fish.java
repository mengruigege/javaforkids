package pets;

public class Fish extends Pet implements Swimmable{
    public Fish(String name){
        super(name);
    }
    public void swim(int howFar){
        System.out.println(name + ": swimming");
    }
    public void dive(int howDeep){
        System.out.println(name + ": swimming");
    }
}
