package com.t3h.Manager;

import com.t3h.Model.Player;

import java.awt.*;
import java.util.ArrayList;

public class GameManager {
    private Player player;

    public void initGame(){
        SoundManager soundManager = new SoundManager();
        soundManager.play("menu.wav");
        player = new Player(50,30);

    }



    public void draw(Graphics2D g2d){

        player.draw(g2d);

    }

    public void movePlayer(int newOrient){
        player.changeOrient(newOrient);
        player.move();
    }

}
