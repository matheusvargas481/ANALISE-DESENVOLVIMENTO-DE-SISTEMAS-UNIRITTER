package com.uniritter.oo;

import com.uniritter.oo.model.FuncionarioComissionado;
import com.uniritter.oo.model.FuncionarioComissionadoBaseSalario;
import com.uniritter.oo.service.FuncionarioService;

public class Main {

    public static void main(String[] args) {
        FuncionarioComissionado matheus =
                new FuncionarioComissionado("Matheus", "99999999999", 40, 0.05);
        FuncionarioComissionadoBaseSalario vargas =
                new FuncionarioComissionadoBaseSalario("Vargas", "8888888888", 40, 1300.0, 0.15);

        FuncionarioService funcionarioService = new FuncionarioService();
        funcionarioService.cadastrarFuncionario(matheus);
        funcionarioService.cadastrarFuncionario(vargas);
        matheus.setVendasBrutas(100000.0);
        vargas.setVendasBrutas(20000.0);
        
        System.out.println(funcionarioService.listarTodosFuncionarios());
        System.out.println(funcionarioService.calcularRendimentoDoFuncionarioComissionado(5000));
        System.out.println(funcionarioService.calcularRendimentoDoFuncionarioComissionadoBaseSalario());
        System.out.println(funcionarioService.mostrarRendimentoTotalDeTodosFuncionarios());

    }
}
