package desafio_3;

public class Clientes {

    private int id;
    private String nome;
    private int pedidosRealizados;

    public Clientes(int id, String nome, int pedidosRealizados) {
        this.id = id;
        this.nome = nome;
        this.pedidosRealizados = pedidosRealizados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPedidoRealizados() {
        return pedidosRealizados;
    }

    public void setPedidoRealizados(int pedidoRealizados) {
        this.pedidosRealizados = pedidoRealizados;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pedidoRealizados=" + pedidosRealizados +
                '}';
    }
}
