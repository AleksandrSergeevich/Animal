package com.company;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Кфтегория кота");
        Cat cat = new Cat("Мурзик", 200, false, 2);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal danimal = new Animal("Пес");
        Dog dog = new Dog("Тишка", 500, 10, 0.5);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}