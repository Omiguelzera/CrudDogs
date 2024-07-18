
### Documentação do Projeto DogsControle
## Visão Geral
O projeto DogsControle é uma aplicação web que gerencia um banco de dados de cães, permitindo operações de cadastro, atualização, exclusão e listagem de registros. A aplicação é desenvolvida usando Java EE, JSP e PostgreSQL.

## Estrutura do Projeto
### Pacotes
* util: Contém o servlet DogsControle.
* DAO: Contém a classe de acesso a dados DogsDAO.
* conexao: Contém a classe de conexão com o banco de dados.
* model: Contém a classe de modelo Dogs.
## Classes
1. DogsControle.java
Esta classe é um servlet responsável por processar as requisições HTTP (GET e POST) para gerenciar os registros de cães.

processRequest(HttpServletRequest request, HttpServletResponse response): Método principal que processa todas as operações de CRUD (Create, Read, Update, Delete).

2. conexao.java Classe responsável pela conexão com o banco de dados PostgreSQL.
getConexao(): Método que retorna uma conexão com o banco de dados.

3. Dogs.java
Classe de modelo que representa a entidade Dogs.

Atributos: codigo, nome, idade, raca, peso, porte, cor, descricao, endereco, comidafav.
Métodos Getters e Setters para cada atributo.

4. DogsDAO.java
Classe de acesso a dados que contém métodos para interagir com o banco de dados.

Cadastra(Dogs d): Insere um novo registro no banco de dados.

Deletar(Dogs d): Deleta um registro existente no banco de dados.

Atualizar(Dogs d): Atualiza um registro existente no banco de dados.

Consulta(Dogs d): Consulta um registro específico no banco de dados.

ConsultaTodos(): Consulta todos os registros no banco de dados.

### Banco de Dados
O projeto utiliza o PostgreSQL como banco de dados. A estrutura da tabela tdogs é a seguinte:

    CREATE TABLE tdogs (
    codigo SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    idade INTEGER,
    raca VARCHAR(100),
    peso DOUBLE PRECISION,
    porte VARCHAR(50),
    cor VARCHAR(50),
    nd TEXT,
    endereco VARCHAR(255),
    comidafav VARCHAR(100)
);


### Front-End
As páginas front-end foram desenvolvidas utilizando HTML e JSP, com um CSS simples para estilização. As páginas principais são:

OpSucesso.jsp: Exibida quando uma operação é realizada com sucesso.

Erro.jsp: Exibida quando ocorre um erro durante uma operação.

ListaDogs.jsp: Exibe a lista de todos os cães cadastrados.

confirmaATT.jsp: Formulário para confirmar a atualização de um registro.

### Estrutura de Pastas
web/: Contém os arquivos JSP e HTML.

web/css/: Contém os arquivos CSS.

### Estilo CSS
Um único arquivo CSS é usado para estilizar todas as páginas, garantindo uma aparência agradável e consistente.

### Configuração do Ambiente
* Requisitos
1. IDE: NetBeans

2. JDK: Java Development Kit 8 ou superior

3. Banco de Dados: PostgreSQL

4. Servidor de Aplicação: Apache Tomcat

### Passos para Configuração

* Instalar o PostgreSQL e criar a tabela tdogs conforme descrito acima.

* Configurar a IDE NetBeans com o plugin do Apache Tomcat.

* Importar o projeto DogsControle na IDE NetBeans.

* Configurar o arquivo de conexão conexao.java com as credenciais do banco de dados PostgreSQL.

* Construir e executar o projeto através da IDE NetBeans.

## Testes
Os testes foram realizados manualmente através da interface web. As operações foram verificadas para garantir que todas as funcionalidades de CRUD estejam funcionando corretamente.

Adendo
A aplicação foi desenvolvida e testada usando a IDE NetBeans. A estilização foi mantida simples para focar na funcionalidade e usabilidade da aplicação.







## Stack utilizada

**Front-end:** Html, jps, Css

**Back-end:** JavaWeb

