package com.company;


class Dog extends Animal {

    public double jump;
    public int swim;

    //конструктор

    public Dog(String name, int run, int swim, double jump ) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }
    public void dogInfo() {
        System.out.println("Имя собаки: " + name  + " /лимит бега: " + run+ " мотров/" + " /плавает: " + swim + " метров/" + " /прыжок: " +jump+ " метров/");
        System.out.println();
    }

}
