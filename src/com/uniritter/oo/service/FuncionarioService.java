package com.uniritter.oo.service;

import com.uniritter.oo.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public List<Funcionario> listarTodosFuncionarios(){
        return funcionarios;
    }

    public double calcularRendimentoDoFuncionario(Funcionario funcionario){
        return ;
    }
    public double calcularRendimentoDeTodosFuncionarios(){
      return ;
    }
}
