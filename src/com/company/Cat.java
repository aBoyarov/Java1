package com.company;

public class Cat extends Animal {
    public static int catCount = 0;

    public Cat(String name, int age, String color) {
        super(name, age, color);
        catCount++;
    }

    @Override
    public void toSwim(int length) {
        System.out.printf("%s боится воды \n", getName());
    }

    @Override
    public void run(int length) {
        if (length <= 200 && length > 0) {
            System.out.printf("Котик %s пробежал %d метров \n", getName(), length);
        } else if (length < 0) {
            System.out.printf("Котик %s хочет побегать \n", getName());
        } else System.out.printf("Котик %s не сможет убежать так далеко \n", getName());
    }
    public static int getCount() {
        return catCount;
    }
}
