package PetShop;

public class Pessoa {
    //Atributos
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;
    private String telefone;

    //Construtor
    public Pessoa(String nome, String cpf, String email, Endereco endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public Pessoa (){}

    //Metodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
