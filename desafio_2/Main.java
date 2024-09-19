package desafio_2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();




        System.out.println(biblioteca.emprestarLivro(1,1));
        System.out.println(biblioteca.devolverLivro(1,2));
        System.out.println(biblioteca.getInformacaoLivros());
        System.out.println(biblioteca.getInformacaoMembros());

    }


}