package org.skm.LifeChangingApp;

import org.skm.EnumPatterns;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LifeChangingApp {



    public static void main(String[] args) {
        System.out.println("-------"+ EnumPatterns.PATTERN_OBSERVER+"--------");
        JFrame frame=new JFrame();
        JButton button=new JButton();
        frame.setSize(1000,300);
        button.setSize(300,100);
        frame.add(button);
        button.setText("Should I do it?");
        button.addActionListener(event-> System.out.println("Dont do it"));
        button.addActionListener(event-> System.out.println("dooo itt"));
        frame.show();
    }



}
