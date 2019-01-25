package com.company;

class Cat extends Animal {

    protected boolean swim;
    int jump;

//конструктор

    public Cat(String name, int run, boolean swim, int jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    //выводим информацию в консоль
    public void catInfo() {
        System.out.println("Имя кота: " + name  + " /лимит бега: " + run+ " мотров/" + " /плавает:" + swim + " /прыжок: " +jump+ " метров/");
    }
}
