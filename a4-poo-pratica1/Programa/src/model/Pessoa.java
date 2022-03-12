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

    public void validatePerson() {
        String maiorIdadeString = "não é maior de idade.";
        if (this.ehMaiorIdade()) maiorIdadeString = "é maior de idade.";

        int imc = this.calcularIMC();
        String imcString = "";

        switch (imc) {
            case -1:
                imcString = "está abaixo do peso";
                break;
            case 0:
                imcString = "está saudável";
                break;
            case 1:
                imcString = "está acima do peso";
                break;
        }

        System.out.println(this.getNome() + " " + imcString + " e " + maiorIdadeString);
    }

    public boolean ehMaiorIdade() {
        return this.idade >= 18;
    }

    public int calcularIMC() {
        double imc = this.peso / (this.altura * this.altura);
        if (imc < 20) return -1;
        if (imc >= 20 && imc <= 25) return 0;
        return 1;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", id='" + id + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
