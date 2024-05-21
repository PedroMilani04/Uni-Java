/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarios.docentes;

/**
 *
 * @author Pedro
 */
public class docenteEfetivo extends funcionarios.docentes.docente {
    
    public enum AreaDocente {
        BIOLOGICAS,
        EXATAS,
        HUMANAS,
        SAUDE
    }
    protected AreaDocente area;

    public docenteEfetivo(String codigo, String nome, double salario, String nivel, TitulacaoDocente titulacao, AreaDocente area) {
        super(codigo, nome, salario, nivel, titulacao);
        this.area = area;
    }

    public void setArea(AreaDocente area) {
        this.area = area;
    }
    
    public AreaDocente getArea() {
        return area;
    }
    
    public double calcularSalario() {
        double salario = this.salario;
        if (nivel.equals("D1")) {
            salario *= 1.05;
        } else if (nivel.equals("D2")) {
            salario *= 1.1;
        } else if (nivel.equals("D3")) {
            salario *= 1.2;
        }

        salario *= 1.05;

        return salario;
    }
}
