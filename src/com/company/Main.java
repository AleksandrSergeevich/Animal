package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal("Кфтегория кота");
        Cat cat = new Cat("Мурзик", 200, false, 2);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal danimal = new Animal("Пес");
        Dog dog = new Dog("Тузик", 500, 10, 0.5);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

        aiLevel();

    }
    public static void aiLevel() {
        System.out.println("Выберите животое : ");
        System.out.println("1. Мурзик.");
        System.out.println("2. Тузик.");
        int i = 0;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        switch (i) {
            case 1: {
                catRun();
                break;
            }
            case 2: {
                dogRun();
                break;
            }

        }
    }

    private static void dogRun() {
        System.out.println("Тузик проплыл 10 метров");
    }

    private static void catRun() {
        System.out.println("Мурзик пробежал 120 метров");

    }


}