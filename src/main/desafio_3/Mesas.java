package src.main.desafio_3;

public class Mesas {
    private int id;
    private int capacidade;
    private boolean ocupada;

    public Mesas(int id, int capacidade, boolean ocupada) {
        this.id = id;
        this.capacidade = capacidade;
        this.ocupada = ocupada;
    }

    public Mesas() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", capacidade=" + capacidade +
                ", ocupada=" + ocupada +
                '}';
    }
}
