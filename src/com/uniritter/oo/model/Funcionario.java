package com.uniritter.oo.model;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected Double rendimentos;
    protected Integer horasTrabalhadas;

    public String getCpf() {
		return cpf;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Funcionario() {
    }

    public Funcionario(String nome, String cpf, Integer horasTrabalhadas) {
        this.nome = nome;
        this.cpf = cpf;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(Double rendimentos) {
		this.rendimentos = rendimentos;
	}

	@Override
    public String toString() {
        return "\n"
                +"Funcionario " + "\n"
                +"Nome: " + nome + "\n" +
                "Cpf: " + cpf + "\n";
    }
}
