package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private String cliente;
    private LocalDateTime dataHora;
    private List<ItemPedido> itens;
    private boolean finalizado;

    /**
     *
     * @param numero
     * @param cliente
     */
    public Pedido(int numero, String cliente){
        this.numero = numero;
        this.cliente = cliente;
        this.dataHora = LocalDateTime.now();
        this.itens = new ArrayList<>();
        this.finalizado = false;
    }

    /**
     *
     * @param descricao
     * @param preco
     * @param quantidade
     */
    public void adicionarItem(String descricao, double preco, int quantidade){
        itens.add(new ItemPedido(descricao,preco,quantidade));
    }

    public double calcularTotal(){
        double total = 0;
        for (ItemPedido item : itens){
            total += item.getPreco() * item.getQuantidade();

        }
        return total;
    }

    public void finalizarPedido(){
        this.finalizado = true;
    }

    public boolean isFinalizado(){
        return finalizado;
    }

    public List<ItemPedido> getItens(){
        return itens;
    }

    public String getCliente(){
        return cliente;
    }

    public int getNumero(){
        return numero;
    }

    public LocalDateTime getDataHora(){
        return dataHora;
    }

    class ItemPedido{
        private String descricao;
        private double preco;
        private int quantidade;

        public ItemPedido(String descricao, double preco, int quantidade){
            this.descricao = descricao;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public String getDescricao(){
            return descricao;
        }

        public double getPreco(){
            return preco;
        }

        public int getQuantidade(){
            return quantidade;
        }
    }
}
