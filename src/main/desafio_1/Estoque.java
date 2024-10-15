package src.main.desafio_1;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    List<Produtos> produto = new ArrayList<Produtos>(List.of(
            new Produtos(1, "camiseta", 50, 29.99),
            new Produtos(2, "calça jeans", 30, 79.99),
            new Produtos(3, "tenis", 20, 99.99),
            new Produtos(4, "jaqueta", 15, 149.99),
            new Produtos(5, "bone", 40, 19.99)
    ));

    public List<Produtos> consultaProdutos(){
        return produto;
    }

    public String entradaEstoque(int id, int quantidade) {
        for (int i = 0; i < produto.size(); i++) {
            if (produto.get(i).getId() == id) {
                quantidade += produto.get(i).getQuantidade();
                return "Entrada de estoque realizada com sucesso! Quantidade atual: " + quantidade;
            }
        }
        return "Produto nao encontrado";
    }

    public String saidaEstoque(int id, int quantidade) {
        for (int i = 0; i < produto.size(); i++) {
            if (produto.get(i).getId() == id) {
                if (quantidade > produto.get(i).getQuantidade()) {
                    return "Quantidade insuficiente em estoque";
                } else {
                    quantidade -=  produto.get(i).getQuantidade();
                    return ("Saida de estoque com sucesso!Quantidade atual: " + quantidade);
                }

            }
        }
        return "Produto nao encontrado";
    }

    public String calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (int i = 0; i < produto.size(); i++) {
            int quantidade = produto.get(i).getQuantidade();
            double preco = produto.get(i).getPreco();
            valorTotal += quantidade * preco;
        }
        return "Valor total: " + valorTotal;
    }

}
