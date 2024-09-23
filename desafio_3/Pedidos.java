package desafio_3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pedidos {
    private int idCliente;
    private  int idMesa;
    private LocalDate dataPedido;
    private LocalDateTime dataEntregaPrevista;

    public Pedidos(int idCliente, int idMesa, LocalDateTime dataPedido, LocalDateTime dataEntregaPrevista) {
        this.idMesa = idMesa;
        this.idCliente = idCliente;
        this.dataPedido = LocalDate.from(dataPedido);
        this.dataEntregaPrevista = dataEntregaPrevista;
    }
    public int getIdMesa() {
        return idMesa;
    }
    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getDataEntregaPrevista() {
        return dataEntregaPrevista;
    }

    public void setDataEntregaPrevista(LocalDateTime dataEntregaPrevista) {
        this.dataEntregaPrevista = dataEntregaPrevista;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "idCliente=" + idCliente +
                ", idMesa=" + idMesa +
                ", dataPedido=" + dataPedido +
                ", dataEntregaPrevista=" + dataEntregaPrevista +
                '}';
    }
}
