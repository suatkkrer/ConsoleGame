package com.company;

import java.util.Scanner;

public class Player {


    private int hp;
    private int lifeLeft;
    private String name;
    private int money ;
    private GunShop gunShop;

    Scanner scanner = new Scanner(System.in);

    public Player() {
        this.gunShop = new GunShop("Glock");
        this.hp = 100;
        this.name = "Player";
        this.lifeLeft = 3;
    }

    public GunShop getGunShop() {
        return gunShop;
    }

    public void setGunShop(GunShop gunShop) {
        if (this.money < gunShop.getPrice()) {
            System.out.println("Sorry you don't have enough money.");
        } else if (this.money >= gunShop.getPrice()) {
            System.out.println("You bought " + gunShop.getName());
            this.money -= gunShop.getPrice();
        }
        this.gunShop = gunShop;
    }


    public void userInfo() {

        System.out.println("Enter Your Name");
        this.name = scanner.nextLine();
        System.out.println("Welcome to game " + this.name);
        System.out.println("Your beginning hp is " + hp + " and your beginning gun is Glock, Damage = 5-10");
        System.out.println("You have " + lifeLeft + " life. Lets start. Be Careful...");

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLifeLeft() {
        return lifeLeft;
    }

    public void setLifeLeft(int lifeLeft) {
        this.lifeLeft = lifeLeft;
    }
}
