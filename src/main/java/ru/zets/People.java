package ru.zets;

public class People {

    public static String commonName = "Человек23";
    private String sex;
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Integer birthday() {
        return age++;
    }

    public static String seeAnimals() {
        return "А кто это?";
    }

    public static String danger() {
        return "А он опасен?";
    }

    public static String sound() {
        return "a какой звук он издает?";
    }

    public static Boolean teaseAnimals(Boolean danger) {
        return !danger;
    }

}
