package br.edu.ifsul.control;


import br.edu.ifsul.model.Carro;
import br.edu.ifsul.model.Endereco;
import br.edu.ifsul.model.Pessoa;

public class Main {
    public static void main(String[] args) { // Inicializa a aplicação

        Pessoa pessoa1 = new Pessoa("Nunes", 12, "032.564.123-56");
        System.out.println(pessoa1);
        Pessoa pessoa = new Pessoa(); // Estancia o obj
        pessoa.setIdade(26); //usando o setter tem que setar assim
        pessoa.setCpf("032.564.123-56");
        pessoa.setNome("Joezer");
        //pessoa.cpf="032.564.123-56"; //usando o metodo public pode setar assim
        //pessoa.idade=26;
        //pessoa.nome="Joezer";
        // Printo o obj, porém sem conteúdo
        System.out.println(pessoa);


        Carro carro = new Carro();
        carro.numserie = 123;
        carro.ano = 1990;
        carro.marca = "umaai";
        carro.modelo = "umai";
        carro.cor = "azul";
        System.out.println(carro);


        Endereco endereco = new Endereco();
        endereco.numero = 999;
        endereco.cep = 96012020;
        endereco.rua = "Rua sla";
        System.out.println(endereco);
    }
}
