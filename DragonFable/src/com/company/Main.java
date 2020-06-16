package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void fightPlayerAndDarkPhoenix(Player player,DarkPhoenix darkPhoenix){
        System.out.println("Player's Life is lower. He attacks first.");
        GunShop gun = player.getGunShop();
        while(player.getHp() > 0 && darkPhoenix.getHp() > 0) {
            darkPhoenix.setHp(darkPhoenix.getHp() - gun.getDamage());
            System.out.println("After Attack DarkPhoenix has " + darkPhoenix.getHp() + " hp");
            if (darkPhoenix.getHp() < 0){
                break;
            }
            int playerHp = player.getHp();
            playerHp -= darkPhoenix.getDamage();
            player.setHp(playerHp);
            System.out.println("After Attack Player has " + playerHp + " hp");
            if (player.getHp() < 0){
                break;
            }
        }

        if (player.getHp() > 0){
            System.out.println(player.getName() + " has won. You won the game. Congrats...");
        } else if (darkPhoenix.getHp() > 0){
            System.out.println(darkPhoenix.getName() + " has won. Player lost 1 life point.");
            player.setLifeLeft(player.getLifeLeft()-1);
            System.out.println(player.getName() + " has " + player.getLifeLeft() + " life(s).");
        } else if (darkPhoenix.getHp() < 0 && player.getHp() < 0){
            System.out.println("You died in the same round. You didn't lose life point but you didn't get any gold");
        }
        darkPhoenix.setHp(150);
        player.setHp(100);
    }

    public static void fightPlayerAndZombie(Player player,Zombie zombie){
        GunShop gun = player.getGunShop();
        System.out.println("Zombie's Life is lower. He attacks first.");
        while(player.getHp() > 0 && zombie.getHp() > 0) {
            int playerHp = player.getHp();
            playerHp -= zombie.getDamage();
            player.setHp(playerHp);
            if (player.getHp() < 0){
                break;
            }
            System.out.println("After Attack Player has " + playerHp + " hp");
            zombie.setHp(zombie.getHp() - gun.getDamage());
            System.out.println("After Attack Zombie has " + zombie.getHp() + " hp");
            if (zombie.getHp() < 0){
                break;
            }
        }
        if (player.getHp() > 0){
            System.out.println(player.getName() + " has won. Winning price is " + zombie.getWinReward() + " gold.");
            player.setMoney(player.getMoney() + zombie.getWinReward());
        } else if (zombie.getHp() > 0){
            System.out.println(zombie.getName() + " has won. Player lost 1 life point.");
            player.setLifeLeft(player.getLifeLeft()-1);
            System.out.println(player.getName() + " has " + player.getLifeLeft() + " life(s).");
        } else if (zombie.getHp() < 0 && player.getHp() < 0){
            System.out.println("You died in the same round. You didn't lose life point but you didn't get any gold");
        }
        zombie.setHp(60);
        player.setHp(100);
    }

    public static void fightPlayerAndWereWolf(Player player,WereWolf wereWolf){
        GunShop gun = player.getGunShop();
        System.out.println("WereWolf's Life is lower. He attacks first.");
        while(player.getHp() > 0 && wereWolf.getHp() > 0) {
            int playerHp = player.getHp();
            playerHp -= wereWolf.getDamage();
            player.setHp(playerHp);
            if (player.getHp() < 0){
                break;
            }
            System.out.println("After Attack Player has " + player.getHp() + " hp");
            wereWolf.setHp(wereWolf.getHp() - gun.getDamage());
            System.out.println("After Attack WereWolf has " + wereWolf.getHp() + " hp");
            if (wereWolf.getHp() < 0){
                break;
            }
        }
        if (player.getHp() > 0){
            System.out.println(player.getName() + " has won. Winning price is " + wereWolf.getWinReward() + " gold.");
            player.setMoney(player.getMoney() + wereWolf.getWinReward());
        } else if (wereWolf.getHp() > 0){
            System.out.println(wereWolf.getName() + " has won. Player lost 1 life point.");
            player.setLifeLeft(player.getLifeLeft()-1);
            System.out.println(player.getName() + " has " + player.getLifeLeft() + " life(s).");
        } else if (wereWolf.getHp() < 0 && player.getHp() < 0){
            System.out.println("You died in the same round. You didn't lose life point but you didn't get any gold");
        }
        wereWolf.setHp(20);
        player.setHp(100);
    }

    public static void fightPlayerAndVampire(Player player,Vampire vampire) throws InterruptedException {
        GunShop gun = player.getGunShop();
        Random random = new Random();
        int chanceToAttackFirst = random.nextInt(2);
        if (chanceToAttackFirst == 0){
            System.out.println("Vampire attacks first");
        } else if (chanceToAttackFirst == 1){
            System.out.println(player.getName() + " attacks first");
        }
        Thread.sleep(2000);
        while(player.getHp() > 0 && vampire.getHp() > 0) {
            if (chanceToAttackFirst == 0) {
                int playerHp = player.getHp();
                playerHp -= vampire.getDamage();
                player.setHp(playerHp);
                if (player.getHp() < 0){
                    break;
                }
                System.out.println("After Attack Player has " + playerHp + " hp");
                vampire.setHp(vampire.getHp() - gun.getDamage());
                System.out.println("After Attack Vampire has " + vampire.getHp() + " hp");
                if (vampire.getHp() < 0){
                    break;
                }
            } else if (chanceToAttackFirst == 1){
                vampire.setHp(vampire.getHp() - gun.getDamage());
                System.out.println("After Attack Vampire has " + vampire.getHp() + " hp");
                if (vampire.getHp() < 0){
                    break;
                }
                int playerHp = player.getHp();
                playerHp -= vampire.getDamage();
                player.setHp(playerHp);
                System.out.println("After Attack Player has " + playerHp + " hp");
                if (player.getHp() < 0 ){
                    break;
                }
            }
        }
        if (player.getHp() > 0){
            System.out.println(player.getName() + " has won. Winning price is " + vampire.getWinReward() + " gold.");
            player.setMoney(player.getMoney() + vampire.getWinReward());
        } else if (vampire.getHp() > 0){
            System.out.println(vampire.getName() + " has won. Player lost 1 life point.");
            player.setLifeLeft(player.getLifeLeft()-1);
            System.out.println(player.getName() + " has " + player.getLifeLeft() + " life(s).");
        } else if (vampire.getHp() < 0 && player.getHp() < 0){
            System.out.println("You died in the same round. You didn't lose life point but you didn't get any gold");
        }
        vampire.setHp(100);
        player.setHp(100);
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        WereWolf wereWolf = new WereWolf();
        Zombie zombie = new Zombie();
        Vampire vampire = new Vampire();
        DarkPhoenix darkPhoenix = new DarkPhoenix();


        String options = "1. Lets Smash Monster\n" +
                         "2. Do you want to buy some guns come here\n" +
                         "3. See your amount of gold\n" +
                         "4. Accept lose. Finish game.";
        String monsters = "1. WereWolf Hp = 20, Attack = 5-8, Gold Reward = 20\n" +
                          "2. Zombie Hp = 60, Attack = 15-20, Gold Reward = 30\n" +
                          "3. Vampire Hp = 100, Attack = 20-30, Gold Reward = 40\n" +
                          "4. DarkPhoenix Hp = 150, Attack = 40-45, Reward = End Game\n" +
                          "5. Back";
        String gunShop = "1. Mp7, Attack = 8-13, Price = 40\n" +
                         "2. M4A1, Attack = 20-30, Price = 90\n" +
                         "3. Awp, Attack = 45-55, Price = 120\n" +
                         "4. Back" ;

        player.userInfo();

        while (true){
            System.out.println("\n**********************************\n");
            System.out.println(options);
            System.out.println("\n**********************************");
            String optionSelect = scanner.nextLine();
            if (optionSelect.equals("1")){
                while (true){
                    System.out.println(monsters);
                    String monsterSelect = scanner.nextLine();
                    if (monsterSelect.equals("1")){
                        fightPlayerAndWereWolf(player,wereWolf);
                        break;
                    } else if (monsterSelect.equals("2")){
                        fightPlayerAndZombie(player,zombie);
                        break;
                    } else if (monsterSelect.equals("3")){
                        System.out.println("Vampire's Life is equal with Player's life. Whoever is lucky will attack first.");
                        Thread.sleep(2000);
                        fightPlayerAndVampire(player,vampire);
                        break;
                    } else if (monsterSelect.equals("4")){
                        fightPlayerAndDarkPhoenix(player,darkPhoenix);
                        break;
                    } else if (monsterSelect.equals("5")){
                        break;
                    }
                }
            }
            else if (optionSelect.equals("2")) {
                while (true) {
                    System.out.println("You have " + player.getMoney() + " gold.");
                    System.out.println(gunShop);
                    String buyGun = scanner.nextLine();
                    String gunName = "Glock";
                    if (buyGun.equals("1")){
                        gunName = "Mp7";
                    } else if (buyGun.equals("2")){
                        gunName = "M4A1";
                    } else if (buyGun.equals("3")){
                        gunName = "Awp";
                    } else if (buyGun.equals("4")) {
                        System.out.println("See you later");
                        break;
                    }
                    GunShop gun1 = new GunShop(gunName);
                    player.setGunShop(gun1);

                }
            }
              else if (optionSelect.equals("3")){
                System.out.println("You have " + player.getMoney() + " gold.");
            } else if (optionSelect.equals("4")){
                System.out.println("You are looser...");
                break;
            }
            if (player.getLifeLeft() == 0 ){
                System.out.println("You don't have any life point. You lost...");
                break;
            }
        }
    }
}
