package com.uniritter.oo;

import java.util.Scanner;

import com.uniritter.oo.model.FuncionarioAssalariado;
import com.uniritter.oo.model.FuncionarioComissionado;
import com.uniritter.oo.model.FuncionarioComissionadoBaseSalario;
import com.uniritter.oo.model.FuncionarioHorista;
import com.uniritter.oo.service.FuncionarioService;

public class Main {

    public static void main(String[] args) {

        FuncionarioService funcionarioService = new FuncionarioService();

        Scanner teclado = new Scanner(System.in);
        int escolhaMenu = 100;
        String nome;
        String cpf;
        Integer horasTrabalhadas = null;
        Double comissao;
        Double salario;
        Double valorHora;
        Double vendasBrutas = null;

        while (escolhaMenu != 0) {
            System.out.println("\nGerenciado de funcionarios");
            System.out.println("1 - Cadastrar funcionario");
            System.out.println("2 - Calcular rendimento de um Funcionario");
            System.out.println("3 - Calcular rendimento de todos funcionarios");
            System.out.println("4 - Listas todos funcionarios");
            System.out.println("0 - Para sair");

            escolhaMenu = teclado.nextInt();

            switch (escolhaMenu) {
                case 1:
                    int escolhaMenuTwo = 100;
                    while (escolhaMenuTwo != 0) {
                        System.out.println("\nDigite o tipo de funcionario:");
                        System.out.println("1 - Funcionario Assalariado");
                        System.out.println("2 - Funcionario Assalariado com comiss�o");
                        System.out.println("3 - Funcionario Comissionado");
                        System.out.println("4 - Funcionario Horista");
                        System.out.println("0 - Voltar");
                        escolhaMenuTwo = teclado.nextInt();

                        switch (escolhaMenuTwo) {
                            case 1:
                                System.out.println("\nFUNCIONARIO ASSALARIADO");
                                System.out.println("Digite o nome:");
                                nome = teclado.next();
                                System.out.println("Digite o CPF: ");
                                cpf = teclado.next();
                                System.out.println("Digite a quantidade de horas do funcionario: ");
                                horasTrabalhadas = teclado.nextInt();
                                System.out.println("Digite o salario  do novo funcionario: ");
                                salario = teclado.nextDouble();

                                funcionarioService
                                        .cadastrarFuncionario(new FuncionarioAssalariado(nome, cpf, horasTrabalhadas, salario));
                                break;

                            case 2:
                                System.out.println("\nFUNCIONARIO ASSALARIADO COM COMISSAO");
                                System.out.println("Digite o nome:");
                                nome = teclado.next();
                                System.out.println("Digite o CPF: ");
                                cpf = teclado.next();
                                System.out.println("Digite a quantidade de horas do funcionario: ");
                                horasTrabalhadas = teclado.nextInt();
                                System.out.println("Digite o salario  do novo funcionario: ");
                                salario = teclado.nextDouble();
                                System.out.println("Digite a comissao do funcionario: ");
                                comissao = teclado.nextDouble();
                                System.out.println("Digite as vendas do funcionario: ");
                                vendasBrutas = teclado.nextDouble();

                                funcionarioService.cadastrarFuncionario(new FuncionarioComissionadoBaseSalario(nome, cpf,
                                        horasTrabalhadas, salario, comissao, vendasBrutas));
                                break;

                            case 3:
                                System.out.println("\nFUNCIONARIO COMISSSIONADO");
                                System.out.println("Digite o nome:");
                                nome = teclado.next();
                                System.out.println("Digite o CPF: ");
                                cpf = teclado.next();
                                System.out.println("Digite a quantidade de horas do funcionario: ");
                                horasTrabalhadas = teclado.nextInt();
                                System.out.println("Digite a comissao do funcionario: ");
                                comissao = teclado.nextDouble();
                                System.out.println("Digite as vendas do funcionario: ");
                                vendasBrutas = teclado.nextDouble();

                                funcionarioService.cadastrarFuncionario(
                                        new FuncionarioComissionado(nome, cpf, horasTrabalhadas, comissao, vendasBrutas));
                                break;
                            case 4:
                                System.out.println("\nFUNCIONARIO HORISTA");
                                System.out.println("Digite o nome:");
                                nome = teclado.next();
                                System.out.println("Digite o CPF: ");
                                cpf = teclado.next();
                                System.out.println("Digite o valor da Hora: ");
                                valorHora = teclado.nextDouble();

                                funcionarioService
                                        .cadastrarFuncionario(new FuncionarioHorista(nome, cpf, valorHora, horasTrabalhadas));
                                break;
                            case 0:
                                System.out.println("Voltando!");
                                break;
                            default:
                                System.out.println("Opcao invalida");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nCALCULAR RENDIMENTOS DE UM FUNCIONARIO");
                    System.out.println("Digite o CPF do funcionario: ");
                    String cpfPesquisado = teclado.next();
                    System.out.println(funcionarioService.calcularRendimentosDeUmFuncionario(cpfPesquisado));
                    break;
                case 3:
                    System.out.println("\nCALCULAR RENDIMENTOS DE TODOS FUNCIONARIOS");
                    System.out.println(funcionarioService.mostrarRendimentoTotalDeTodosFuncionarios());
                    break;
                case 4:
                    System.out.println("\nLISTAR TODOS FUNCIONARIOS");
                    System.out.println(funcionarioService.listarTodosFuncionarios());
                    break;
                case 0:
                    System.out.println("----- Finalizando programa! -----");
                    break;
                default:
                    System.out.println("!! Op��o Invalida !!");
            }

        }

    }
}
