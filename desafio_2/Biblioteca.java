package desafio_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca {

    private List<InformacaoLivros> livro;
    private List<InformacaoMembros> membro;
    private List<Emprestimo> emprest;


    public Biblioteca() {
        livro = new ArrayList<>();
        membro = new ArrayList<>();
        emprest = new ArrayList<>();
        livro.add(new InformacaoLivros(
                1, "O Senhor dos Anéis", "J.R.R. Tolkien",
                "Fantasia", true));
        livro.add(new InformacaoLivros(
                2, "1984", "George Orwell",
                "Distopia", false
        ));
        livro.add(new InformacaoLivros(
                3, "Dom Quixote", "Miguel de Cervantes",
                "Clássico", true
        ));
        livro.add(new InformacaoLivros(
                4, "O Pequeno Príncipe", "Antoine de Saint-Exupéry",
                "Infantil", true
        ));
        livro.add(new InformacaoLivros(
                5, "Harry Potter e a Pedra Filosofal", "J.K. Rowling",
                "Fantasia", false
        ));
        membro.add(new InformacaoMembros(1, "Alice", 1));
        membro.add(new InformacaoMembros(2, "Bob", 0));
        membro.add(new InformacaoMembros(3, "Carol", 2));
        membro.add(new InformacaoMembros(4, "Dave", 0));
        membro.add(new InformacaoMembros(5, "Eve", 1));
    }

    public List<InformacaoLivros> getInformacaoLivros() {
        return livro;
    }

    public List<InformacaoMembros> getInformacaoMembros() {
        return membro;
    }

    public InformacaoMembros encontrarMembroPorId(int idMembro) {
        for (int i = 0; i < membro.size(); i++) {
            if (membro.get(i).getId() == idMembro) {
                return membro.get(i);

            }
        }
        return null;
    }

    public InformacaoLivros encontrarLivroPorId(int idLivro) {
        for (int i = 0; i < livro.size(); i++) {
            if (livro.get(i).getId() == idLivro) {
                return livro.get(i);
            }
        }
        return null;
    }


    public String emprestarLivro(int idMembro, int idLivro) {

        InformacaoMembros membro = encontrarMembroPorId(idMembro);
        InformacaoLivros livro = encontrarLivroPorId(idLivro);
        if (membro == null) {
            return "Membro não encontrado";
        }
        if (livro == null) {
            return "Livro não encontrado";
        }
        if (!livro.getDisponivel()) {
            return "Livro não disponível";
        }
        if (membro.getLivrosEmprestados() >= 2) {
            return "Membro já possui 2 livros emprestados";
        }
        livro.setDisponivel(false);
        membro.setLivrosEmprestados(membro.getLivrosEmprestados() + 1);

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataFutura = LocalDate.now().plusDays(14);
        emprest.add(new Emprestimo(idMembro, idLivro, dataAtual, dataFutura));

        return "Empréstimo realizado com sucesso. Data de devolução : " + dataFutura;
    }

    public String devolverLivro(int idMembro, int idLivro) {
        InformacaoMembros membro = encontrarMembroPorId(idMembro);
        InformacaoLivros livro = encontrarLivroPorId(idLivro);
        if (membro == null) {
            return "Membro não encontrado";
        }
        if (livro == null) {
            return "Livro não encontrado";
        }
        for (int i = 0; i < emprest.size(); i++) {
            if (emprest.get(i).getIdLivro() == idLivro && emprest.get(i).getIdMembro() == idMembro) {
                emprest.remove(i);
                livro.setDisponivel(true);
                membro.setLivrosEmprestados(membro.getLivrosEmprestados() - 1);
                return "Devolução realizada com sucesso.Livro disponível para empréstimo";

            }
        }



        return "Livro nao foi emprestado por este membro";
    }

}
