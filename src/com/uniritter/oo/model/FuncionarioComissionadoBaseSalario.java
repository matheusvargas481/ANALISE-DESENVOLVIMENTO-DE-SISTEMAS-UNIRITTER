package com.uniritter.oo.model;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
    private Double salario = 0.0;

    public FuncionarioComissionadoBaseSalario() {
    }

    public FuncionarioComissionadoBaseSalario(String nome, String cpf) {
        super(nome, cpf);
        this.salario = getSalario();
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public double getRendimentos() {
        return salario+super.getRendimentos();
    }

    @Override
    public String toString() {
        return "\n"
                +"FuncionarioComissionadoBaseSalario " +"\n"
                + "Nome: " + nome +"\n"
                + "Cpf: " + cpf +"\n"
                + "Salario: " + salario +"\n"
                + "Total de Rendimentos: " + getRendimentos()+"\n";
    }
}
