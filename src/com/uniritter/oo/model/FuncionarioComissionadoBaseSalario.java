package com.uniritter.oo.model;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
    private Double salario = 0.0;

    public FuncionarioComissionadoBaseSalario() {
    }

    public FuncionarioComissionadoBaseSalario(String nome, String cpf, Integer horasTrabalhadas, Double taxaDeComissao, Double vendasBrutas, Double salario) {
        super(nome, cpf, horasTrabalhadas, taxaDeComissao, vendasBrutas);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void setVendasBrutas(Double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
        setTotalVendasBrutas(vendasBrutas);
    }

    @Override
    public Double getRendimentos() {
        setRendimentos(salario + super.getRendimentos());
        return rendimentos;
    }

    @Override
    public String toString() {
        return "\n"
                + "FuncionarioComissionadoBaseSalario " + "\n"
                + "Nome: " + nome + "\n"
                + "Cpf: " + cpf + "\n"
                + "Horas Trabalhadas: " + horasTrabalhadas + "\n"
                + "Taxa de Comissao: " + taxaDeComissao + "\n"
                + "Vendas Brutas: " + vendasBrutas + "\n"
                + "Salario: " + salario + "\n"
                + "Total de Rendimentos: " + getRendimentos() + "\n";
    }
}
