package com.uniritter.oo.model;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
    private Double salario = 0.0;

    public FuncionarioComissionadoBaseSalario() {
    }

    public FuncionarioComissionadoBaseSalario(String nome, String cpf, Integer horasTrabalhadas, Double salario, Double taxaDeComissao) {
        super(nome, cpf, horasTrabalhadas, taxaDeComissao);
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
                +"FuncionarioComissionadoBaseSalario " +"\n"
                + "Nome: " + nome +"\n"
                + "Cpf: " + cpf +"\n"
                + "Salario: " + salario +"\n"
                + "Total de Rendimentos: " + getRendimentos()+"\n";
    }
}
