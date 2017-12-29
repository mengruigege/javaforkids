public class Fish extends Pet{
    int currentDepth = 0;

    public  int dive(int howDeep){
        currentDepth += howDeep;
        System.out.println("Diving for " + howDeep + " feet");
        System.out.println("I'm at " + currentDepth +" feet below sea level");
        return  currentDepth;
    }

    public String talk(String something){
        return "Don't you know that fish do not talk?";
    }
}
