package br.edu.ifsul.model;

public class Endereco {
    // Atributos
    public int numero;
    public String rua;
    public int cep;

    // Metodos

    @Override
    public String toString() {
        return "Endereco{" +
                "rua=" + rua + '\'' +
                ", cep=" + cep + '\'' +
                ", numero=" + numero + '\'' +
                '}';
    }
}