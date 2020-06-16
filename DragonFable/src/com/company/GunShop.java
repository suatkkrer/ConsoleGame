package com.company;

import java.util.Random;

public class GunShop {
    private String name;
    private int damage;
    private int price;
    Random random = new Random();

    public GunShop(String name) {
        this.name = name;
        if (name.equals("Glock")){
            createGlock();
        } else if (name.equals("Mp7")) {
            createMp7();
        } else if (name.equals("M4A1")) {
            createM4A1();
        } else if (name.equals("Awp")) {
            createAwp();
        }
    }
    public void createGlock(){
        price = 0;
        damage = random.nextInt(5)+5;
    }
    public void createMp7(){
        price = 40;
        damage = random.nextInt(5)+13;
    } public void createM4A1(){
        price = 90;
        damage = random.nextInt(10)+20;
    } public void createAwp(){
        price = 120;
        damage = random.nextInt(10)+40;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
