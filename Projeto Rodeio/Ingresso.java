package mapa;

public class Ingresso {

    private String nome;
    private String cpf;
    private String evento;
    private String categoria;
    private double valor;

    public double getValor() {
        return valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Ingresso() {
        System.out.println();
    }

    public Ingresso(String nome, String cpf, String evento, String categoria) {
        this.nome = nome;
        this.cpf = cpf;
        this.evento = evento;
        this.categoria = categoria;
        this.valor = calcularValor(categoria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public void imprimirnome() {
        System.out.println("nome: " + nome);

    }
    
    public String imprimirValor(){
        return "Categoria: " + this.categoria+ " | Valor: " + this.valor;
        
    }

    private double calcularValor(String ingresso) {
        final double valorIngresso = 100;
        switch (ingresso) {
            case "Pista" -> {
                return valorIngresso;
            }
            case "VIP" -> {
                return valorIngresso * 1.3;
            }
            case "Camarote" -> {
                return valorIngresso * 1.6;
            }
        }
        return valorIngresso;
    }

}
