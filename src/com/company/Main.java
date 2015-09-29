package com.company;

import com.company.Practice.MyDrawPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    JFrame frame;
    JLabel label;

    public static void main(String[] args) {

        Main gui = new Main();
        gui.go();
    }

    public void go() {

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListner());

        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListner());

        label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

        class LabelListner implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                label.setText("Ouch!");
            }
        }

        class ColorListner implements ActionListener{
            public void actionPerformed(ActionEvent event){
                frame.repaint();
            }
        }
}




