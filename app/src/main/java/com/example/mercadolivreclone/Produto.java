package com.example.mercadolivreclone;

public class Produto {
    private String nome;
    private String dataCompra;
    private String status;
    private String dataEntrega;
    private int imagem;

    public Produto(String nome, String status, String dataCompra, String dataEntrega, int imagem) {
        this.nome = nome;
        this.status = status;
        this.dataCompra = dataCompra;
        this.dataEntrega = dataEntrega;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
