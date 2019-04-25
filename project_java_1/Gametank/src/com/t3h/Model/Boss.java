package com.t3h.Model;

import com.t3h.Manager.MapManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Boss extends Entity {
    private Random random = new Random();
    private Image[] arrImgBoss = {
            new ImageIcon(getClass().getResource("/sound/image/bossyellow_up.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/boss_up_right.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/bossyellow_right.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/boss_down_right.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/bossyellow_down.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/boss_down_left.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/bossyellow_left.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/boss_up_left.png")).getImage(),
    };

    public Boss(int x, int y) {
        super(x, y);
        orient = LEFT;
    }



    @Override
    public void draw(Graphics2D g2d) {
        img = arrImgBoss[orient];
        super.draw(g2d);
    }

    private void genarateOrient() {
        int percent = random.nextInt(500);
        if (percent > 491) {
            orient = random.nextInt(8);
        }
    }

    @Override
    public void move(int speed,ArrayList<Maptank> maptanks) {
        genarateOrient();
        super.move(speed,  maptanks);
    }


    @Override
    public void Fire(ArrayList<Bullet> bullets) {
        img = arrImgBoss[orient];
        super.Fire(bullets);
    }
}
