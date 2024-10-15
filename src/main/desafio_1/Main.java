package src.main.desafio_1;


public class Main {
    public static void main(String[] args) {


    Estoque estoque = new Estoque();
        System.out.println(estoque.entradaEstoque(5, 10));
        System.out.println(estoque.entradaEstoque(6, 10));
        System.out.println(estoque.saidaEstoque(1, 51));
        System.out.println(estoque.saidaEstoque(1, 30));
        System.out.println(estoque.calcularValorTotalEstoque());

        System.out.println(estoque.consultaProdutos());




    }
}
