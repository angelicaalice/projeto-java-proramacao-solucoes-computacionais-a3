# Projeto Acadêmico: sistema-gestao-projetos-java-1.0.0

 **Autores:**
 
 HENRIQUE SOARES MELO DA SILVA
 
 MATHEUS NEVES SIQUEIRA
 
 ALVARO JULIO PEDRO PRAZERES DA SILVA
 
 ANGELICA ALICE DOS SANTOS DE FREITAS
 
 WENDEL WILLIANS MARQUES SANTONI
 
 RAFAEL MULLER ROSA

---

## Descrição  
Este projeto consiste em um **Sistema de Gestão de Projetos e Equipes** desenvolvido em **Java**, utilizando o padrão **MVC (Model-View-Controller)**.  
O sistema permite gerenciar **usuários, equipes, projetos e tarefas** de forma integrada, possibilitando o acompanhamento das atividades e a geração de relatórios.  

Foi desenvolvido como atividade acadêmica da disciplina *Programação de Soluções Computacionais*.  

---

## Objetivos  
- Aplicar conceitos de **Programação Orientada a Objetos (POO)**.  
- Implementar a arquitetura **MVC** em um projeto funcional.  
- Criar um sistema de gerenciamento simples, com armazenamento em **memória** utilizando `ArrayList`.  
- Treinar versionamento de código com **GitHub**.  

---

## Requisitos Atendidos  

### 👥 Usuários  
- Cadastro e manutenção de usuários (nome, CPF, e-mail, cargo, login, senha).  
- Perfis: **Administrador**, **Gerente** e **Colaborador**.  
  - **Administrador:** gerencia permissões e relatórios completos.  
  - **Gerente:** supervisiona projetos e relatórios parciais.  
  - **Colaborador:** executa tarefas e atualiza status.  

### 📂 Projetos  
- Cadastro de projetos (nome, descrição, datas, status).  
- Associação de projetos a gerentes e equipes.  
- Status: planejado, em andamento, concluído ou cancelado.  

### 👨‍👩‍👧 Equipes  
- Cadastro de equipes (nome, descrição).  
- Associação de membros e projetos às equipes.  
- Uma equipe pode participar de vários projetos.  

### ✅ Tarefas  
- Cadastro de tarefas vinculadas a projetos.  
- Alteração de status: pendente, em andamento, concluída.  


## 🏗️ Arquitetura  

- **Model** → classes de dados (Usuario, Perfil,Projeto,Status,StatusTarefa,Equipe, Tarefa).
- **View** → interface de exibição (ProjetoView) 
- **Controller** → lógica de controle (UsuarioController, ProjetoController, EquipeController)
- **GerenciadorDados** → responsável por salvar e carregar dados do `BancoDeDados`.  

---

## ⚙️ Tecnologias Utilizadas  
- ☕ **Java (JDK 8+)**  
- 🧩 **Paradigma POO**  
- 🏛️ **Padrão MVC**  
- 📋 **ArrayList em memória** para armazenamento temporário  
- 🖥️ **IDE**: Sublime Text / VS Code / IntelliJ IDEA  
- 🌐 **GitHub** para versionamento e entrega  

---


## **Como Rodar o Projeto**

1. Navegue até a pasta `src` no terminal:  
```bash
cd /caminho/para/sistema-gestao-projetos-java-1.0.0/src
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

Desenvolvido com foco em arquitetura MVC, atendendo aos requisitos acadêmicos.
