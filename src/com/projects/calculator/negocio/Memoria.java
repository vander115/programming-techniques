package com.projects.calculator.negocio;

import java.util.ArrayList;

public class Memoria {

    private ArrayList<String> numeros = new ArrayList<>();

    public Memoria() {


    }

    public String getNumeros() {
        String resultado = "";

        for (String num : numeros) {
            resultado += " " + num;
        }

        return resultado;
    }

    public void setNumero(String numero) {
        numeros.add(numero);
    }

    public void limparNumeros() {
        numeros.clear();
    }

}
