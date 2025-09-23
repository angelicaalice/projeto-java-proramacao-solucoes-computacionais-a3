package controller;

import model.Usuario;
import view.SistemaView;
import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    private List<Usuario> usuarios;
    private SistemaView view;

    public UsuarioController(SistemaView view) {
        this.usuarios = new ArrayList<>();
        this.view = view;
    }

    public void adicionarUsuario(Usuario u) {
        usuarios.add(u);
        view.exibirMensagem("Usuário " + u.getNome() + " adicionado!");
    }

    public void removerUsuario(Usuario u) {
        usuarios.remove(u);
        view.exibirMensagem("Usuário " + u.getNome() + " removido!");
    }

    public List<Usuario> getUsuarios() { return usuarios; }

    public void gerarRelatorioUsuarios() { view.exibirUsuarios(usuarios); }
}
