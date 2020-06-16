package com.uniritter.oo;

import com.uniritter.oo.model.FuncionarioComissionado;
import com.uniritter.oo.model.FuncionarioComissionadoBaseSalario;
import com.uniritter.oo.service.FuncionarioService;

public class Main {

    public static void main(String[] args) {
        FuncionarioComissionado matheus =
                new FuncionarioComissionado("Matheus", "99999999999", 5000.0, 0.8);
        FuncionarioComissionadoBaseSalario vargas =
                new FuncionarioComissionadoBaseSalario("Vargas", "8888888888", 5000.0,  0.5, 2500.0);

        FuncionarioService funcionarioService = new FuncionarioService();
        funcionarioService.cadastrarFuncionario(matheus);
        funcionarioService.cadastrarFuncionario(vargas);
        System.out.println(funcionarioService.listarTodosFuncionarios());

    }
}
