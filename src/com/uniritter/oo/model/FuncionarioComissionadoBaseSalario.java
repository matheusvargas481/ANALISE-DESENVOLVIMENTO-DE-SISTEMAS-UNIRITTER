package com.uniritter.oo.model;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
    private double salario;

    public FuncionarioComissionadoBaseSalario() {
    }

    public FuncionarioComissionadoBaseSalario(String nome, String cpf, double vendasBrutas, double taxaDeComissao, double salario) {
        super(nome, cpf, vendasBrutas, taxaDeComissao);
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
