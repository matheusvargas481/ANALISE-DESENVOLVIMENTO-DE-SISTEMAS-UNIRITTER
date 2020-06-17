package test.com.uniritter.oo.service;

import com.uniritter.oo.model.*;
import com.uniritter.oo.service.FuncionarioService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FuncionarioServiceTest {
    private FuncionarioService funcionarioService = new FuncionarioService();
    private List<Funcionario> funcionarios;
    @Before
    public void init() {
        funcionarios = new ArrayList<>(Arrays.asList(
                new FuncionarioAssalariado("Matheus", "999999999999", 52, 2500.0),
                new FuncionarioHorista("Vargas", "7777777777", 50.0, 60),
                new FuncionarioComissionado("Emiliano", "5555555555555555", 40, 15.0, 50000.0),
                new FuncionarioComissionadoBaseSalario("Fuchs", "66666666666", 39, 5000.0, 10.0, 100000.0),
                new FuncionarioAssalariado("Eduarda", "111111111111111", 60, 9500.0)));
        funcionarioService.cadastrarFuncionario(new FuncionarioAssalariado("Matheus", "999999999999", 52, 2500.0));
        funcionarioService.cadastrarFuncionario(new FuncionarioHorista("Vargas", "7777777777", 50.0, 60));
        funcionarioService.cadastrarFuncionario(new FuncionarioComissionado("Emiliano", "5555555555555555", 40, 15.0, 50000.0));
        funcionarioService.cadastrarFuncionario(new FuncionarioComissionadoBaseSalario("Fuchs", "66666666666", 39, 5000.0, 10.0, 100000.0));
    }

    @After
    public void finalize() {
        funcionarios.clear();
    }
    @Test
    public void testCadastrarFuncionario() {
     funcionarioService.cadastrarFuncionario(new FuncionarioAssalariado("Matheus", "999999999999", 52, 2500.0));
     assertEquals(5,funcionarios.size());
    }

    @Test
    public void testCalcularValorHoraTrabalhada() {
        assertEquals(funcionarioService.calcularValorHoraTrabalhada(funcionarios.get(3).getCpf()),funcionarioService.calcularValorHoraTrabalhada(funcionarios.get(3).getCpf()));
    }

    @Test
    public void testCalcularRendimentoMedio(){
        assertEquals(new Double(7125.0),funcionarioService.calcularRendimentoMedio());
    }

    @Test
    public void testCalcularRendimentosDeUmFuncionario() {
        assertEquals(funcionarioService.listarTodosFuncionarios().get(0).getRendimentos(),funcionarioService.calcularRendimentosDeUmFuncionario(funcionarios.get(0).getCpf()));
    }

}