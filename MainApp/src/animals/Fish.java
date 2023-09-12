package animals;

public class Fish extends Animal{
    public static int count;

    public Fish(String name, int age, int maxRunDistance, int maxSwimDistance) {
        super(name, "Рыба",age, maxRunDistance, maxSwimDistance);
        count++;
    }
}
