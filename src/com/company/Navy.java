package com.company;

public class Navy extends Soldier implements Gun, Fight {

    public Navy(String name, String rank, int serialNumber, boolean isDecorated) {
        super(name, rank, serialNumber, isDecorated);
    }

    @Override
    public String fight() {
        return "Goin in the boat to fight";
    }

    @Override
    public int damage() {
        return 20;
    }

    @Override
    public String speak() {
        return "Hooyah";
    }

    @Override
    public String toString() {
        return "Navy{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", serialNumber=" + serialNumber +
                ", isDecorated=" + isDecorated +
                '}';
    }
}
