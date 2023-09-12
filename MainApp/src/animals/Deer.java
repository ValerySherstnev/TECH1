package animals;

public class Deer extends TundraAnimals{
    public static int count;
    public Deer(String name, String type, int age, int maxRunDistance, int maxSwimDistance, int lifespan) {
        super("Никола","Олень",12,10000,8000,18);
        count ++;
    }
}
