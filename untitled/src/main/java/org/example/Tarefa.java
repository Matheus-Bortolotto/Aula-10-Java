package org.example;

import java.util.ArrayList;
import java.util.List;


 //Representa uma tarefa com título, descrição e status de conclusão.

public class Tarefa {

    /**
     * Título da tarefa.
     */
    private String titulo;

    /**
     * Descrição detalhada da tarefa.
     */
    private String descricao;

    /**
     * Indica se a tarefa foi concluída.
     */
    private boolean concluida;

    /**
     * Construtor da classe Tarefa.
     *
     * @param titulo     O título da tarefa.
     * @param descricao  A descrição da tarefa.
     */
    public Tarefa(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }

    /**
     * Marca a tarefa como concluída.
     */
    public void concluir(){
        this.concluida = true;
    }

    /**
     * Reabre a tarefa, marcando-a como não concluída.
     */
    public void reabrir(){
        this.concluida = false;
    }

    
      //Verifica se a tarefa está concluída.

    public boolean estaConcluida(){
        return concluida;
    }

    /**
     * Retorna o título da tarefa.
     *
     * @return O título da tarefa.
     */
    public String getTitulo(){
        return titulo;
    }

    /**
     * Retorna a descrição da tarefa.
     *
     * @return A descrição da tarefa.
     */
    public String getDescricao(){
        return descricao;
    }
}
