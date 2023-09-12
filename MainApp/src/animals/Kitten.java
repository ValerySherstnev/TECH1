package animals;

public class Kitten extends Animal{
    public static int count;
    public Kitten(String name, int age, int maxRunDistanse, int maxSwimDistnce) {
        super(name,"Кот", age, maxRunDistanse, 0);
        count ++;
    }
}
