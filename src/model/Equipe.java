package model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private String descricao;
    private List<Usuario> membros;
    private List<Projeto> projetos;

    public Equipe(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.membros = new ArrayList<>();
        this.projetos = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Usuario> getMembros() { return membros; }
    public List<Projeto> getProjetos() { return projetos; }

    public void adicionarMembro(Usuario u) { membros.add(u); }
    public void adicionarProjeto(Projeto p) { projetos.add(p); }
}
