package com.company;

import javax.swing.*;
import java.util.Random;

public class WereWolf {
    private String name ;
    private int hp;
    private int winReward ;
    private int damage;
    private Player player1;

    Random random = new Random();

    public WereWolf() {
        this.name = "WereWolf";
        this.hp  = 20;
        this.winReward = 20;
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
        this.damage = random.nextInt(5)+8;
        return damage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
