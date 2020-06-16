package com.uniritter.oo;

import java.util.Scanner;

import com.uniritter.oo.model.FuncionarioAssalariado;
import com.uniritter.oo.model.FuncionarioComissionado;
import com.uniritter.oo.model.FuncionarioComissionadoBaseSalario;
import com.uniritter.oo.service.FuncionarioService;

public class Main {

    public static void main(String[] args) {
    	
    	FuncionarioService funcionarioService = new FuncionarioService();
    	
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("Gerenciado de funcionarios");
    	System.out.println("1 - Cadastrar funcionario");
    	System.out.println("2 - Calcular rendimento de um Funcionario");
    	System.out.println("3 - Calcular rendimento de todos funcionarios");
    	System.out.println("4 - Listas todos funcionarios");
    	
    	int escolhaMenu = teclado.nextInt();
    	
    	String nome;
    	String cpf;
    	Integer horasTrabalhadas;
    	Double comissao;
    	Double salario;
    	
    	
    	switch (escolhaMenu) {
    		case 1:
    			System.out.println("Digite o tipo de funcionario:");
    			System.out.println("1 - Funcionario Assalariado");
    	    	System.out.println("2 - Funcionario Assalariado com comissão");
    	    	System.out.println("3 - Funcionario Comissionado");
    	    	System.out.println("4 - Funcionario Horista");
    	    	escolhaMenu = teclado.nextInt();
    	    		switch (escolhaMenu) {
    	    		case 1:    	    			
    	    			System.out.println("Digite o nome:");
    	    			nome = teclado.next();
    	    			System.out.println("Digite o CPF: ");
    	    			cpf = teclado.next();
    	    			System.out.println("Digite a quantidade de horas do funcionario: ");
    	    			horasTrabalhadas = teclado.nextInt();
    	    			System.out.println("Digite o salario  do novo funcionario: ");
    	    			salario = teclado.nextDouble();
    	    			
    	    			funcionarioService.cadastrarFuncionario(new FuncionarioAssalariado(nome, cpf, horasTrabalhadas, salario));    	    			
    	    		}
    		
    	/*	case 1:
    		case 1:
    		case 1:
    		case 1:*/
    			
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	/*FuncionarioComissionado matheus =
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
    	System.out.println(funcionarioService.mostrarRendimentoTotalDeTodosFuncionarios());*/

    }
}
