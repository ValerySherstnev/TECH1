package animals;

public class Lemming extends TundraAnimals{
    public static int count;
    public Lemming(String name, String type, int age, int maxRunDistance, int maxSwimDistance, int lifespan) {
        super("Джиронимо","Лемминг",2,10000,15000,2);
        count ++;
    }
}
