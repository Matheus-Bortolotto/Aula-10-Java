package org.example;

import java.time.LocalDate;

/**
 * Representa um chamado com identificador, descrição, responsável,
 * data de abertura e data de fechamento.
 * Permite controlar o status (aberto ou fechado) do chamado.
 */
public class Chamado {

    /**
     * Identificador único do chamado.
     */
    private int id;

    /**
     * Descrição do problema ou solicitação do chamado.
     */
    private String descricao;

    /**
     * Nome do responsável pelo atendimento do chamado.
     */
    private String responsavel;

    /**
     * Data de abertura do chamado.
     */
    private LocalDate dataAbertura;

    /**
     * Data de fechamento do chamado (pode ser nula enquanto o chamado estiver aberto).
     */
    private LocalDate dataFechamento;

    /**
     * Construtor da classe Chamado.
     *
     * @param id            Identificador do chamado.
     * @param descricao     Descrição do chamado.
     * @param responsavel   Nome do responsável pelo chamado.
     * @param dataAbertura  Data em que o chamado foi aberto.
     */
    public Chamado(int id, String descricao, String responsavel, LocalDate dataAbertura){
        this.id = id;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = null;
    }

    /**
     * Fecha o chamado, definindo a data de fechamento.
     *
     * @param dataFechamento Data em que o chamado foi fechado.
     */
    public void fecharChamado(LocalDate dataFechamento){
        this.dataFechamento = dataFechamento;
    }

    /**
     * Verifica se o chamado está aberto.
     *
     * @return {@code true} se o chamado ainda não foi fechado, {@code false} caso contrário.
     */
    public boolean estaAberto(){
        return dataFechamento == null;
    }

    /**
     * Retorna o identificador do chamado.
     *
     * @return O ID do chamado.
     */
    public int getId(){
        return id;
    }

    /**
     * Retorna a descrição do chamado.
     *
     * @return A descrição do chamado.
     */
    public String getDescricao(){
        return descricao;
    }

    public String getResponsavel(){
        return responsavel;
    }

    public LocalDate getDataAbertura(){
        return dataAbertura;
    }

    public LocalDate getDataFechamento(){
        return dataFechamento;
    }
}


