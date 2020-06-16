package com.company;

import java.util.Random;

public class Vampire {
    private String name ;
    private int hp;
    private int winReward ;
    private int damage;
    private Player player1;

    Random random = new Random();


    public Vampire() {
        this.name = "Vampire";
        this.hp  = 100;
        this.winReward = 40;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWinReward(int winReward) {
        this.winReward = winReward;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
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
        this.damage = random.nextInt(10)+20;
        return damage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
