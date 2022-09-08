package mapa;

public class MAPA {

    public static void main(String[] args) {

        Ingresso ingresso1 = new Ingresso("Luis", "123.234.234-11", "Rodeio 2022", "Pista");

        Ingresso ingresso2 = new Ingresso("alexandre", "422.567.345-52", "Rodeio 2022", "VIP");

        Ingresso ingresso3 = new Ingresso("Matheus", "234.324.234-12", "Rodeio 2022", "Camarote");

        Ingresso ingresso4 = new Ingresso("joaquim", "424.424.224-12", "Rodeio 2022", "Camarote");

        Evento evento = new Evento("Rodeio 2022", "10/10/2022", "3 pessoas");
        evento.adiconarIngresso(ingresso1);
        evento.adiconarIngresso(ingresso2);
        evento.adiconarIngresso(ingresso3);
        evento.adiconarIngresso(ingresso4);

        evento.mostrarQuantidadeIngressosVendidos();

    }

}
