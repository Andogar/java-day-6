package com.company;

public class Marine extends Soldier implements Gun, Fight, Chainsaw{

    public Marine(String name, String rank, int serialNumber, boolean isDecorated) {
        super(name, rank, serialNumber, isDecorated);
    }

    @Override
    public String fight() {
        return "WE FIGHT FOR OUR EMPEROR";
    }

    @Override
    public int damage() {
        return 100;
    }

    @Override
    public String speak() {
        return "SPACE MARINES";
    }

    @Override
    public String chainsaw() {
        return "HERETICS";
    }

    @Override
    public String toString() {
        return "Marine{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", serialNumber=" + serialNumber +
                ", isDecorated=" + isDecorated +
                '}';
    }
}
