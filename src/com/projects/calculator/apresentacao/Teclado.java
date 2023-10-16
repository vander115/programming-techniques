package com.projects.calculator.apresentacao;

import javax.swing.*;

import com.projects.calculator.negocio.Memoria;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teclado extends JPanel implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Memoria memoria;
    private Display display;

    public Teclado(Memoria memoria, Display display) {

        this.memoria = memoria;
        this.display = display;

        setLayout(new GridLayout(4, 4));
        setBackground(Color.lightGray);

        add(criarBotao("7", Color.GRAY));
        add(criarBotao("8", Color.GRAY));
        add(criarBotao("9", Color.GRAY));
        add(criarBotao("+", Color.lightGray));

        add(criarBotao("4", Color.GRAY));
        add(criarBotao("5", Color.GRAY));
        add(criarBotao("6", Color.GRAY));
        add(criarBotao("-", Color.lightGray));

        add(criarBotao("1", Color.GRAY));
        add(criarBotao("2", Color.GRAY));
        add(criarBotao("3", Color.GRAY));
        add(criarBotao("*", Color.lightGray));

        add(criarBotao("0", Color.GRAY));
        add(criarBotao("/", Color.lightGray));
        add(criarBotao(".", Color.lightGray));
        add(criarBotao("=", Color.lightGray));

    }

    public Botao criarBotao(String texto, Color cor) {
        Botao b = new Botao(texto, cor);
        b.addActionListener(this);
        return b;
    }


    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        String textoBotao = b.getText();

        if (textoBotao.equals("=")) {
            calcularResultado();
        } else {
            memoria.setNumero(textoBotao);
            display.setLabel(memoria.getNumeros());
        }
    }

    private void calcularResultado() {

        String expressao = memoria.getNumeros();

        String[] partes = expressao.trim().split(" ");

        if (partes.length == 3) {

            double num1 = Integer.parseInt(partes[0]);
            String operador = partes[1];
            double num2 = Integer.parseInt(partes[2]);

            double resultado = realizarOperacao(num1, operador, num2);

            display.setLabel(Double.toString(resultado));
            memoria.limparNumeros();
        }
    }

    private double realizarOperacao(double num1, String operador, double num2) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return 0;
                }
            default:
                return 0;
        }
    }

}
