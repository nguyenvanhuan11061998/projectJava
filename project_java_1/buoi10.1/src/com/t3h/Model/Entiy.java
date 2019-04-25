package com.t3h.Model;

import java.awt.*;
import java.util.ArrayList;

public abstract class Entiy {
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;


    protected int x;
    protected int y;
    protected Image img;
    protected int orient;
    protected int speed = 1;

    //phương thức khởi tạo: chỉ khởi tạo cho x, y:  Khởi tạo vị trí đầu tiên cho đối tượng khi vào game
    public Entiy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2D){       //Khởi tạo bút vẽ
        g2D.drawImage(img,x,y,null);
    }

    public void move(){
        switch (orient){
            case LEFT:
                x-=speed;
                break;
            case RIGHT:
                x+=speed;
                break;
            case UP:
                y-=speed;
                break;
            case DOWN:
                y+=speed;
                break;
        }
    }


}
