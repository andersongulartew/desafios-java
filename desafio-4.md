## Sistema de Gerenciamento de Cinema

**O DESAFIO** 

Você foi contratado para desenvolver um sistema de gerenciamento de cinema. Sua missão será construir a lógica para gerenciar salas, filmes e reservas de ingressos.

**SALAS EXISTENTES** 

O cinema possui as seguintes salas disponíveis.

**Tabela**

| ID | Capacidade | Ocupada |
| --- | --- | --- |
| 1 | 100 | Não |
| 2 | 50 | Sim |
| 3 | 200 | Não |
| 4 | 150 | Sim |
| 5 | 75 | Não |

**FILMES** 

O cinema possui os seguintes filmes em cartaz.

**Tabela**

| ID | Título | Gênero | Duração (min) |
| --- | --- | --- | --- |
| 1 | Vingadores: Ultimato | Ação | 181 |
| 2 | O Rei Leão | Animação | 118 |
| 3 | Coringa | Drama | 122 |
| 4 | Frozen II | Animação | 103 |
| 5 | Parasita | Suspense | 132 |

**REGRAS PARA RESERVAS**

*   Um cliente pode reservar no máximo 5 ingressos por filme.
*   Uma sala só pode ser reservada se houver capacidade disponível.
*   O sistema deve registrar a data e hora da reserva.
*   O sistema deve permitir o cancelamento de reservas, atualizando a disponibilidade da sala.
*   Um cliente pode cancelar uma reserva até 1 hora antes do horário do filme.
*   O sistema deve permitir a transferência de ingressos entre clientes, desde que o número de ingressos não exceda o limite permitido.
*   O sistema deve calcular o valor total da reserva com base no preço do ingresso e no número de ingressos reservados.

**ENTRADAS E SAÍDAS**

*   O programa deve receber o ID do cliente, o ID do filme e o número de ingressos para realizar uma reserva.
*   O programa deve retornar uma mensagem de sucesso ou erro, dependendo das regras de reservas.
*   O programa deve permitir a consulta de salas disponíveis e filmes em cartaz.

**EXEMPLOS**

Entrada para um caso válido

```java
reservarIngressos(1, 3, 4);
```

Saída

```java
{
    mensagem: "Reserva realizada com sucesso. Data e hora: 17/09/2024 10:42"
}
```

---

Entrada para um caso inválido

```java
reservarIngressos(2, 2, 6);
```

Saída 

```java

{
    erro: "Número de ingressos excede o limite permitido"
}
```

---

Entrada para consulta de salas disponíveis

```java
consultarSalasDisponiveis();
```

Saída

```java
{
    salas: [
        {
            id: 1,
            capacidade: 100,
            ocupada: false
        },
        {
            id: 3,
            capacidade: 200,
            ocupada: false
        },
        {
            id: 5,
            capacidade: 75,
            ocupada: false
        }
    ]
}
```

---

Entrada para cancelar uma reserva válida

```java
cancelarReserva(1, 3);
```

Saída

```plaintext
{
  "mensagem": "Reserva cancelada com sucesso."
}
```

---

Entrada para cancelar uma reserva inválida (menos de 1 hora para o filme)

```java
cancelarReserva(2, 2);
```

Saída

```plaintext
{
  "erro": "Não é possível cancelar a reserva com menos de 1 hora para o filme."
}
```

---

Entrada para transferir ingressos válida

```java
transferirIngressos(1, 2, 3, 2);
```

Saída

```plaintext
{
  "mensagem": "Ingressos transferidos com sucesso."
}
```

---

Entrada para transferir ingressos inválida (excede o limite permitido)

```java
transferirIngressos(1, 2, 3, 6);
```

Saída

```plaintext
{
  "erro": "Número de ingressos excede o limite permitido."
}
```

---

Entrada para calcular o valor total da reserva

```java
calcularValorReserva(1, 3, 4);
```

Saída

```plaintext
{
  "valorTotal": 80.00
}
```
