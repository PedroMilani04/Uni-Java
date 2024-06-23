package MODELO.universidade;

import DATABASE.database;
import MODELO.departamentos.departamento;
import MODELO.funcionarios.docentes.docente;
import MODELO.funcionarios.docentes.docenteEfetivo;
import MODELO.funcionarios.funcionarios;
import MODELO.funcionarios.tecnicos.tecnico;
import MODELO.funcionarios.docentes.docenteSubstituto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class universidade {
    private database db = database.getInstance();
    private List<departamento> departamentos = new ArrayList<>();
    
    public void adicionarTecnico(String codigo, String nome, double salario, String nivel, tecnico.FuncaoTecnico funcao) {        
        tecnico f = new tecnico(codigo, nome, salario, nivel, funcao);
        db.addFunc(f);
    }
    
    public void adicionarDocenteEfetivo(String codigo, String nome, double salario, String nivel, docente.TitulacaoDocente titulacao, docenteEfetivo.AreaDocente area) {        
        docenteEfetivo f = new docenteEfetivo(codigo, nome, salario, nivel, titulacao, area);
        db.addFunc(f);
    }
     
    public void adicionarDocenteSubstituto(String codigo, String nome, double salario, String nivel, docente.TitulacaoDocente titulacao, int cargahoraria) {        
        docenteSubstituto f = new docenteSubstituto(codigo, nome, salario, nivel, titulacao, cargahoraria);
        db.addFunc(f);
    }
      
    public String relatorioFuncionarios() {
        StringBuilder relatorio = new StringBuilder();
        funcionarios funcionarios[] = db.getFuncionarios();
        int qntd = db.getQuantidadeFuncionarios();
        for(int i = 0; i < qntd; i++) {
            relatorio.append(funcionarios[i].toString()).append("\n");
        }
        return relatorio.toString();
    }

    public String resumoDepartamentos() {
        StringBuilder resumo = new StringBuilder();
        for (departamento depto : departamentos) {
            int quantidadeFuncionarios = depto.getFuncionarios().length;
            double gastoTotal = 0;
            for (funcionarios func : depto.getFuncionarios()) {
                if (func != null) {
                    gastoTotal += func.calcularSalario();
                }
            }
            resumo.append("Departamento: ").append(depto.getNome())
                  .append(", Quantidade de Funcionários: ").append(quantidadeFuncionarios)
                  .append(", Gasto Total: ").append(gastoTotal).append("\n");
        }
        return resumo.toString();
    }

    public String resumoDepartamentosGastoFaixa(double min, double max) {
        StringBuilder resumo = new StringBuilder();
        for (departamento depto : departamentos) {
            double gastoTotal = 0;
            for (funcionarios func : depto.getFuncionarios()) {
                if (func != null) {
                    gastoTotal += func.calcularSalario();
                }
            }
            if (gastoTotal >= min && gastoTotal <= max) {
                resumo.append("Departamento: ").append(depto.getNome())
                      .append(", Gasto Total: ").append(gastoTotal).append("\n");
            }
        }
        return resumo.toString();
    }

    public String funcionariosSalarioFaixa(double min, double max) {
        StringBuilder relatorio = new StringBuilder();
        funcionarios funcionarios[] = db.getFuncionarios();
        int qntd = db.getQuantidadeFuncionarios();
        for(int i = 0; i < qntd; i++) {
            if (funcionarios[i].getSalario() >= min && funcionarios[i].getSalario() <= max) {
                relatorio.append(funcionarios[i].toString()).append("\n");
            }
        }
        return relatorio.toString();
    }

    public String exibirTodosFuncionarios() {
        return relatorioFuncionarios();
    }

    public String exibirTodosTecnicos() {
        StringBuilder relatorio = new StringBuilder();
        funcionarios funcionarios[] = db.getFuncionarios();
        int qntd = db.getQuantidadeFuncionarios();
        for(int i = 0; i < qntd; i++) {
            if (funcionarios[i] instanceof tecnico) {
                relatorio.append(funcionarios[i].toString()).append("\n");
            }
        }
        return relatorio.toString();
    }

    public String exibirTodosDocentes() {
        StringBuilder relatorio = new StringBuilder();
        funcionarios funcionarios[] = db.getFuncionarios();
        int qntd = db.getQuantidadeFuncionarios();
        for(int i = 0; i < qntd; i++) {
            if (funcionarios[i] instanceof docente) {
                relatorio.append(funcionarios[i].toString()).append("\n");
            }
        }
        return relatorio.toString();
    }

    public String exibirTodosDocentesEfetivos() {
        StringBuilder relatorio = new StringBuilder();
        funcionarios funcionarios[] = db.getFuncionarios();
        int qntd = db.getQuantidadeFuncionarios();
        for(int i = 0; i < qntd; i++) {
            if (funcionarios[i] instanceof docenteEfetivo) {
                relatorio.append(funcionarios[i].toString()).append("\n");
            }
        }
        return relatorio.toString();
    }

    public String exibirTodosDocentesSubstitutos() {
        StringBuilder relatorio = new StringBuilder();
        funcionarios funcionarios[] = db.getFuncionarios();
        int qntd = db.getQuantidadeFuncionarios();
        for(int i = 0; i < qntd; i++) {
            if (funcionarios[i] instanceof docenteSubstituto) {
                relatorio.append(funcionarios[i].toString()).append("\n");
            }
        }
        return relatorio.toString();
    }

    public String exibirInformacoesDepartamento(String codigoDepartamento) {
        for (departamento depto : departamentos) {
            if (depto.getCodigo().equals(codigoDepartamento)) {
                StringBuilder info = new StringBuilder();
                info.append("Departamento: ").append(depto.getNome()).append("\n");
                info.append("Funcionários:\n");
                for (funcionarios func : depto.getFuncionarios()) {
                    if (func != null) {
                        info.append(func.toString()).append("\n");
                    }
                }
                return info.toString();
            }
        }
        return "Departamento não encontrado.";
    }

    public funcionarios buscarFuncionarioCodigo(String codigo) {
        funcionarios funcionarios[] = db.getFuncionarios();
        int qntd = db.getQuantidadeFuncionarios();
        for(int i = 0; i < qntd; i++) {
            if (funcionarios[i].getCodigo().equals(codigo)) {
                return funcionarios[i];
            }
        }
        return null;
    }

    public funcionarios buscarFuncionarioNome(String nome) {
        funcionarios funcionarios[] = db.getFuncionarios();
        int qntd = db.getQuantidadeFuncionarios();
        for(int i = 0; i < qntd; i++) {
            if (funcionarios[i].getNome().equals(nome)) {
                return funcionarios[i];
            }
        }
        return null;
    }

    public void adicionarDepartamento(departamento depto) {
        departamentos.add(depto);
    }
}
