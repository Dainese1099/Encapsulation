package com.ahren;

public class Main {

    public static void main(String[] args) {
/*
        Player player = new Player();
        player.name = "Ahren";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health " + player.healthRemaining());
*/
        enhancedPlayer enhancedPlayer = new enhancedPlayer("Ahren", 100, "sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}
