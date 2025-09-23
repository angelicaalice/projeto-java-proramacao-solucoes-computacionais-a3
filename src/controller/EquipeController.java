package controller;

import model.Equipe;
import view.SistemaView;
import java.util.ArrayList;
import java.util.List;

public class EquipeController {
    private List<Equipe> equipes;
    private SistemaView view;

    public EquipeController(SistemaView view) {
        this.equipes = new ArrayList<>();
        this.view = view;
    }

    public void adicionarEquipe(Equipe e) {
        equipes.add(e);
        view.exibirMensagem("Equipe '" + e.getNome() + "' adicionada!");
    }

    public List<Equipe> getEquipes() { return equipes; }

    public void gerarRelatorioEquipes() { view.exibirEquipes(equipes); }
}
