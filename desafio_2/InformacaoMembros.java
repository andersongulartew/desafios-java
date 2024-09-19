package desafio_2;

public class InformacaoMembros {

        private int id;
    private String nome;

    private int livrosEmprestados;



    public InformacaoMembros(int id, String nome, int livrosEmprestados) {
        this.id = id;
        this.nome = nome;
        this.livrosEmprestados = livrosEmprestados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(int livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "InformacaoMembros{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", LivrosEmeprestados='" + livrosEmprestados + '\'' +
                '}';
    }
}
