package desafio_3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private List<Mesas> mesa;
    private List<Clientes> cliente;
    private List<Pedidos> pedido;

    public Restaurante() {
        mesa = new ArrayList<>();
        cliente = new ArrayList<>();
        pedido = new ArrayList<>();
        mesa.add(new Mesas(1, 4, false));
        mesa.add(new Mesas(2, 2, true));
        mesa.add(new Mesas(3, 6, false));
        mesa.add(new Mesas(4, 4, true));
        mesa.add(new Mesas(5, 2, false));

        cliente.add(new Clientes(1, "Ana", 2));
        cliente.add(new Clientes(2, "Bruno", 0));
        cliente.add(new Clientes(3, "Carla", 1));
        cliente.add(new Clientes(4, "Diego", 3));
        cliente.add(new Clientes(5, "Elisa", 1));

    }

    public List<Clientes> getConsultarClientes() {
        List<Clientes> clientes = new ArrayList<>();
        for (int i = 0; i < cliente.size(); i++) {
            clientes.add(cliente.get(i));
        }

        return clientes;
    }

    public List<Mesas> getMesasDisponiveis() {
        List<Mesas> mesasDisponiveis = new ArrayList<>();
        for (int i = 0; i < mesa.size(); i++) {
            if (!mesa.get(i).isOcupada()) {
                mesasDisponiveis.add(mesa.get(i));
            }
        }
        return mesasDisponiveis;

    }


    public Mesas encontrarMesaPorId(int idMesa) {
        for (int i = 0; i < mesa.size(); i++) {
            if (mesa.get(i).getId() == idMesa) {
                return mesa.get(i);
            }
        }
        return null;
    }

    public Clientes encontrarClientePorId(int idCliente) {
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getId() == idCliente) {
                return cliente.get(i);

            }
        }
        return null;
    }


    public String realizarPedido(int idCliente, int idMesa) {
        Mesas mesa = encontrarMesaPorId(idMesa);
        Clientes cliente = encontrarClientePorId(idCliente);
        if (mesa == null) {
            return "Mesa não encontrado";
        }
        if (cliente == null) {
            return "Cliente não encontrado";
        }
        if (mesa.isOcupada()) {
            return "Mesa Ocupada";
        }
        if (cliente.getPedidoRealizados() >= 3) {
            return "Cliente ja possui 3 pedidos realizados";
        }
        mesa.setOcupada(false);
        cliente.setPedidoRealizados(cliente.getPedidoRealizados() + 1);


        LocalDateTime dataAtual = LocalDateTime.now();
        LocalDateTime horarioDeEntregaMesa = dataAtual.plusMinutes(30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        pedido.add(new Pedidos(idCliente, idMesa, dataAtual, horarioDeEntregaMesa));
        return "Pedido realizado com sucesso. Data de entrega: " + horarioDeEntregaMesa.format(formatter);
    }

    public String finalizarPedido(int idCliente, int idMesa) {
        Mesas mesa = encontrarMesaPorId(idMesa);
        Clientes cliente = encontrarClientePorId(idCliente);

        if (mesa == null) {
            return "Mesa não encontrado";
        }
        if (cliente == null) {
            return "Cliente não encontrado";
        }
        for (int i = 0; i < pedido.size(); i++) {
            if (pedido.get(i).getIdCliente() == idCliente && pedido.get(i).getIdMesa() == idMesa) {

                mesa.setOcupada(false);
                cliente.setPedidoRealizados(cliente.getPedidoRealizados() + 1);
                return "Pedido finalizado com sucesso. Mesa disponível para novos clientes";
            }
        }
        return "Pedido não foi realizado por este cliente";

    }


//    public boolean consultarMesaDisponivel() {
//        for (int i = 0; i < mesa.size(); i++) {
//            boolean mesas = !mesa.get(i).isOcupada();
//            return mesas;
//
//        }
//        return false;
//    }
//
//    public String consultaCliente(int idCliente) {
//        Clientes cliente = encontrarClientePorId(idCliente);
//        if (cliente == null) {
//            return "Cliente não encontrado";
//        }
//        return cliente.toString();
//    }

}
