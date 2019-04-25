package com.t3h.ui;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel() {
        setLayout(null);
        initComp();
    }

    private void initComp() {
        Top_Left top_left = new Top_Left();
        add(top_left);
        Top_Between top_between = new Top_Between();
        add(top_between);
        Top_Right top_right = new Top_Right();
        add(top_right);
        Bottom_Left bottom_left = new Bottom_Left();
        add(bottom_left);
        Bottom_R_Left bottom_r_left = new Bottom_R_Left();
        add(bottom_r_left);
        Bttom_R_Right bttom_r_right = new Bttom_R_Right();
        add(bttom_r_right);
    }
}
