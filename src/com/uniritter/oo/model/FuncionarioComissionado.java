package com.uniritter.oo.model;

public class FuncionarioComissionado extends Funcionario {
    private double vendasBrutas;
    private double taxaDeComissao;

    public FuncionarioComissionado() {
    }

    public FuncionarioComissionado(String nome, String cpf, double vendasBrutas, double taxaDeComissao) {
        super(nome, cpf);
        this.vendasBrutas = vendasBrutas;
        this.taxaDeComissao = taxaDeComissao;
    }

    public double getRendimentos(){
        return vendasBrutas * taxaDeComissao;
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
