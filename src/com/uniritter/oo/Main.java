package com.uniritter.oo;

import com.uniritter.oo.model.FuncionarioComissionado;
import com.uniritter.oo.model.FuncionarioComissionadoBaseSalario;
import com.uniritter.oo.service.FuncionarioService;

public class Main {

    public static void main(String[] args) {
        FuncionarioComissionado matheus =
                new FuncionarioComissionado("Matheus", "99999999999");
        FuncionarioComissionadoBaseSalario vargas =
                new FuncionarioComissionadoBaseSalario("Vargas", "8888888888");

        FuncionarioService funcionarioService = new FuncionarioService();
        funcionarioService.cadastrarFuncionario(matheus);
        funcionarioService.cadastrarFuncionario(vargas);
        System.out.println(funcionarioService.listarTodosFuncionarios());
        System.out.println(funcionarioService.calcularRendimentoDoFuncionarioComissionado(5000, 0.8));
        System.out.println(funcionarioService.calcularRendimentoDoFuncionarioComissionadoBaseSalario(5000));
        System.out.println(funcionarioService.showRendimentoTotalDeTodosFuncionarios());

    }
}
