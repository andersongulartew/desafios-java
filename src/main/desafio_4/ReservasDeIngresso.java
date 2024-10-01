package src.main.desafio_4;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;

public class ReservasDeIngresso {

    private int idCliente;
    private int idFilmes;
    private int quantidaDeIngresso;
    private LocalDateTime dataReserva;


    public ReservasDeIngresso(int idCliente, int idFilmes,int quantidaDeIngresso, LocalDateTime dataReserva) {
        this.idCliente = idCliente;
        this.idFilmes = idFilmes;
        this.quantidaDeIngresso = quantidaDeIngresso;
        this.dataReserva = dataReserva;
    }
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdFilmes() {
        return idFilmes;
    }

    public void setIdFilmes(int idFilmes) {
        this.idFilmes = idFilmes;
    }

    public int getQuantidaDeIngresso() {
        return quantidaDeIngresso;
    }

    public void setQuantidaDeIngresso(int quantidaDeIngresso) {
        this.quantidaDeIngresso = quantidaDeIngresso;
    }

    public LocalDateTime getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDateTime dataReserva) {
        this.dataReserva = dataReserva;
    }
}