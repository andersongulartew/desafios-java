## Sistema de Gerenciamento de Restaurante

**O DESAFIO** 

Você foi contratado para desenvolver um sistema de gerenciamento de restaurante. Sua missão será construir a lógica para gerenciar mesas, pedidos e clientes.

**MESAS EXISTENTES** 

O restaurante possui as seguintes mesas disponíveis.

**Tabela**

| ID | Capacidade | Ocupada |
| --- | --- | --- |
| 1 | 4 | Não |
| 2 | 2 | Sim |
| 3 | 6 | Não |
| 4 | 4 | Sim |
| 5 | 2 | Não |

**CLIENTES** 

O restaurante possui os seguintes clientes cadastrados.

**Tabela**

| ID | Nome | Pedidos Realizados |
| --- | --- | --- |
| 1 | Ana | 2 |
| 2 | Bruno | 0 |
| 3 | Carla | 1 |
| 4 | Diego | 3 |
| 5 | Elisa | 1 |

**REGRAS PARA PEDIDOS**

*   Um cliente pode fazer no máximo 3 pedidos ao mesmo tempo.
*   Um pedido só pode ser realizado se houver mesa disponível.
*   O sistema deve registrar a data do pedido e a data de entrega prevista (30 minutos após o pedido).
*   O sistema deve permitir a finalização de pedidos, atualizando a disponibilidade da mesa e o número de pedidos realizados pelo cliente.

**ENTRADAS E SAÍDAS**

*   O programa deve receber o ID do cliente e o ID da mesa para realizar um pedido.
*   O programa deve retornar uma mensagem de sucesso ou erro, dependendo das regras de pedidos.
*   O programa deve permitir a consulta de mesas disponíveis e clientes cadastrados.

**EXEMPLOS**

Entrada para um caso válido: 

```java
realizarPedido(1, 3);
```

Saída: 

```java
{
    mensagem: "Pedido realizado com sucesso. Data de entrega: 17/09/2024 10:42"
}
```

---

Entrada para um caso inválido: 

```java
realizarPedido(2, 2);
```

Saída: 

```java

{
    erro: "Mesa ocupada"
}
```

---

Entrada para consulta de mesas disponíveis: 

```java
consultarMesasDisponiveis();
```

Saída: 

```java
{
    mesas: [
        {
            id: 1,
            capacidade: 4,
            ocupada: false
        },
        {
            id: 3,
            capacidade: 6,
            ocupada: false
        },
        {
            id: 5,
            capacidade: 2,
            ocupada: false
        }
    ]
}
```

---

Entrada para um caso válido (pedido realizado com sucesso)

```java
realizarPedido(3, 1);
```

Saída

```java
{
"mensagem": "Pedido realizado com sucesso. Data de entrega: 17/09/2024 10:42"
}
```

---

Entrada para um caso inválido (cliente já com 3 pedidos realizados)

```java
realizarPedido(4, 3);
```

Saída

```java
{
"erro": "Cliente já possui 3 pedidos realizados"
}
```

---

Entrada para um caso inválido (mesa ocupada)

```java
realizarPedido(1, 4);
```

Saída

```java
{
"erro": "Mesa ocupada"
}
```

---

Entrada para finalizar um pedido válido

```java
finalizarPedido(1, 1);
```

Saída

```java
{
"mensagem": "Pedido finalizado com sucesso. Mesa disponível para novos pedidos."
}
```

---

Entrada para finalizar um pedido inválido (pedido não realizado pelo cliente)

```java
finalizarPedido(2, 1);
```

Saída

```java
{
"erro": "Pedido não foi realizado por este cliente"
}
```

---

Entrada para consulta de mesas disponíveis

```java
consultarMesasDisponiveis();
```

Saída

```java
{
"mesas": [
{ "id": 1, "capacidade": 4, "ocupada": false },
{ "id": 3, "capacidade": 6, "ocupada": false },
{ "id": 5, "capacidade": 2, "ocupada": false }
]
}
```

---

Entrada para consulta de clientes cadastrados

```java
consultarClientes();
```

Saída

```java
{
"clientes": [
{ "id": 1, "nome": "Ana", "pedidosRealizados": 2 },
{ "id": 2, "nome": "Bruno", "pedidosRealizados": 0 },
{ "id": 3, "nome": "Carla", "pedidosRealizados": 1 },
{ "id": 4, "nome": "Diego", "pedidosRealizados": 3 },
{ "id": 5, "nome": "Elisa", "pedidosRealizados": 1 }
]
}
```
