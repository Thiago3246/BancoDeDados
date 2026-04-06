# Banco de Dados com Java ☕

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)

Este repositório contém exemplos práticos de como realizar a integração entre uma aplicação **Java** e um banco de dados **MySQL**. O foco é demonstrar conexões, operações de CRUD (Create, Read, Update, Delete) e boas práticas de organização de código.

## 📋 Sobre o Projeto

O projeto foi desenvolvido para servir como base de estudos sobre persistência de dados. Ele aborda desde a configuração do driver JDBC até a execução de comandos SQL diretamente pelo código Java.

### Principais Funcionalidades:
* Configuração de conexão com banco de dados local.
* Inserção de registros via código.
* Consulta e listagem de dados.
* Atualização e remoção de informações.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 8 ou superior)
* **Banco de Dados:** MySQL
* **Driver:** MySQL Connector/J
* **IDE Recomendada:** Eclipse ou IntelliJ IDEA

## ⚙️ Como Configurar o Ambiente

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/Thiago3246/BancoDeDados.git
    ```

2.  **Configuração do MySQL:**
    * Certifique-se de que o servidor MySQL está rodando.
    * Crie um banco de dados para os testes.
    * Verifique as credenciais (usuário e senha) no arquivo de conexão dentro da pasta `src/bancoDados`.

3.  **Importação no Eclipse/IntelliJ:**
    * Importe como um projeto Java comum.
    * Certifique-se de que o `.jar` do conector MySQL está no *Build Path* do projeto.
