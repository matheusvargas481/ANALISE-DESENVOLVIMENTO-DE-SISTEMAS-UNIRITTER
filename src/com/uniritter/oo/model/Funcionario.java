package com.uniritter.oo.model;

public class Funcionario {
    public String nome;
    public String cpf;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "\n"
                +"Funcionario " + "\n"
                +"Nome: " + nome + "\n" +
                "Cpf: " + cpf + "\n";
    }
}
