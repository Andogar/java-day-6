package com.company;

public class Army extends Soldier implements Gun, Fight {

    public Army(String name, String rank, int serialNumber, boolean isDecorated) {
        super(name, rank, serialNumber, isDecorated);
    }

    @Override
    public String fight() {
        return "IM FIGHTING";
    }

    @Override
    public int damage() {
        return 50;
    }

    @Override
    public String speak() {
        return "Hooah";
    }

    @Override
    public String toString() {
        return "Army{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", serialNumber=" + serialNumber +
                ", isDecorated=" + isDecorated +
                '}';
    }
}
