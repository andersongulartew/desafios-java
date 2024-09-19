package desafio_2;

import java.time.LocalDate;


public class Emprestimo {

    private int idMembro;
    private int idLivro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(int idMembro, int idLivro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.idMembro = idMembro;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public int getIdMembro() {
        return idMembro;
    }

    public void setIdMembro(int idMembro) {
        this.idMembro = idMembro;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "idMembro=" + idMembro +
                ", idLivro=" + idLivro +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}
