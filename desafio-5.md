## Sistema de Gestão de Cursos Online

####   
Requisitos Detalhados

**1\. Curso**  
  - Cada curso tem um ID, título, descrição, duração e lista de alunos matriculados.  
  - Deve ser possível adicionar, remover e atualizar cursos no sistema.

**2\. Aluno**  
  - Cada aluno tem um ID, nome, e-mail e lista de cursos matriculados.  
  - Deve ser possível adicionar, remover e atualizar alunos no sistema.

**3\. Matrícula**  
  - Cada matrícula tem um ID, aluno, curso e data de matrícula.  
  - Deve ser possível registrar, atualizar e cancelar matrículas.  
  - O sistema deve verificar se o aluno já está matriculado no curso antes de registrar a matrícula.  
  - Deve ser possível listar todos os cursos de um aluno específico.

**4\. Relatórios**  
  - Deve ser possível gerar um relatório de alunos matriculados por curso e por período.

---

### Exemplos de Entrada e Saída

### Exemplo 1: Adicionar Curso

**Entrada:**

```java
Curso curso1 = new Curso("1", "Java Básico", "Curso introdutório de Java", 40);
sistema.adicionarCurso(curso1);
```

**Saída:** Curso adicionado com sucesso.

---

### Exemplo 2: Adicionar Aluno

**Entrada:**

```java
Aluno aluno1 = new Aluno("1", "João Silva", "joao.silva@example.com");
sistema.adicionarAluno(aluno1);
```

**Saída:** Aluno adicionado com sucesso.

---

### Exemplo 3: Registrar Matrícula

**Entrada:**

```java
sistema.registrarMatricula("1", "1");
```

**Saída:** Matrícula registrada com sucesso.

---

### Exemplo 4: Listar Cursos de um Aluno

**Entrada:**

```java
List<Curso> cursosDoAluno = sistema.listarCursosPorAluno("1");
for (Curso curso : cursosDoAluno) {
    System.out.println(curso.getTitulo());
}
```

**Saída:**

```plaintext
Java Básico
```

---

### Exemplo 5: Gerar Relatório de Alunos por Curso

**Entrada:**

```java
sistema.gerarRelatorioDeAlunosPorCurso();
```

**Saída:**

```plaintext
Curso: Java Básico
 - Aluno: João Silva
```
