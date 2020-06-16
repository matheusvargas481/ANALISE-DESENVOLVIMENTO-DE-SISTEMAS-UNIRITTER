package com.uniritter.oo.model;

public class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadas = 0;
    private Double valorPorHora = 0.0;

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(String nome, String cpf) {
        super(nome, cpf);
        this.horasTrabalhadas = getHorasTrabalhadas();
        this.valorPorHora = getValorPorHora();
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double getRendimentos(){
        return validaRendimento();
    }

    private double validaRendimento(){
        double rendimentoTotal = 0;
        if(horasTrabalhadas  < 40){
            rendimentoTotal = valorPorHora * horasTrabalhadas;
        }else if (horasTrabalhadas > 40){
           rendimentoTotal =  40 * valorPorHora + (horasTrabalhadas - 40) * valorPorHora * 1.5;
        }
        return rendimentoTotal;
    }

    @Override
    public String toString() {
        return "\n"
                +"FuncionarioHorista " +"\n"
                + "Nome: " + nome +"\n"
                + "Cpf: " + cpf +"\n"
                + "Horas Trabalhadas: " + horasTrabalhadas +"\n"
                + "Valor Por Hora: " + valorPorHora +"\n"
                + "Total de Rendimentos: " + getRendimentos()+"\n";
    }
}
