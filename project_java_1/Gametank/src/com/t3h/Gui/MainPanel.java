package com.t3h.Gui;

import javax.swing.*;

public class MainPanel extends JPanel{

    public MainPanel() {
        setLayout(null);
        initComp();
    }

    private void initComp() {
        TankPanel tankPanel = new TankPanel();
        add(tankPanel);

    }
}
