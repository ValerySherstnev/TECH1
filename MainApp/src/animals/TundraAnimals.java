package animals;

public abstract class TundraAnimals extends Animal{
    private int lifespan;
    public static int count;

    public TundraAnimals(String name, String type, int age, int maxRunDistance, int maxSwimDistance, int lifespan) {
        super(name, type, age, maxRunDistance, maxSwimDistance);
        this.lifespan = lifespan;
        count++;
    }
    public static int getTundCount() {
        return count;
    }
    public void lifespan(){
        System.out.println(this.getType() + ": Продолжительность жизни " + this.getAge() + " лет");
//        if (this.type == "Олень")
//            System.out.println("Продолжительность жизни Оленя 18 лет");
//        if (this.type == "Песец")
//            System.out.println("Продолжительность жизни Песца 4 года");
//        if (this.type == "Лемминг")
//            System.out.println("Продолжительность жизни Лемминга 2 года");
    }
}
