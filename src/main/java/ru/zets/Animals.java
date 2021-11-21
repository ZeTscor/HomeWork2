package ru.zets;

public class Animals {
    private String kindOfAnimal;
    private String name;
    private Boolean danger;

    public void setKindOfAnimal(String kindOfAnimal) {
        this.kindOfAnimal = kindOfAnimal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDanger(Boolean danger) {
        this.danger = danger;
    }

    public String getKindOfAnimal() {
        return kindOfAnimal;
    }

    public String getName() {
        return name;
    }

    public Boolean getDanger() {
        return danger;
    }

    public static String angryAnimals(boolean tease) {
        if (tease) {
            return "Издает злые звуки";
        } else {
            return "Занимается обычными животнами делами";
        }

    }

}



