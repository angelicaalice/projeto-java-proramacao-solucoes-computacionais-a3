package model;

public class Gerente extends Usuario {
    public Gerente(String nome, String cpf, String email, String cargo, String login, String senha) {
        super(nome, cpf, email, cargo, login, senha, "Gerente");
    }
}
