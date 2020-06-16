package com.uniritter.oo.model;

public class FuncionarioAssalariado extends Funcionario {
    private double salario;

    public FuncionarioAssalariado() {
    }

    public FuncionarioAssalariado(double salario) {
        this.salario = salario;
    }

    public FuncionarioAssalariado(String nome, String cpf, double salario) {
        super(nome, cpf);
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
