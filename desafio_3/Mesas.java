package desafio_3;

public class Mesas {
    private int idMesa;
    private int capacidade;
    private boolean ocupada;

    public Mesas(int id, int capacidade, boolean ocupada) {
        this.idMesa = id;
        this.capacidade = capacidade;
        this.ocupada = ocupada;
    }

    public Mesas() {

    }

    public int getId() {
        return idMesa;
    }

    public void setId(int id) {
        this.idMesa = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "Mesas{" +
                "id=" + idMesa +
                ", capacidade=" + capacidade +
                ", ocupada=" + ocupada +
                '}';
    }
}
