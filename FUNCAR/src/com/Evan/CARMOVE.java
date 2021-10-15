package com.Evan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CARMOVE extends JFrame implements KeyListener {

    JPanel MyPanel = new JPanel();
    Image bg;
    Image car;
    int x = 20;
    CARMOVE()
    {
        this.setSize(1024,520);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.addKeyListener(this);

        MyPanel .setBounds(0, 0,1024,520);
        this.add(MyPanel);
        ImageIcon BG = new ImageIcon("background.png");
        bg = BG.getImage();

        ImageIcon CAR = new ImageIcon("car.png");
        car = CAR.getImage();
    }

    @Override
    public void paint(Graphics Mehrab) {
        Mehrab.drawImage(bg, 0,0, MyPanel);
        Mehrab.drawImage(car,x,430, MyPanel);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if(keyEvent.getKeyChar() == 'd')
        {
            x += 10;
        }
        if(keyEvent.getKeyChar() == 'a')
        {
            x -= 10;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
