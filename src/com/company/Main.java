package com.company;

import com.company.Practice.GUI.MyDrawPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

   static JFrame frame;

    public static void main(String[] args) {


        go();

    }
    public static void go(){

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton button = new JButton("Change colors");
        button.addActionListener(new Main());

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }


}




