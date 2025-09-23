# projeto-java-proramacao-solucoes-computacionais-a3
Projeto Acadêmico: Programação de Soluções Computacionais - Java MVC
- Autor: Angélica Freitas


# ProjetoJavaMVC
Projeto de sistema de gerenciamento de usuários e tarefas em Java usando MVC.

## Funcionalidades
- CRUD de usuários e tarefas
- Atualização de status de tarefas
- Relatórios parciais e completos
- Papéis: Administrador, Gerente e Usuário

## Estrutura
- `model/` → classes de dados
- `view/` → exibição de informações
- `controller/` → lógica de controle entre Model e View
- `Main.java` → ponto de entrada do programa

# Sistema de Gestão de Projetos e Equipes

## Descrição do Projeto
Este projeto consiste em um **Sistema de Gestão de Projetos e Equipes** desenvolvido em **Java**, seguindo o padrão **MVC (Model-View-Controller)**. O sistema permite o gerenciamento eficiente de usuários, equipes, projetos e tarefas, possibilitando a alocação adequada de colaboradores, acompanhamento do andamento dos projetos e geração de relatórios de desempenho.

O sistema foi desenvolvido como atividade acadêmica, com foco em controle de projetos orientados a equipes, atendendo às necessidades descritas no caso Oracle.

---

## Funcionalidades

### **1. Usuários**
- Cadastro e manutenção de usuários.
- Cada usuário possui: nome completo, CPF, e-mail, cargo, login e senha.
- Perfis de usuário: **Administrador**, **Gerente**, **Colaborador**.
- Administrador: cria/remover usuários, gerar relatórios completos.
- Gerente: supervisiona projetos, gera relatórios parciais.
- Colaborador: executa tarefas e atualiza status.

### **2. Projetos**
- Cadastro de projetos com: nome, descrição, datas de início e término, status (planejado, em andamento, concluído, cancelado).
- Cada projeto possui um gerente responsável.
- Associação de tarefas ao projeto.

### **3. Equipes**
- Cadastro de equipes com: nome, descrição e membros vinculados.
- Uma equipe pode atuar em vários projetos.

### **4. Tarefas**
- Cadastro de tarefas relacionadas a projetos.
- Atualização do status das tarefas (pendente, em andamento, concluída).

### **5. Relatórios**
- Relatórios parciais: status das tarefas de cada projeto.
- Relatórios completos: usuários, projetos, equipes e tarefas.

---

## Estrutura do Projeto (MVC)

