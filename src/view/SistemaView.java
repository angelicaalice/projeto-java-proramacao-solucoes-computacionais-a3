package view;

import model.Usuario;
import model.Tarefa;
import model.Projeto;
import model.Equipe;
import java.util.List;

public class SistemaView {

    public void exibirUsuarios(List<Usuario> usuarios) {
        System.out.println("\n--- Usuários ---");
        for (Usuario u : usuarios) {
            System.out.println(u.getNome() + " | CPF: " + u.getCpf() + " | Cargo: " + u.getCargo() + " | Papel: " + u.getPapel());
        }
    }

    public void exibirTarefas(List<Tarefa> tarefas) {
        System.out.println("\n--- Tarefas ---");
        for (Tarefa t : tarefas) {
            System.out.println(t.getTitulo() + " | Status: " + t.getStatus());
        }
    }

    public void exibirProjetos(List<Projeto> projetos) {
        System.out.println("\n--- Projetos ---");
        for (Projeto p : projetos) {
            System.out.println(p.getNome() + " | Status: " + p.getStatus() + " | Gerente: " + p.getGerenteResponsavel().getNome());
        }
    }

    public void exibirEquipes(List<Equipe> equipes) {
        System.out.println("\n--- Equipes ---");
        for (Equipe e : equipes) {
            System.out.println(e.getNome() + " | Membros: " + e.getMembros().size() + " | Projetos: " + e.getProjetos().size());
        }
    }

    public void exibirMensagem(String msg) {
        System.out.println(msg);
    }
}
