/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarios.tecnicos;

/**
 *
 * @author Pedro
 */
public class tecnico extends funcionarios.funcionarios {

    public enum FuncaoTecnico {
        ASSESSOR,
        LABORATORIO,
        SECRETARIO
    }
    protected FuncaoTecnico funcao;

    public tecnico(String codigo, String nome, float salario, String nivel, FuncaoTecnico funcao) {
        super(codigo, nome, salario, nivel);
        this.funcao = funcao;
    }

    public void setFuncao(FuncaoTecnico funcao) {
        this.funcao = funcao;
    }

    public FuncaoTecnico getFuncao() {
        return funcao;
    }

    public double calcularSalario() {
        double salario = this.salario;
        if (nivel.equals("T1")) {
            salario *= 1.1;
        } else if (nivel.equals("T2")) {
            salario *= 1.2;
        }
        return salario;
    }
}
