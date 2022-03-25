package com.company;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Шарик", 4, "чёрный");
        Animal cat = new Cat("Пиксель", 2, "пятнистый");


        cat.run(120);
        cat.toSwim(1);
        dog.run(420);
        dog.toSwim(5);
        Animal.count();

    }
}
