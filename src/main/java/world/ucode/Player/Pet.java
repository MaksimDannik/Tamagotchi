package world.ucode.Player;

import javafx.scene.image.Image;

import java.net.URISyntaxException;

public abstract  class Pet {
    public   static double health;
    public   static double happy;
    public   static double hunger;
    public   static double thirst;
    public  static double cleanliness;
    public static String name = null;
    public static String player = null;


    public void inizializade() {
         health = 1;
         happy = 1;
         hunger = 1;
         thirst = 1;
         cleanliness = 1;
    }
    public  void play() {
        happy += 0.05;
        thirst -= 0.03;
    }

    public void feed() {
        hunger += 0.05;
        cleanliness -= 0.02;
    }
    public void give_water() {
        thirst += 0.05;
        health -= 0.02;
    }
    public void give_Medicine() {
        health += 0.05;
        happy -= 0.3;
    }

    public void clean_up() {
        cleanliness += 0.05;
        hunger -= 0.02;
    }

    public abstract String setPet();

    //    public game_over () {
//        if (health <= 0 || happy <= 0 || hunger <= 0 || thirst <= 0 || cleanliness <= 0) {
//            // write game over ...
//        }
//    }
}
