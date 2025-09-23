package model;

public class Usuario {
    protected String nome;
    protected String cpf;
    protected String email;
    protected String cargo;
    protected String login;
    protected String senha;
    protected String papel;

    public Usuario(String nome, String cpf, String email, String cargo, String login, String senha, String papel) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.papel = papel;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { retu
