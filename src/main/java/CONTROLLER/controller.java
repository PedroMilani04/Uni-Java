package CONTROLLER;

import MODELO.departamentos.departamento;
import MODELO.funcionarios.docentes.docente;
import MODELO.funcionarios.docentes.docenteEfetivo;
import MODELO.funcionarios.tecnicos.tecnico;
import MODELO.universidade.universidade;
import MODELO.funcionarios.funcionarios;

/**
 *
 * @author Pedro
 */
public class controller {
    private universidade Uni = new universidade();
    
    public void addTecnico(String codigo, String nome, double salario, String nivel, tecnico.FuncaoTecnico funcao) {
        Uni.adicionarTecnico(codigo, nome, salario, nivel, funcao);
    }
    
    public void addDocEfet(String codigo, String nome, double salario, String nivel, docente.TitulacaoDocente titulacao, docenteEfetivo.AreaDocente area) {
        Uni.adicionarDocenteEfetivo(codigo, nome, salario, nivel, titulacao, area);
    }
    
    public void addDocSub(String codigo, String nome, double salario, String nivel, docente.TitulacaoDocente titulacao, int cargahoraria) {
        Uni.adicionarDocenteSubstituto(codigo, nome, salario, nivel, titulacao, cargahoraria);
    }
    
    public String getRelatorioFunc() {
        return Uni.relatorioFuncionarios();
    }

    public String getResumoDepartamentos() {
        return Uni.resumoDepartamentos();
    }

    public String getResumoDepartamentosGastoFaixa(double min, double max) {
        return Uni.resumoDepartamentosGastoFaixa(min, max);
    }

    public String getFuncionariosSalarioFaixa(double min, double max) {
        return Uni.funcionariosSalarioFaixa(min, max);
    }

    public String getExibirTodosFuncionarios() {
        return Uni.exibirTodosFuncionarios();
    }

    public String getExibirTodosTecnicos() {
        return Uni.exibirTodosTecnicos();
    }

    public String getExibirTodosDocentes() {
        return Uni.exibirTodosDocentes();
    }

    public String getExibirTodosDocentesEfetivos() {
        return Uni.exibirTodosDocentesEfetivos();
    }

    public String getExibirTodosDocentesSubstitutos() {
        return Uni.exibirTodosDocentesSubstitutos();
    }

    public String getExibirInformacoesDepartamento(String codigoDepartamento) {
        return Uni.exibirInformacoesDepartamento(codigoDepartamento);
    }

    public funcionarios buscarFuncionarioCodigo(String codigo) {
        return Uni.buscarFuncionarioCodigo(codigo);
    }

    public funcionarios buscarFuncionarioNome(String nome) {
        return Uni.buscarFuncionarioNome(nome);
    }

    public void addDepartamento(departamento depto) {
        Uni.adicionarDepartamento(depto);
    }
}
