package com.company;

import java.util.Objects;

public class Animal {
    protected String name;
    protected int age;
    protected String color;
    private static int count = 0;

    public void run(int length){

    }

    public void toSwim(int length){

    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        count++;
    }

    public static void count(){
        System.out.printf("У нас %d животных %d котов и %d собак \n", getCount(), Cat.getCount(), Dog.countDog);
    }

    public static int getCount() {
        return count;
    }
}
