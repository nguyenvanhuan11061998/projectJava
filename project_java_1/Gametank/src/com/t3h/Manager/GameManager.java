package com.t3h.Manager;

import com.t3h.Model.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class GameManager {
    private long t = 0;
    private int countBoss = 0;
    private ArrayList<Explosion> arrExplosion = new ArrayList<>() ; //Mảng các vụ nổ boss chết
    private ArrayList<Heart> arrHeart = new ArrayList<>();          //Mảng mạng của player
    private ArrayList<Heart> arrHeart2 = new ArrayList<>();         //Mảng tym boss chết rơi ra
    private Item item;
    private Random random = new Random();
    private ArrayList<Boss> arrBoss;
    private Player player;
    private MapManager mapManager = new MapManager();
    private ArrayList<Bullet> arrBulletPlayer = new ArrayList<>();  //Mảng đạn của player
    private ArrayList<Bullet> arrBulletBoss = new ArrayList<>();    //Mảng đạn của boss
    private int Score =0;


    public void initGame() {
        item = new Item();
        arrBoss = new ArrayList<>();
        mapManager = new MapManager();
        mapManager.readMap("mapGame.txt");
        player = new Player(70, 50);
        initBoss();
    }
// khi boss chết có tỉ lệ tạo boss mới tại 3 nhà boss
    private void initBoss2(){
        int percent1 =  random.nextInt(4);
        if(percent1 == 0){
            arrBoss.add(new Boss(945, 53));
        }else if (percent1 == 1){
            arrBoss.add(new Boss(945, 53));
            arrBoss.add(new Boss(1155, 303));
        }else if(percent1 == 2){
            arrBoss.add(new Boss(1155, 303));
            arrBoss.add(new Boss(945, 523));
        }else if(percent1 == 3){
            arrBoss.add(new Boss(945, 523));
        }
        int percent2 = random.nextInt(4);
        if(percent2 == 0){
            arrBoss.add(new Boss(945, 53));
        }else if (percent2 == 1){
            arrBoss.add(new Boss(1155, 303));
        }else if(percent2 == 2){
            arrBoss.add(new Boss(945, 523));
        }
    }
//Số mạng player ăn đc sé được cộng dồn và hiển thị lên màn hình
    private void initHeart(){
        if(arrHeart.size() >= 8){
            return;
        }
        int late = arrHeart.size()-1;
        int xH = arrHeart.get(late).getX() +22;
        arrHeart.add(new Heart(xH,arrHeart.get(late).getY()));
        return;
    }

//Boss chết có tỷ lệ rơi ra tim
    private void initHeart2(int x, int y){
        arrHeart2.add(new Heart(x,y));
        return;
    }

//Khởi tạo số mạng và số boss mặc định khi bắt đầu vào game
    private void initBoss() {
        arrHeart.add(new Heart(450,15));

        arrBoss.add(new Boss(945, 53));
        arrBoss.add(new Boss(945, 523));
        arrBoss.add(new Boss(1155, 303));
        arrBoss.add(new Boss(1155, 303));

    }

 //Vẽ các đối tượng trong game
    public void draw(Graphics2D g2d) {


        for (Maptank maptank : mapManager.getArrMap()) {        //Vẽ map
            maptank.draw(g2d);
        }
        for (int i =0;i<arrHeart.size();i++) {                  // Vẽ mảng mạng của người chơi(tim)
            arrHeart.get(i).drawHeart(g2d);
        }

        for (int i = 0; i < arrHeart2.size(); i++) {            //Vẽ mảng mạng của boss rơi ra
            arrHeart2.get(i).drawHeart(g2d);
        }

        for (int i = arrBulletBoss.size() - 1; i >= 0; i--) {       //Vẽ mảng đạn của boss
            arrBulletBoss.get(i).draw(g2d);
        }

        for (int i = arrBulletPlayer.size()-1; i >= 0 ; i--) {      //Vẽ mảng đạn của player
            arrBulletPlayer.get(i).draw(g2d);
        }

        item.drawScore(g2d,640,15);                       //Vẽ ảnh Score

        g2d.drawString(getScore(),700,30);                  //Vẽ điểm

        player.draw(g2d);                                          //Vẽ player

        for (int i = arrBoss.size()-1; i >= 0 ; i--) {              //Vẽ mảng Boss
            arrBoss.get(i).draw(g2d);
        }

        item.drawTowerBoss(g2d,940,50);                      //Vẽ 3 nhà boss
        item.drawTowerBoss(g2d,940,520);
        item.drawTowerBoss(g2d,1150,300);

        for (int i = arrExplosion.size() -1; i >=0 ; i--) {     //Vẽ vụ nổ
            arrExplosion.get(i).draw(g2d);
        }

    }
//thực hiện chuyển động các nhân vật trong game
    public void AI() {

        for (int i = arrBoss.size() - 1; i >= 0; i--) {
            arrBoss.get(i).move(1, mapManager.getArrMap());                     //Boss di chuyển
            boolean check = arrBoss.get(i).checkDie(arrBulletPlayer);
            if (check) {                                                                //Kiểm tra boss chết
                int percent = random.nextInt(2);
                if(percent == 1){
                    initHeart2(arrBoss.get(i).getX()+3,arrBoss.get(i).getY()+3);        //boss chết có tỷ lệ percent rơi ra tym
                }
                countBoss ++;
                Score ++;
                SoundManager.play("bossDie.wav");
                Explosion explosion = new Explosion(arrBoss.get(i).getX()+10,arrBoss.get(i).getY()+10);
                arrExplosion.add(explosion);
                arrBoss.remove(i);
                if(countBoss == 3){                                                                 //khi một số boss chết nhất dịnh sẽ tạo ra boss mới tại nhà boss
                    initBoss2();
                    countBoss = 0;
                }
            }
        }

        if(arrHeart.size()>0) {
            for (int i = arrHeart.size() - 1; i >= 0; i--) {
                boolean check1 = player.checkDie(arrBulletBoss);
                if (check1) {
                    arrHeart.remove(i);
                }
            }
        }
        for (Maptank map : mapManager.getArrMap()) {                    //kiểm tra đạn bắn vào map
            map.checkBullet(arrBulletPlayer);
            map.checkBullet(arrBulletBoss);
        }

        for (int i = arrBulletPlayer.size() - 1; i >= 0; i--) {                 //đạn player di chuyển
            arrBulletPlayer.get(i).move(5, mapManager.getArrMap());
        }

        for (int i = arrBulletBoss.size() - 1; i >= 0; i--) {                   //đạn boss di chuyển
            arrBulletBoss.get(i).move(3, mapManager.getArrMap());
        }

        if(arrBoss.size()==1){                                              //nếu số boss bằng 1 sẽ ggoij hàm tạo boss
            initBoss2();
        }

        for (int i = 0; i < arrHeart2.size(); i++) {                        //kiểm tra player ăn tym của boss rơi ra
            boolean check = arrHeart2.get(i).checkPlayer(player);
            if(check == false){
                initHeart();
                arrHeart2.remove(i);
            }
        }

        if(arrHeart2.size()>3){
            arrHeart2.remove(0);
        }
    }

    public void movePlay(int newOrient) {                                   //thực hiên di chuyển player
        player.changeOrient(newOrient);
        player.move(2, mapManager.getArrMap());
    }

    public void BossBullet() {                                              //Boss bắn có tỷ lệ bắn giữa các boss
        long T = System.currentTimeMillis();
        if (T - t < 200) {
            return;
        }
        t = T;
        int percent = random.nextInt(arrBoss.size());
        arrBoss.get(percent).Fire(arrBulletBoss);
    }

    public void playerFire() {                                           //player bắn
        player.Fire(arrBulletPlayer);
        SoundManager.play("shoot.wav");
    }

    public void explosion(){                                               //các vụ nổ tạo ra sẽ được lưu vào mảng này
        if(arrExplosion.size()>50){
            arrExplosion.remove(0);
        }
    }

    public String getScore(){                                           //chuyển số boss chết thành điểm
        String s = String.valueOf(Score);
        return s;
    }

    public boolean checkDiePlayer(){
        if(arrHeart.size()>0){
            return false;
        }
        return true;
    }

}
