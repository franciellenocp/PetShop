package PetShop;

import java.math.BigDecimal;
import java.util.Date;

public class Funcionario {
    //Atributos
    private int id;
    private Cargo cargo;
    private BigDecimal salario;
    private Date admissao;
    private Date desligamento;

    //Constutor

    public Funcionario(int id, Cargo cargo, BigDecimal salario, Date admissao, Date desligamento) {
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
        this.admissao = admissao;
        this.desligamento = desligamento;
    }

    public Funcionario() {
    }

    //Metódos

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public Date getDesligamento() {
        return desligamento;
    }

    public void setDesligamento(Date desligamento) {
        this.desligamento = desligamento;
    }
}
