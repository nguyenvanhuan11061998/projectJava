package com.t3h.ui;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
    public MyPanel(){
        setLayout(null);            //cho panel tự quy định vị trí trên panel cha
        setBackground(Color.PINK);
        initComp();                             //Thêm panelGame và PanelMenu vào PanelContainer
    }

    private void initComp() {
        PanelMenu panelMenu = new PanelMenu();
        add(panelMenu);
        PanelGame panelGame = new PanelGame();
        add(panelGame);
    }
}
