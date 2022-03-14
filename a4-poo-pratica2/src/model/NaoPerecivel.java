package model;

public class NaoPerecivel extends Produto{
    private String tipo;

    public NaoPerecivel(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NaoPereciveis{" +
                "nome='" + super.getNome() + '\'' +
                "preco='" + super.getPreco() + '\'' +
                "tipo='" + tipo + '\'' +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
