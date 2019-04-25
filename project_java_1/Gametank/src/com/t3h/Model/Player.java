package com.t3h.Model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Player extends Entity {
    private Image[] arr = {
            new ImageIcon(getClass().getResource("/sound/image/player_green_up.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/player_up_right.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/player_green_right.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/player_down_right.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/player_green_down.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/player_down_left.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/player_green_left.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/player_up_left.png")).getImage()
    };


    public Player(int x, int y) {
        super(x, y);
        orient = RIGHT;
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public int getOrient() {
        return super.getOrient();
    }


    @Override
    public void draw(Graphics2D g2d) {
        img = arr[orient];
        super.draw(g2d);
    }

    public void changeOrient(int newOrient){
        orient = newOrient;
    }

    @Override
    public void move(int speed,ArrayList<Maptank> maptanks) {
        super.move(speed,maptanks);
    }


    @Override
    public void Fire(ArrayList<Bullet> bullets) {
        img = arr[orient];
        super.Fire(bullets);
    }
}
