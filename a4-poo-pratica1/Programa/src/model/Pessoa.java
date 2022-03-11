package model;

public class Pessoa {



    private String nome;
    private int idade;
    private String id;
    private double peso;
    private double altura;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }


}
