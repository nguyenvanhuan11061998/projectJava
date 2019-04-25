package com.t3h.Gui;

import com.t3h.Manager.GameManager;
import com.t3h.Model.Entity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TankPanel extends JPanel implements Runnable, KeyListener {
    private GameManager gameManager = new GameManager();
    private boolean[] flag = new boolean[256];

    public TankPanel() {
        setLocation(0,0);
        gameManager.initGame();

        Thread t = new Thread(this);
        t.start();

        setFocusable(true);
        addKeyListener(this);


    }

    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d);
        gameManager.draw(g2d);
    }

    @Override
    public void run() {

        while(true){
            boolean isDie = gameManager.checkDiePlayer();
            if(isDie){
                int result = JOptionPane.showConfirmDialog(null,"Chúc mừng bạn đã chết, số điểm của bạn là: "+gameManager.getScore()+"" +
                                ". Bạn có muốn chơi lại không ??"
                        ,"Game over",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
                    gameManager.initGame();
                    flag = new boolean[256];
                }else{
                    System.exit(0);
                }
            }

            gameManager.getScore();
            gameManager.BossBullet();
            gameManager.AI();
            gameManager.explosion();
            if(flag[KeyEvent.VK_SPACE]){
                gameManager.playerFire();
            }
            if(flag[KeyEvent.VK_A]&&flag[KeyEvent.VK_W]){
                gameManager.movePlay(Entity.UP_LEFT);
            }
            else if(flag[KeyEvent.VK_A]&&flag[KeyEvent.VK_S]){
                gameManager.movePlay(Entity.DOWN_LEFT);
            }
            else if(flag[KeyEvent.VK_D]&&flag[KeyEvent.VK_W]){
                gameManager.movePlay(Entity.UP_RIGHT);
            }
            else if(flag[KeyEvent.VK_D]&&flag[KeyEvent.VK_S]){
                gameManager.movePlay(Entity.DOWN_RIGHT);
            }
            else if(flag[KeyEvent.VK_W]){
                gameManager.movePlay(Entity.UP);
            }
            else if(flag[KeyEvent.VK_D]){
                gameManager.movePlay(Entity.RIGHT);
            }
            else if(flag[KeyEvent.VK_S]){
                gameManager.movePlay(Entity.DOWN);
            }
            else if(flag[KeyEvent.VK_A]) {
                gameManager.movePlay(Entity.LEFT);
            }



                repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        flag[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        flag[e.getKeyCode()] = false;
    }

}
