package com.uniritter.oo.model;

public class FuncionarioAssalariado extends Funcionario {
    private Double salario = 0.0;

    public FuncionarioAssalariado() {
    }

    public FuncionarioAssalariado(String nome, String cpf) {
        super(nome, cpf);
        this.salario = getSalario();
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double getRendimentos() {
        return salario;
    }

    @Override
    public String toString() {
        return "\n"
                +"FuncionarioAssalariado "  +"\n"
                + "Nome: " + nome +"\n"
                + "Cpf: " + cpf +"\n"
                + "Salario: " + salario +"\n";
    }
}
