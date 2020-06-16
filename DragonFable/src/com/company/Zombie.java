package com.company;

import java.util.Random;

public class Zombie {
    private String name ;
    private int hp;
    private int winReward ;
    private int damage;
    private Player player1;

    Player player = new Player();
    Random random = new Random();

    public Zombie() {
        this.name = "Zombie";
        this.hp  = 60;
        this.winReward = 30;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getWinReward() {
        return winReward;
    }

    public int getDamage() {
        this.damage = random.nextInt(5)+15;
        return damage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
