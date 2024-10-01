package src.main.desafio_4;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<SalasExistentes> sala;
    private List<Filmes> filme;
    private List<ReservasDeIngresso> reserva;

    private List<Cliente> cliente;


    public Cinema() {
        sala = new ArrayList<>();
        filme = new ArrayList<>();
        cliente = new ArrayList<>();
        reserva = new ArrayList<>();
        sala.add(new SalasExistentes(1, 100, false));
        sala.add(new SalasExistentes(2, 50, true));
        sala.add(new SalasExistentes(3, 200, false));
        sala.add(new SalasExistentes(4, 150, true));
        sala.add(new SalasExistentes(5, 75, false));

        filme.add(new Filmes(1, "Vingadore:Ultimato", "Ação", 181));
        filme.add(new Filmes(2, "O Rei Leão", "Animação", 118));
        filme.add(new Filmes(3, "Coringa", "Drama", 122));
        filme.add(new Filmes(4, "Frozen II", "Animação", 103));
        filme.add(new Filmes(5, "Parasita", "Suspense", 132));

        cliente.add(new Cliente(1, "John Doe"));
        cliente.add(new Cliente(2, "Jane Smith"));
        cliente.add(new Cliente(3, "Alice Johnson"));
        cliente.add(new Cliente(4, "Bob Williams"));
        cliente.add(new Cliente(5, "Emily Davis"));


    }

    public List<Cliente> consultarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        for (int i = 0; i < cliente.size(); i++) {
            clientes.add(cliente.get(i));
        }
        return clientes;
    }

//    public List<ReservasDeIngresso> getConsultarIngresso() {
//        List<ReservasDeIngresso> ingresso = new ArrayList<>();
//        for (int i = 0; i < ingressos.size(); i++) {
//            ingresso.add(ingresso.get(i));
//        }
//        return ingresso;
//    }

    public List<Filmes> consultaFilmes() {
        List<Filmes> filmes = new ArrayList<>();
        for (int i = 0; i < filme.size(); i++) {
            filmes.add(filme.get(i));

        }
        return filmes;
    }

    public List<SalasExistentes> consultarSalasDisponiveis() {
        List<SalasExistentes> salasDiponiveis = new ArrayList<>();
        for (int i = 0; i < sala.size(); i++) {
            if (!sala.get(i).isOcupada()) {
                salasDiponiveis.add(sala.get(i));
            }
        }
        return salasDiponiveis;
    }

    public List<SalasExistentes> consultarSalasOcupadas() {
        List<SalasExistentes> consultaSalaOcupada = new ArrayList<>();
        for (int i = 0; i < sala.size(); i++) {
            if (sala.get(i).isOcupada()) {
                consultaSalaOcupada.add(sala.get(i));
            }
        }
        return consultaSalaOcupada;
    }


    public Cliente encontrarClientePorId(int idCliente) {
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getId() == idCliente) {
                return cliente.get(i);
            }
        }
        return null;
    }

    public Filmes encontrarFilmePorId(int idFilmes) {
        for (int i = 0; i < filme.size(); i++) {
            if (filme.get(i).getId() == idFilmes) {
                return filme.get(i);
            }
        }
        return null;
    }


    public String reservaIngressos(int idCliente, int idFilme, int numeroIngresso) {
        Cliente cliente = encontrarClientePorId(idCliente);
        Filmes filme = encontrarFilmePorId(idFilme);
        if (cliente == null) {
            return "Cliente não encontrado.";
        }
        if (filme == null) {
            return "Filme não encontrado.";
        }
        if (numeroIngresso > 5) {
            return "Número de ingresso excede o limite permitido";
        }
        SalasExistentes salaDisponivel = null;
        for (int i = 0; i < sala.size(); i++) {
            if (!sala.get(i).isOcupada() && sala.get(i).getCapacidade() >= numeroIngresso) {
                salaDisponivel = sala.get(i);
                break;
            }
        }
        if (salaDisponivel == null) {
            return "Não há salas disponíveis para a quantidade de ingressos desejada.";
        }
        salaDisponivel.setOcupada(true);
        salaDisponivel.setCapacidade(salaDisponivel.getCapacidade() - numeroIngresso);
        reserva.add(new ReservasDeIngresso(idCliente, idFilme, numeroIngresso, LocalDateTime.now()));
        return "Reserva realizada com sucesso. Data e hora:  " + LocalDateTime.now();
    }

    public String cancelarReserva(int idCliente, int idFilme) {
        Cliente cliente = encontrarClientePorId(idCliente);
        Filmes filme = encontrarFilmePorId(idFilme);
        ReservasDeIngresso reservasDeIngresso = null;
        if (cliente == null) {
            return "Cliente não encontrado.";
        }
        if (filme == null) {
            return "Filme não encontrado.";
        }
        for (int i = 0; i < reserva.size(); i++) {
            if (reserva.get(i).getIdCliente() == idCliente && reserva.get(i).getIdFilmes() == idFilme) {
                reservasDeIngresso = reserva.get(i);
            }
        }
        if (reservasDeIngresso == null) {
            return "Reserva não encontrada.";
        }
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime horarioLimiteCancelamento = reservasDeIngresso.getDataReserva().minusMinutes(60);
        if (!agora.isBefore(horarioLimiteCancelamento)) {
            return "Não é possível cancelar a reserva com menos de 1 hora para o filme.";
        }
        reserva.remove(reservasDeIngresso);
        for (int i = 0; i < sala.size(); i++) {
            if (sala.get(i).isOcupada()) {
                sala.get(i).setOcupada(false);
            }
        }
        return "Reserva cancelada com sucesso";
    }

    public String transferirIngresso(int idClienteOrigem, int idClienteDestino, int idFilme, int numeroIngresso) {
        Cliente clienteOrigem = encontrarClientePorId(idClienteOrigem);
        Cliente clienteDestino = encontrarClientePorId(idClienteDestino);
        Filmes filme = encontrarFilmePorId(idFilme);
        if (clienteOrigem == null) {
            return "Cliente de origem não encontrado.";
        }
        if (clienteDestino == null) {
            return "Cliente de destino não encontrado.";
        }
        if (filme == null) {
            return "Filme não encontrado.";
        }
        if (numeroIngresso > 5) {
            return "Número de ingresso excede o limite permitido";
        }
        ReservasDeIngresso reservasOrigem = null;
        for (int i = 0; i < reserva.size(); i++) {
            if (reserva.get(i).getIdCliente() == idClienteOrigem && reserva.get(i).getIdFilmes() == idFilme) {
                reservasOrigem = reserva.get(i);
                break;
            }
        }
        if (reservasOrigem == null) {
            return "Reserva não encontrada";
        }
        if (reservasOrigem.getQuantidaDeIngresso() < numeroIngresso) {
            return "Número de ingresso insuficiente";
        }
        reservasOrigem.setQuantidaDeIngresso(reservasOrigem.getQuantidaDeIngresso() - numeroIngresso);
        reserva.add(new ReservasDeIngresso(idClienteDestino, idFilme, numeroIngresso, LocalDateTime.now()));
        return "Ingressos transferidos com sucesso";

    }

    public String calcularValorReserva(int clienteId, int filmeId, int numeroIngresso) {
        double precoIngresso = 20.00;
        double total = precoIngresso * numeroIngresso;
        return "ValorTotal : " + total;

    }


}









