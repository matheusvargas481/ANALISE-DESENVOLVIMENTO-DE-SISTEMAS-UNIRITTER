package com.uniritter.oo.model;

public class FuncionarioComissionado extends Funcionario {
    private Double vendasBrutas = 0.0;
    private Double taxaDeComissao = 0.0;

    public FuncionarioComissionado() {
    }

    public FuncionarioComissionado(String nome, String cpf, Integer horasTrabalhadas, Double taxaDeComissao ) {
        super(nome, cpf, horasTrabalhadas);     
        this.taxaDeComissao = taxaDeComissao;
    }

    public Double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(Double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
    }

    public Double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(Double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    @Override
    public Double getRendimentos(){ 
    	setRendimentos(vendasBrutas * taxaDeComissao);
    	return rendimentos; 
    }

    @Override
    public String toString() {
        return "\n"
                +"FuncionarioComissionado " +"\n"
                + "Nome: " + nome +"\n"
                + "Cpf: " + cpf +"\n"
                + "Vendas Brutas: " + vendasBrutas +"\n"
                + "Taxa De Comissao: " + taxaDeComissao +"\n"
                + "Total de Rendimentos: " + getRendimentos()+"\n";
    }
}
