package src.main.desafio_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Cinema c = new Cinema();
        System.out.println(c.reservaIngressos(1, 2, 4));
        System.out.println("################################");
        System.out.println(c.consultarSalasDisponiveis());
        System.out.println("################################");
        System.out.println(c.consultaFilmes());
        System.out.println("################################");
        System.out.println(c.consultarSalasOcupadas());
        System.out.println("################################");
        System.out.println(c.cancelarReserva(2,3));
        System.out.println("################################");
        System.out.println(c.transferirIngresso(1, 2, 3, 2));
        System.out.println("################################");
        System.out.println(c.calcularValorReserva(1,3,4));

    }


}
