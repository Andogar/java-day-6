package com.company;

public abstract class  Soldier {
    String name;
    String rank;
    int serialNumber;
    boolean isDecorated;

    public Soldier(String name, String rank, int serialNumber, boolean isDecorated) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
        this.isDecorated = isDecorated;
    }

    public String eat() {
        return "Eating food";
    }

    public String sleep() {
        return "Takin a nap";
    }

    public String walk() {
        return "Left Left Left Right Left";
    }

    public abstract String speak();
}
