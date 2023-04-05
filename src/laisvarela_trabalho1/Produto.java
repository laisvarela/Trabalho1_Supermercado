package laisvarela_trabalho1;

import java.time.LocalDate;

public class Produto {

    private String nome;
    private String codigo;
    private Float valor;
    private LocalDate dataValidade;

    public Produto(String nome, String codigo, Float valor, LocalDate dataValidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.dataValidade = dataValidade;
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
