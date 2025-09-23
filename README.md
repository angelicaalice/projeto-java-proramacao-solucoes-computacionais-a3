# Projeto Acadêmico - Atividade A3: Programação de Soluções Computacionais - Java MVC

**Autor:** Angélica Freitas  
**Projeto:** ProjetoJavaMVC  

Sistema de **Gestão de Projetos e Equipes** desenvolvido em **Java**, seguindo o padrão **MVC (Model-View-Controller)**. Permite gerenciar usuários, equipes, projetos e tarefas, acompanhando o andamento e gerando relatórios de desempenho.

---

## **Funcionalidades**

### 1. Usuários
- Cadastro e manutenção de usuários.  
- Cada usuário possui: nome completo, CPF, e-mail, cargo, login e senha.  
- Perfis de usuário: **Administrador**, **Gerente**, **Colaborador**.  
- Administrador: cria/remover usuários, gera relatórios completos.  
- Gerente: supervisiona projetos, gera relatórios parciais.  
- Colaborador: executa tarefas e atualiza status.

### 2. Projetos
- Cadastro de projetos com: nome, descrição, datas de início e término, status (planejado, em andamento, concluído, cancelado).  
- Cada projeto possui um gerente responsável.  
- Associação de tarefas ao projeto.

### 3. Equipes
- Cadastro de equipes com: nome, descrição e membros vinculados.  
- Uma equipe pode atuar em vários projetos.

### 4. Tarefas
- Cadastro de tarefas relacionadas a projetos.  
- Atualização do status das tarefas (pendente, em andamento, concluída).

### 5. Relatórios
- Relatórios parciais: status das tarefas de cada projeto.  
- Relatórios completos: usuários, projetos, equipes e tarefas.

---

## **Estrutura do Projeto**

ProjetoJavaMVC/
│
├─ README.md # Este arquivo
└─ src/ # Código-fonte
├─ model/ # Classes de dados (Usuario, Projeto, Equipe, Tarefa)
├─ view/ # Exibição de informações (SistemaView)
├─ controller/ # Lógica de controle (controllers)
└─ Main.java # Ponto de entrada do programa


## **Tecnologias Utilizadas**
- Java 11 ou superior  
- Padrão MVC (Model-View-Controller)  
- Estrutura de dados em memória (ArrayList)  
- IDEs recomendadas: Sublime Text, IntelliJ, Eclipse, VS Code  

---


## **Como Rodar o Projeto**

1. Navegue até a pasta `src` no terminal:  
```bash
cd /caminho/para/ProjetoJavaMVC/src
```

2. Compile todos os arquivos Java:
```bash
javac Main.java model/*.java view/*.java controller/*.java
```

3. Execute o sistema:
```bash
java Main
```
Você verá no console os relatórios de usuários, tarefas, projetos e equipes.

## **Observações**

Este projeto é funcional via console, podendo ser expandido para interface gráfica ou banco de dados.

Desenvolvido com foco em arquitetura MVC, atendendo aos requisitos acadêmicos.
