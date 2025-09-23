package model;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String status; // Planejado, Em andamento, Concluído, Cancelado
    private Gerente gerenteResponsavel;
    private List<Tarefa> tarefas;

    public Projeto(String nome, String descricao, String dataInicio, String dataTermino, Gerente gerenteResponsavel) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.status = "Planejado";
        this.gerenteResponsavel = gerenteResponsavel;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public String getStatus() { return status; }
    public Gerente getGerenteResponsavel() { return gerenteResponsavel; }
    public List<Tarefa> getTarefas() { return tarefas; }

    public void adicionarTarefa(Tarefa t) { tarefas.add(t); }
    public void atualizarStatus(String status) { this.status = status; }
}
