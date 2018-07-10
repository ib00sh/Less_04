package Dop_HW_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubWindow extends JFrame {
    MyWindow myWindow;
    public SubWindow(MyWindow myWindow) {
        this.myWindow = myWindow;
        JPanel panel = new JPanel(new GridLayout(1,3));
        JTextField name = new JTextField();
        JTextField surName = new JTextField();
        JTextField thirdName = new JTextField();
        setBounds(400,400,300,200);
        panel.add(name);
        panel.add(surName);
        panel.add(thirdName);

        JButton btn = new JButton("Отправить данные");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myWindow.setParam(name.getText(), surName.getText(), thirdName.getText());
                setVisible(false);
            }
        });

        add(panel, BorderLayout.NORTH);
        add(btn, BorderLayout.SOUTH);
        setTitle("Заполните поля");
        setVisible(false);
    }

}
