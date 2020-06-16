package com.uniritter.oo.model;

public class FuncionarioAssalariado extends Funcionario {
    private Double salario = 0.0;

    public FuncionarioAssalariado() {
    }

    public FuncionarioAssalariado(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
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
