package com.uniritter.oo.service;

import com.uniritter.oo.model.*;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private FuncionarioAssalariado funcionarioAssalariado;
    private FuncionarioComissionado funcionarioComissionado;
    private FuncionarioComissionadoBaseSalario funcionarioComissionadoBaseSalario;
    private FuncionarioHorista funcionarioHorista;

    public FuncionarioService() {
        this.funcionarioAssalariado = new FuncionarioAssalariado();
        this.funcionarioComissionado = new FuncionarioComissionado();
        this.funcionarioComissionadoBaseSalario = new FuncionarioComissionadoBaseSalario();
        this.funcionarioHorista = new FuncionarioHorista();
    }

    public void cadastrarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public List<Funcionario> listarTodosFuncionarios(){
        return funcionarios;
    }

    public double calcularRendimentoDoFuncionarioAssalariado(){
        return funcionarioAssalariado.getRendimentos(); 
        }

    public double calcularRendimentoDoFuncionarioComissionado(double vendasBrutas){
    	funcionarioComissionado.setVendasBrutas(vendasBrutas);
        return funcionarioComissionado.getRendimentos();
    }

    public double calcularRendimentoDoFuncionarioComissionadoBaseSalario(){
        return funcionarioComissionadoBaseSalario.getRendimentos();
    }

    public double calcularRendimentoDoFuncionarioHorista(int horasTrabalhadas){
        funcionarioHorista.setHorasTrabalhadas(horasTrabalhadas);
        return funcionarioHorista.getRendimentos();
    }

    private double calcularRendimentoDeTodosFuncionarios(){
      return funcionarios.stream().mapToDouble(funcionario->funcionario.getRendimentos()).sum();
    }
    public String mostrarRendimentoTotalDeTodosFuncionarios(){
        return "O rendimento Total de Todos Funcionarios: "+calcularRendimentoDeTodosFuncionarios();
    }
    
    public Double calcularValorHoraTrabalhada(String cpf) {
    	double mediaValorHoraTrabalhada = 0.0;
    	for(Funcionario funcionario: funcionarios) {
    		if(funcionario.getCpf().equals(cpf)) {
    			mediaValorHoraTrabalhada = funcionario.getRendimentos() / funcionario.getHorasTrabalhadas();
    		} 
    	}
    	return mediaValorHoraTrabalhada;
    }
  
}
