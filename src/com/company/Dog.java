package com.company;

public class Dog extends Animal {
    public static int countDog = 0;

    @Override
    public void run(int length) {
        if (length <= 500 && length > 0) {
            System.out.printf("Хороший мальчик %s  пробежал %d метров \n", getName(), length);
        } else if (length < 0) {
            System.out.printf("%s хочет побегать \n", getName());
        } else System.out.printf("%s не сможет убежать так далеко \n", getName());
    }

    @Override
    public void toSwim(int length) {
        if (length <= 10 && length > 0) {
            System.out.printf("%s проплыл %d метров \n", getName(), length);

        } else if (length < 0) {
            System.out.println("Где ВОДА?");
        } else System.out.printf("%s не сможет уплыть так далеко \n", getName());
    }

    public Dog(String name, int age, String color) {
        super(name, age, color);
        countDog++;
    }

    public static int getCount() {
        return countDog;
    }
}
