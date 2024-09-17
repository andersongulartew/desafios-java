## Sistema de Controle de Estoque

### O DESAFIO

Você foi contratado para desenvolver um sistema de controle de estoque para uma loja. Sua missão será construir a lógica para gerenciar produtos, entradas e saídas de estoque.

### PRODUTOS EXISTENTES

A loja possui os seguintes produtos em estoque.

| ID | Nome | Quantidade | Preço |
| --- | --- | --- | --- |
| 1 | Camiseta | 50 | 29.99 |
| 2 | Calça Jeans | 30 | 79.99 |
| 3 | Tênis | 20 | 99.99 |
| 4 | Jaqueta | 15 | 149.99 |
| 5 | Boné | 40 | 19.99 |

### REGRAS PARA CONTROLE DE ESTOQUE

1.  O sistema deve permitir a entrada de novos produtos no estoque.
2.  O sistema deve permitir a saída de produtos do estoque, atualizando a quantidade disponível.
3.  O sistema deve permitir a consulta de produtos disponíveis e suas quantidades.
4.  O sistema deve calcular o valor total do estoque com base nas quantidades e preços dos produtos.

### ENTRADAS E SAÍDAS

1.  O programa deve receber o ID do produto e a quantidade para realizar uma entrada ou saída de estoque.
2.  O programa deve retornar uma mensagem de sucesso ou erro, dependendo da operação.
3.  O programa deve permitir a consulta do valor total do estoque.

### EXEMPLOS

Entrada para uma entrada de estoque válida

```java
entradaEstoque(1, 10);
```

Saída

```java
{
  mensagem: "Entrada de estoque realizada com sucesso. Quantidade atual: 60"
}
```

---

Entrada para uma saída de estoque inválida

```java
saidaEstoque(3, 25);
```

Saída

```java
{
  erro: "Quantidade insuficiente em estoque"
}
```

---

Entrada para uma entrada de estoque válida

```java
entradaEstoque(2, 15);
```

Saída

```java
{
mensagem: "Entrada de estoque realizada com sucesso. Quantidade atual: 45"
}
```

---

Entrada para uma entrada de estoque válida

```java
entradaEstoque(4, 5);
```

Saída

```java
{
mensagem: "Entrada de estoque realizada com sucesso. Quantidade atual: 20"
}
```

---

Entrada para uma saída de estoque válida

```java
saidaEstoque(1, 10);
```

Saída

```java
{
mensagem: "Saída de estoque realizada com sucesso. Quantidade atual: 40"
}
```

---

Entrada para uma saída de estoque inválida

```java
saidaEstoque(4, 25);
```

Saída

```java
{
erro: "Quantidade insuficiente em estoque"
}
```

---

Entrada para uma consulta do valor total do estoque

```java
calcularValorTotalEstoque();
```

Saída

```java
{
  valorTotal: 4999.50
}
```
