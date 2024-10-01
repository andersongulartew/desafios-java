package src.main.desafio_4;

public class SalasExistentes {

    private int id;
    private int capacidade;
    private boolean ocupada;

    public SalasExistentes(int id,int capacidade,boolean ocupada ) {
        this.id = id;
        this.capacidade = capacidade;
        this.ocupada = ocupada;
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
        return "SalasExistentes{" +
                "id=" + id +
                ", capacidade=" + capacidade +
                ", ocupada=" + ocupada +
                '}';
    }


}
