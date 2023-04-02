package laisvarela_trabalho1;

import java.time.LocalDate;

public class Client {
    private String nome;
    private String cpf;
    private String email;
    private String celular;
    private LocalDate dataNasci;
    private String endereco;
    private int numero;
    private String pagamento;
    private String bandeira;
    private String login;
    private String senha;

    public Client(String nome, String cpf, String email, String celular, 
            String endereco, int numero, String pagamento, String bandeira, 
            LocalDate dataNasci, String login, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
        this.dataNasci = dataNasci;
        this.endereco = endereco;
        this.numero = numero;
        this.pagamento = pagamento;
        this.bandeira = bandeira;
        this.login = login;
        this.senha = senha;
    }
     public Client(String nome, String cpf, String email, 
             String celular, String endereco, int numero, String pagamento, 
             LocalDate dataNasci, String login, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
        this.dataNasci = dataNasci;
        this.endereco = endereco;
        this.numero = numero;
        this.pagamento = pagamento;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDate getDataNasci() {
        return dataNasci;
    }

    public void setDataNasci(LocalDate dataNasci) {
        this.dataNasci = dataNasci;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
