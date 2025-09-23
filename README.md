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

