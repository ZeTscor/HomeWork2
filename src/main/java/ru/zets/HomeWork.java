package ru.zets;

import ru.zets.Animals;

public class HomeWork {

    public static void main(String[] args) {

        People people = new People();
        people.name = "Ivan";
        people.age = 7;
        people.sex = "male";

        Animals animal = new Animals();
        animal.kindOfAnimal = "Млекопитающие";
        animal.name = "Медведь";
        animal.danger = true;
        animal.emittedSound = "РРРРРРРРРР";


        System.out.println(people.seeAnimals() + " " + animal.name.toLowerCase());
        System.out.println(people.danger());
        if (animal.danger) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        System.out.println(people.sound() + " " + animal.emittedSound);

        people.birthday();
        System.out.println("С днем рождения сколько исполнилось лет? " + people.age);

    }
}
