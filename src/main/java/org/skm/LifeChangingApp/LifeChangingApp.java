package org.skm.LifeChangingApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LifeChangingApp {

    private JFrame frame=new JFrame();
    private JButton button=new JButton();

    public void run(){
        frame.setSize(1000,300);
        button.setSize(300,100);
        frame.add(button);
        button.setText("Should I do it?");
        button.addActionListener(event-> System.out.println("Dont do it"));
        button.addActionListener(event-> System.out.println("dooo itt"));
        frame.show();


    }

}
