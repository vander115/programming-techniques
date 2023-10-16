package com.projects.calculator.apresentacao;

import javax.swing.*;
import java.awt.*;


public class Display extends JPanel {

    private JLabel label;

    public Display() {

        label = new JLabel();
        label.setBackground(Color.LIGHT_GRAY);
        label.setFont(new Font("arial", Font.BOLD, 40));
        this.setBackground(Color.GRAY);
        add(label);
    }

    public void setLabel(String texto) {
        label.setText(texto);
    }

}
