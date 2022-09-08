package mapa;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    private String NomeEvento;
    private String Data;
    private String ValorUnico;
    private String Capacidade;
    private List<Ingresso> ingressos;

    public Evento() {

    }

    public Evento(String NomeEvento, String Data, String Capacidade) {
        this.NomeEvento = NomeEvento;
        this.Data = Data;
        this.Capacidade = Capacidade;
        this.ingressos = new ArrayList<Ingresso>();

    }

    public String getNomeEvento() {
        return NomeEvento;
    }

    public void setNomeEvento(String NomeEvento) {
        this.NomeEvento = NomeEvento;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getValorUnico() {
        return ValorUnico;
    }

    public void setValorUnico(String ValorUnico) {
        this.ValorUnico = ValorUnico;
    }

    public String getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(String Capacidade) {
        this.Capacidade = Capacidade;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;

    }

    public void adiconarIngresso(Ingresso ingresso) {
        if (this.ingressos.size() < 3) {
            ingressos.add(ingresso);
            this.mostrarIngressos(ingresso);
            System.out.println(this.ingressos.size() + " - Ingresso adcionado a lista com Sucesso \n");
        } else {
            this.mostrarIngressos(ingresso);
            System.out.println("Cancelado!! limite de ingressos atingido \n");
        }

    }

    private void mostrarIngressos(Ingresso ingressoVenda) {
        String msg = "----------------------------------------------\n";

            msg += ingressoVenda.imprimirValor() +"\n";
            String nomeIngresso = ingressoVenda.getNome();
            msg += "Nome:" + " " + nomeIngresso + "\n";
            String cpfIngresso = ingressoVenda.getCpf();
            msg += "Cpf:" + " " + cpfIngresso + "\n";
            String nomeevento = ingressoVenda.getEvento();
            msg += "Nome do Evento:" + " " + nomeevento + "\n";
            msg += "data: " + this.Data + "\n";
            msg += "Capacidade: " + this.Capacidade + "\n";
            

            

        
        System.out.println(msg);

    }

    public void mostrarQuantidadeIngressosVendidos() {
        System.out.println("Quantidade de ingressos vendidos no evento " + this.getNomeEvento() + ": " + this.getIngressos().size());

    }

}
