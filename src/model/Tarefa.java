package model;

public class Tarefa {
    private String titulo;
    private String status; // Pendente, Em andamento, Concluída

    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.status = "Pendente";
    }

    public String getTitulo() { return titulo; }
    public String getStatus() { return status; }

    public void atualizarStatus(String status) {
        this.status = status;
    }
}
