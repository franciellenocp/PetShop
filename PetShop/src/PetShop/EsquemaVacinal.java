package PetShop;

import java.util.Date;

public class EsquemaVacinal {
    //Atributos
    protected Date data;
    protected Vacinas vacina;
    protected String observacao;

    //Construtor

    public EsquemaVacinal(Date data, Vacinas vacina, String observacao) {
        this.data = data;
        this.vacina = vacina;
        this.observacao = observacao;
    }
}
