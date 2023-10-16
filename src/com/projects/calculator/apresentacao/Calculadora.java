package com.projects.calculator.apresentacao;

import javax.swing.*;

import com.projects.calculator.negocio.Memoria;

import java.awt.*;

public class Calculadora extends JFrame {


    public Calculadora() {
        organizador();
        setSize(300, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void organizador() {
        Display display = new Display();

        Memoria memoria = new Memoria();
        Teclado teclado = new Teclado(memoria, display);

        setLayout(new BorderLayout());

        display.setPreferredSize(new Dimension(200, 60));
        add(display, BorderLayout.NORTH);
        add(teclado, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new Calculadora();
    }

}
