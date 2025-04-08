package org.example;

import java.awt.*;

public class Comentarios {
    public static void main(String[] args){
        // este é um comentarios de linha única explicando o próximo código.
        System.out.println("olá, mudno");
        /**
         * Este é um comentário de múltiplas linhas.
         * Ele é útil para explicar detalhes mais complexos
         * ou descreve grandes blocos de código
         *
         */
        int resultado = somar(5, 3); //Soma dois números.
        System.out.println("Resultado: " + resultado);
    }

    //Método para somar dois números
    public static int somar(int a, int b){
        return a +b;
    }
}
