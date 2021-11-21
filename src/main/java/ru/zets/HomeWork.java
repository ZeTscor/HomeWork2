package ru.zets;

import ru.zets.Animals;

import static ru.zets.Animals.angryAnimals;
import static ru.zets.People.*;


public class HomeWork {

    public static void main(String[] args) {

        People people = new People();
        people.setName("Ivan");
        people.setAge(7);
        people.setSex("male");


        Animals animal = new Animals();
        animal.setKindOfAnimal("Млекопитающие");
        animal.setName("Медведь");
        animal.setDanger(true);


        System.out.println(seeAnimals() + " " + animal.getName());
        System.out.println(danger());
        if (animal.getDanger()) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        //Если зверь опасен, его не будут провацировать и он не злится,
        // а если зверь не опасен, то его будут провацировать и буддет, что то делать
        System.out.println(animal.getName() + " " + angryAnimals(teaseAnimals(animal.getDanger())));


        people.birthday();
        System.out.println("С днем рождения сколько исполнилось лет? " + people.getAge());

    }
}
