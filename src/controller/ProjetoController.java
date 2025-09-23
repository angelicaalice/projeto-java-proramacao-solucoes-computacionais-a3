package controller;

import model.Projeto;
import view.SistemaView;
import java.util.ArrayList;
import java.util.List;

public class ProjetoController {
    private List<Projeto> projetos;
    private SistemaView view;

    public ProjetoController(SistemaView view) {
        this.projetos = new ArrayList<>();
        this.view = view;
    }

    public void adicionarProjeto(Projeto p) {
        projetos.add(p);
        view.exibirMensagem("Projeto '" + p.getNome() + "' adicionado!");
    }

    public List<Projeto> getProjetos() { return projetos; }

    public void gerarRelatorioProjetos() { view.exibirProjetos(projetos); }
}
