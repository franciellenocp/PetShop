package PetShop;

import java.math.BigDecimal;

public class ResponseVSO {
    //Atributos
    private int id;
    private Servicos servicos;
    private BigDecimal valor;
    private Clientes clientes;

    //Construtor
    public ResponseVSO(int id, Servicos servicos, BigDecimal valor, Clientes clientes) {
        this.id = id;
        this.servicos = servicos;
        this.valor = valor;
        this.clientes = clientes;
    }
    //Metodos

}
