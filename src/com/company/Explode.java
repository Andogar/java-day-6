package com.company;

public interface Explode extends Fight {
    public Bomb explode();

    class Bomb {
        @Override
        public String toString() {
            return "Exploding!";
        }
    }
}