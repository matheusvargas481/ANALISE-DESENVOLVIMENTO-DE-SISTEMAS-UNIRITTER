package com.uniritter.oo.model;

public class FuncionarioHorista extends Funcionario {

    private int horasTrabalhadas = 0;
    private Double valorPorHora = 0.0;

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(String nome, String cpf, Double valorPorHora, int horasTrabalhadas) {
        super(nome, cpf);
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public Double getRendimentos() {
        return validaRendimento();
    }

    private double validaRendimento() {
        if (horasTrabalhadas <= 40) {
            setRendimentos(valorPorHora * horasTrabalhadas);
        } else if (horasTrabalhadas > 40) {
            setRendimentos(40 * valorPorHora + ((horasTrabalhadas - 40) * valorPorHora * 1.5));
        }
        return rendimentos;
    }

    @Override
    public String toString() {
        return "\n"
                + "FuncionarioHorista " + "\n"
                + "Nome: " + nome + "\n"
                + "Cpf: " + cpf + "\n"
                + "Horas Trabalhadas: " + horasTrabalhadas + "\n"
                + "Valor Por Hora: " + valorPorHora + "\n"
                + "Total de Rendimentos: " + getRendimentos() + "\n";
    }
}
