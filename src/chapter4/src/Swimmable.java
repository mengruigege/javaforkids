public interface Swimmable {
    public void swim(int howFar);
    public default void dive(int howDeep){
        System.out.println("Can't dive, sorry");
    }
}
