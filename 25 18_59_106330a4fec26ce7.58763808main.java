package ru.skyeng;

public class Main {
    
    public static void main(String[] args) {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        var frog = 3,5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var summBoxer =  firstBoxer + secondBoxer;
        System.out.println(summBoxer);
        var differenceBoxer = firstBoxer % secondBoxer;
        System.out.println(differenceBoxer);
        var hoursWork = 640;
        var warkers = hoursWork / 8;
        System.out.println("Всего работников в компании " + warkers + "человек");
        warkers = warkers + 94;
        hoursWork = hoursWork / warkers;
        System.out.println("Если в компании работет " + warkers + "человек, то всего " + hoursWork + "часов работы может быть распределено между сотрудниками");
    }
}
