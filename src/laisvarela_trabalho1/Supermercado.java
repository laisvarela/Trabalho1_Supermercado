package laisvarela_trabalho1;

import java.time.LocalDate;

public class Supermercado {

    private String nome;
    private String codigo;
    private LocalDate validade;
    private float valor;
    private int qtd;
    private float total;

    public Supermercado() {
    }

    public Supermercado(String nome, String codigo, LocalDate validade, float valor, int qtd) {
        this.nome = nome;
        this.codigo = codigo;
        this.validade = validade;
        this.valor = valor;
        this.qtd = qtd;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
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

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
