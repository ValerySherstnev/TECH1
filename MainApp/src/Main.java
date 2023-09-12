import animals.*;

public class Main {
        public static void main (String[] args){

            Animal[] animals = {
                    new Kitten("Мурзик", 9, 100, 0),
                    new Kitten("Макан", 9, 100, 0),
                    new Puppy("Тузик", 14, 450, 5),
                    new Tiger("Тигуан", 15, 150, 50),
                    new Fish("Орландо",10,0,5000),
                    new Deer("Никола","Олень",18,10000,8000,18),
                    new Arcticfox("Белиал","Песец",4,20000,2000,4),
                    new Lemming("Джиронимо","Лемминг",2,10000,15000,2)

            };

            for (Animal a : animals) {
                a.run(160);
                a.swim(40);
            }
            System.out.println("Жизнь.");
            ((TundraAnimals) animals[5]).lifespan();
            ((TundraAnimals) animals[6]).lifespan();
            ((TundraAnimals) animals[7]).lifespan();

            System.out.println("Популяция.");
            System.out.println("Количество котов " + Kitten.count);
            System.out.println("Количество собак " + Puppy.count);
            System.out.println("Количество тигров " + Tiger.count);
            System.out.println("Количество рыб " + Fish.count);
            System.out.println("Количество оленей " + Deer.count);
            System.out.println("Количество песцов " + Arcticfox.count);
            System.out.println("Количество леммингов " + Lemming.count);
            System.out.println("Количество животных тундры  " + TundraAnimals.getTundCount());
            System.out.println("Общее количество животных  " + Animal.getCount());





        }
}