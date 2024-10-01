package src.main.desafio_4;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Filmes {

    private int id;
    private String titulo;
    private String genero;
    private int duracaoMinutos;


    public Filmes(int id, String titulo, String genero, int duracaoMinutos) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracaoMinutos +
                '}';
    }


}
