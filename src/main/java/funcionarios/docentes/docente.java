/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarios.docentes;

/**
 *
 * @author Pedro
 */
public abstract class docente extends funcionarios.funcionarios{
    public enum TitulacaoDocente {
        GRADUACAO,
        MESTRADO,
        DOUTORADO,
        LIVREDOCENTE,
        TITULAR
    }
    
    private TitulacaoDocente titulacao;
    
    public docente(String codigo, String nome, double salario, String nivel, TitulacaoDocente titulacao) {
        super(codigo, nome, salario, nivel);
        this.titulacao = titulacao;
    }
    
    public void setTitulacao(TitulacaoDocente titulacao) {
        this.titulacao = titulacao;
    }
    
    public TitulacaoDocente getTitulacao() {
        return titulacao;
    }
    
    public abstract double calcularSalario();

}
