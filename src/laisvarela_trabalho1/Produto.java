package laisvarela_trabalho1;

import java.time.LocalDate;

public class Produto {

    private String nome;
    private String codigo;
    private Float valor;
    private LocalDate dataValidade;
    private int qtd;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Produto(String nome, String codigo, Float valor, LocalDate dataValidade, int qtd) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.dataValidade = dataValidade;
        this.qtd = qtd;
    }

    public Produto() {
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

}
