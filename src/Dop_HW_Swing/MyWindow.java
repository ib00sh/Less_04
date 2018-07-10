package Dop_HW_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow  extends JFrame {
    SubWindow subWindow;
    JLabel lblName;
    JLabel lblSurName;
    JLabel lblThirdName;

    public MyWindow() {
        setTitle("Main Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel lbl = new JLabel("Ваше ФИО: ");

        lblName = new JLabel(" ");
        lblSurName = new JLabel(" ");
        lblThirdName = new JLabel(" ");

        JPanel panel = new JPanel(new GridLayout(4,1));
        panel.add(lbl);
        panel.add(lblName);
        panel.add(lblSurName);
        panel.add(lblThirdName);

        JButton btn = new JButton("Введите данные");
        add(panel, BorderLayout.NORTH);
        add(btn, BorderLayout.SOUTH);
        setBounds(400,400,300,200);
        subWindow = new SubWindow(this);
        setVisible(true);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subWindow.setVisible(true);
            }
        });

    }
    void setParam (String name, String surName, String thirdName){
        lblName.setText("Имя: " + name);
        lblSurName.setText("Фамилия: " + surName);
        lblThirdName.setText("Отчество: " + thirdName);
    }
}
