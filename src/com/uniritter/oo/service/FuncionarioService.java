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

    public double calcularRendimentoDoFuncionarioAssalariado(double salario){
        funcionarioAssalariado.setSalario(salario);
        return funcionarioAssalariado.getRendimentos(); }

    public double calcularRendimentoDoFuncionarioComissionado(double vendasBrutas,double taxaDeComissao){
        funcionarioComissionado.setVendasBrutas(vendasBrutas);
        funcionarioComissionado.setTaxaDeComissao(taxaDeComissao);
        return funcionarioComissionado.getRendimentos();
    }

    public double calcularRendimentoDoFuncionarioComissionadoBaseSalario(){ return funcionarioComissionadoBaseSalario.getRendimentos();}

    public double calcularRendimentoDoFuncionarioHorista(){ return funcionarioHorista.getRendimentos();}

    private double calcularRendimentoDeTodosFuncionarios(){
      return funcionarioAssalariado.getRendimentos()
              +funcionarioComissionado.getRendimentos()
              +funcionarioComissionadoBaseSalario.getRendimentos()
              +funcionarioHorista.getRendimentos();
    }
    public String showRendimentoTotalDeTodosFuncionarios(){
        return "O rendimento Total de Todos Funcionarios: "+calcularRendimentoDeTodosFuncionarios();
    }
}
