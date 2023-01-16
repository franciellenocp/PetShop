package PetShop;
import java.util.List;

public class Clientes {
    //Atributos
    private int id;
    private List <Animais> pet;

    //Construtor

    public Clientes(int id, List<Animais> pet) {
        this.id = id;
        this.pet = pet;
    }
    public Clientes(){}

    //Metódos
}
