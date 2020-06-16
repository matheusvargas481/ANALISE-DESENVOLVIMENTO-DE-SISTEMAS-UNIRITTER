package com.uniritter.oo.model;

public class FuncionarioAssalariado extends Funcionario {
    private Double salario = 0.0;

    public FuncionarioAssalariado() {
    }

    public FuncionarioAssalariado(String nome, String cpf, Integer horasTrabalhadas, Double salario) {
        super(nome, cpf, horasTrabalhadas);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public Double getRendimentos() {
    	setRendimentos(salario);
        return rendimentos;
    }

    @Override
    public String toString() {
        return "\n"
                +"FuncionarioAssalariado "  +"\n"
                + "Nome: " + nome +"\n"
                + "Cpf: " + cpf +"\n"
                + "Salario: " + salario +"\n"
                + "Rendimentos: " + getRendimentos()+"\n";
    }
}
