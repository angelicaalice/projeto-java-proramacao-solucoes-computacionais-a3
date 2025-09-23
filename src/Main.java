import model.*;
import controller.*;
import view.SistemaView;

public class Main {
    public static void main(String[] args) {
        SistemaView view = new SistemaView();

        // Controllers
        UsuarioController usuarioController = new UsuarioController(view);
        TarefaController tarefaController = new TarefaController(view);
        ProjetoController projetoController = new ProjetoController(view);
        EquipeController equipeController = new EquipeController(view);

        // Criar usuários
        Administrador admin = new Administrador("Angelica Freitas", "12345678900", "angelica@email.com", "Administrador", "admin", "1234");
        Gerente gerente = new Gerente("Maria Silva", "11122233344", "maria@email.com", "Gerente", "maria", "1234");
        Usuario usuario = new Usuario("Diego Santos", "55566677788", "diego@email.com", "Colaborador", "diego", "1234", "Colaborador");

        usuarioController.adicionarUsuario(admin);
        usuarioController.adicionarUsuario(gerente);
        usuarioController.adicionarUsuario(usuario);

        // Criar projeto
        Projeto projeto = new Projeto("Sistema Oracle", "Desenvolvimento do sistema de gestão", "01/10/2025", "31/12/2025", gerente);
        projetoController.adicionarProjeto(projeto);

        // Criar tarefas
        Tarefa t1 = new Tarefa("Planejar cronograma");
        Tarefa t2 = new Tarefa("Desenvolver código");
        tarefaController.adicionarTarefa(t1);
        tarefaController.adicionarTarefa(t2);

        projeto.adicionarTarefa(t1);
        projeto.adicionarTarefa(t2);

        // Criar equipe
        Equipe equipe = new Equipe("Equipe Alpha", "Equipe de desenvolvimento do projeto Oracle");
        equipe.adicionarMembro(usuario);
        equipe.adicionarProjeto(projeto);
        equipeController.adicionarEquipe(equipe);

        // Atualizar status de tarefa
