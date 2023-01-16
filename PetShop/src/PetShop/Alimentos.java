package PetShop;

import java.math.BigDecimal;

public class Alimentos {
    private int id;
    private String nome;
    private BigDecimal preco;

    //Construtores
    public Alimentos(int id, String nome, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public Alimentos(){}

    //Metódos

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
