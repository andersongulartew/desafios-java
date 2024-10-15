package src.main.desafio_3;


public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        System.out.println(restaurante.realizarPedido(3,3));
        System.out.println(restaurante.finalizarPedido(3,3));
        System.out.println(restaurante.getMesasDisponiveis());
        System.out.println(restaurante.getConsultarClientes());

    }
}
