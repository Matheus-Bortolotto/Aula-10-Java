package org.example;

/**
 * Esta classe demostra o uso de JavaDoc
 * Ela contém um método simples para calcular o quadrado de um número
 */

public class ExemploJavaDoc {

    /**
     * Calcula o quadrado de um número inteiro.
     *
     * @param numero
     * @return
     */

    public int calcularQuadrado(int numero){
        return numero * numero;
    }

    public static void main(String[] args){
        ExemploJavaDoc exemplo = new ExemploJavaDoc();
        int resultado = exemplo.calcularQuadrado(4);

        //Exibe o resultado do cálculo
        System.out.println("O quadrado de 4 é: " +resultado);
    }
}
