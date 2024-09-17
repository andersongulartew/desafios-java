## Sistema de Gerenciamento de Biblioteca

### O DESAFIO

Você foi contratado para desenvolver um sistema de gerenciamento de biblioteca. Sua missão será construir a lógica para gerenciar livros, membros e empréstimos.

### LIVROS EXISTENTES

A biblioteca possui os seguintes livros disponíveis.

**Tabela**

| ID | Título | Autor | Gênero | Disponível |
| --- | --- | --- | --- | --- |
| 1 | O Senhor dos Anéis | J.R.R. Tolkien | Fantasia | Sim |
| 2 | 1984 | George Orwell | Distopia | Não |
| 3 | Dom Quixote | Miguel de Cervantes | Clássico | Sim |
| 4 | O Pequeno Príncipe | Antoine de Saint-Exupéry | Infantil | Sim |
| 5 | Harry Potter e a Pedra Filosofal | J.K. Rowling | Fantasia | Não |

### MEMBROS

A biblioteca possui os seguintes membros cadastrados.

**Tabela**

| ID | Nome | Livros Emprestados |
| --- | --- | --- |
| 1 | Alice | 1 |
| 2 | Bob | 0 |
| 3 | Carol | 2 |
| 4 | Dave | 0 |
| 5 | Eve | 1 |

### REGRAS PARA EMPRÉSTIMO

1.  Um membro pode pegar no máximo 2 livros emprestados ao mesmo tempo.
2.  Um livro só pode ser emprestado se estiver disponível.
3.  O sistema deve registrar a data de empréstimo e a data de devolução prevista (14 dias após o empréstimo).
4.  O sistema deve permitir a devolução de livros, atualizando a disponibilidade do livro e o número de livros emprestados pelo membro.

### ENTRADAS E SAÍDAS

1.  O programa deve receber o ID do membro e o ID do livro para realizar um empréstimo.
2.  O programa deve retornar uma mensagem de sucesso ou erro, dependendo das regras de empréstimo.
3.  O programa deve permitir a consulta de livros disponíveis e membros cadastrados.

### EXEMPLOS

Entrada para um caso válido

```java
emprestarLivro(1, 3);
```

Saída

```java
{
  mensagem: "Empréstimo realizado com sucesso. Data de devolução: 01/10/2024"
}
```

---

Entrada para um caso inválido

```java
emprestarLivro(2, 2);
```

Saída

```java
{
  erro: "Livro não disponível"
}
```

---

Entrada para um caso inválido (membro já com 2 livros emprestados)

```java
emprestarLivro(3, 4);
```

Saída

```java
{
erro: "Membro já possui 2 livros emprestados"
}
```

---

Entrada para uma devolução válida

```java
devolverLivro(1, 1);
```

Saída

```java
{
mensagem: "Devolução realizada com sucesso. Livro disponível para empréstimo."
}
```

---

Entrada para uma devolução inválida (livro não emprestado pelo membro)

```java
devolverLivro(2, 1);
```

Saída

```java
{
erro: "Livro não foi emprestado por este membro"
}
```

---

Entrada para consulta de livros disponíveis

```java
consultarLivrosDisponiveis();
```

Saída

```java
{
livros: [
{ id: 1, titulo: "O Senhor dos Anéis", autor: "J.R.R. Tolkien", genero: "Fantasia", disponivel: true },
{ id: 3, titulo: "Dom Quixote", autor: "Miguel de Cervantes", genero: "Clássico", disponivel: true },
{ id: 4, titulo: "O Pequeno Príncipe", autor: "Antoine de Saint-Exupéry", genero: "Infantil", disponivel: true }
]
}
```

---

Entrada para consulta de membros cadastrados

```java
consultarMembros();
```

Saída

```java
{
membros: [
{ id: 1, nome: "Alice", livrosEmprestados: 1 },
{ id: 2, nome: "Bob", livrosEmprestados: 0 },
{ id: 3, nome: "Carol", livrosEmprestados: 2 },
{ id: 4, nome: "Dave", livrosEmprestados: 0 },
{ id: 5, nome: "Eve", livrosEmprestados: 1 }
]
}
```
