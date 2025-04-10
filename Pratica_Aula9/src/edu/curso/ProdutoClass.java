package edu.curso;

public class ProdutoClass {
    private String nome;
    private double preco;
    private String noticia;

    public ProdutoClass(String nome, double preco, String noticia){
        this.nome = nome;
        this.preco = preco;
        this.noticia = noticia;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getNoticia() {
        return noticia;
    }
    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }
}
