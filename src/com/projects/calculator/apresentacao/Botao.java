package com.projects.calculator.apresentacao;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Botao(String texto, Color cor) {
        setText(texto);
        setOpaque(true);
        setBackground(cor);
        setFont(new Font("arial", Font.BOLD, 50));
    }

}
