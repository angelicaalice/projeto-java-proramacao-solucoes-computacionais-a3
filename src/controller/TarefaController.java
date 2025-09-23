package controller;

import model.Tarefa;
import view.SistemaView;
import java.util.ArrayList;
import java.util.List;

public class TarefaController {
    private List<Tarefa> tarefas;
    private SistemaView view;

    public TarefaController(SistemaView view) {
        this.tarefas = new ArrayList<>();
        this.view = view;
    }

    public void adicionarTarefa(Tarefa t) {
        tarefas.add(t);
        view.exibirMensagem("Tarefa '" + t.getTitulo() + "' adicionada!");
    }

    public List<Tarefa> getTarefas() { return tarefas; }

    public void gerarRelatorioTarefas() { view.exibirTarefas(tarefas); }
}
