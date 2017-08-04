package com.company;

public class Main {

    public static void main(String[] args) {
        Army armySoldier = new Army("Ryan", "Pvt.", 117, false);
        Navy navySoldier = new Navy("Richard", "Cpl", 315, true);
        Marine marineSoldier = new Marine("Orsan Lakk", "Space Marine", 999, true);

        System.out.println(armySoldier);
        System.out.println(navySoldier);
        System.out.println(marineSoldier);

        System.out.println(armySoldier.fight());
        System.out.println(navySoldier.damage());
        System.out.println(marineSoldier.speak());

        Grenadier grenadierSoldier = new Grenadier ("Frank", "Demoman", 16, false);
        System.out.println(grenadierSoldier.speak());
        System.out.println(grenadierSoldier.explode());
    }

    static class Grenadier extends Soldier implements Explode{
        public Grenadier(String name, String rank, int serialNumber, boolean isDecorated) {
            super(name, rank, serialNumber, isDecorated);
        }

        @Override
        public Bomb explode() {
            Bomb bomb = new Bomb();
            return bomb;
        }

        @Override
        public String speak() {
            return "Bombs Away!";
        }

        @Override
        public String fight() {
            return "Fire in the Hole!!";
        }
    }
}
