package model;

public class Perecivel extends Produto{

    private int diasParaVencer;

    public Perecivel(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        switch (diasParaVencer) {
            case 1:
                return (this.getPreco() * quantidadeDeProdutos) / 4;
            case 2:
                return (this.getPreco() * quantidadeDeProdutos) / 3;
            case 3:
                return (this.getPreco() * quantidadeDeProdutos) / 2;
            default:
                return this.getPreco() * quantidadeDeProdutos;
        }
    }

    @Override
    public String toString() {
        return "Perecivel{" +
                "nome=" + super.getNome() +
                "preco=" + super.getPreco() +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }
}
