package br.edu.ifsul.model;

public class Carro {
    // Atributo
    public int numserie;
    public int ano;
    public String marca;
    public String modelo;
    public String cor;

    //Metodos

    @Override
    public String toString() {
        return "Carro{" +
                "numserie='" + numserie + '\'' +
                ", ano=" + ano + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}