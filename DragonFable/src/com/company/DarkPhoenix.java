package com.company;

import java.util.Random;

public class DarkPhoenix {
    private String name ;
    private int hp;
    private int damage;

    Random random = new Random();

    public DarkPhoenix() {
        this.name = "DarkPhoenix";
        this.hp  = 150;

    }
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        this.damage = random.nextInt(5)+30;
        return damage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
