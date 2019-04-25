package com.t3h.Gui;

import com.t3h.Button.ButtonChoiLai;
import com.t3h.Button.ButtonTamDung;
import com.t3h.Button.ButtonTiepTuc;
import com.t3h.Button.ButtonTroLai;
import com.t3h.ui.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.security.PublicKey;

public class MenuPanel extends JPanel implements ActionListener {
    private int X = 200;
    private int Y = 700;
    private JButton btnChoiLai;
    private JButton btnTamDung;
    private JButton btnTiepTuc;
    private JButton btnTroLai;

     public MenuPanel(){
         setLayout(null);
         setBackground(Color.YELLOW);
         setSize(X,Y);
         setLocation(0,0);
         initComp();
     }

    private void initComp(){
         int x;
         int y;

         btnTamDung = new JButton();
         btnTamDung.setSize(164,48);
         x = X/2 - btnTamDung.getWidth()/2;
         y = 400;
         btnTamDung.setLocation(x,y);
         add(btnTamDung);

         btnTiepTuc = new JButton();
         btnTiepTuc.setSize(141,48);
         x = X/2 - btnTiepTuc.getWidth()/2;
         y = btnTamDung.getY()+btnTamDung.getHeight()+10;
         btnTiepTuc.setLocation(x,y);
         add(btnTiepTuc);

         btnChoiLai = new JButton();
         btnChoiLai.setSize(135,48);
         x = X/2 - btnChoiLai.getWidth()/2;
         y = btnTiepTuc.getY()+btnTiepTuc.getHeight()+10;
         btnChoiLai.setLocation(x,y);
         add(btnChoiLai);
         btnChoiLai.addActionListener(this);

        btnTroLai = new JButton();
        btnTroLai.setSize(119,41);
        x = X/2 - btnTroLai.getWidth()/2;
        y = btnChoiLai.getY()+btnChoiLai.getHeight()+10;
        btnTroLai.setLocation(x,y);
        add(btnTroLai);
        btnTroLai.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnTroLai)){
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        }else if(e.getSource().equals(btnChoiLai)){
            TankFrame tankFrame = new TankFrame();
            tankFrame.setVisible(true);
        }
    }


}
