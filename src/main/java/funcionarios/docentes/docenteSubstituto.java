/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarios.docentes;

/**
 *
 * @author Pedro
 */
public class docenteSubstituto extends funcionarios.docentes.docente {

    public enum CargaHoraria {
        DOZE(12),
        VINTEQUATRO(24);

        private final int horas;

        CargaHoraria(int horas) {
            this.horas = horas;
        }

        public int getHoras() {
            return horas;
        }
    }
    protected int cargaHoraria;

    public docenteSubstituto(String codigo, String nome, double salario, String nivel, TitulacaoDocente titulacao, int cargaHoraria) {
        super(codigo, nome, salario, nivel, titulacao);
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(CargaHoraria cargaHoraria) {
        this.cargaHoraria = cargaHoraria.getHoras();
    }

    public double calcularSalario() {
        double salario = this.salario;
        if (nivel.equals("S1")) {
            salario *= 1.05;
        } else if (nivel.equals("S2")) {
            salario *= 1.1;
        }
        return salario;
    }
}
