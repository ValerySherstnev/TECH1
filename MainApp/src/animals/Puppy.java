package animals;

public class Puppy extends Animal{
    public static int count;
    public Puppy(String name, int age, int maxRunDistance,int maxSwimDistance) {
        super(name, "Собака",age, maxRunDistance, maxSwimDistance);
        count++;
    }
}
