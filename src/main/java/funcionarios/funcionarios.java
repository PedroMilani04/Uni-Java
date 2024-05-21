/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarios;

/**
 *
 * @author Pedro
 */
public abstract class funcionarios {
    protected String codigo;
    protected String nome;
    protected double salario;
    protected String nivel;

    public funcionarios(String codigo, String nome, double salario, String nivel) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
        this.nivel = nivel;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public abstract double calcularSalario();

}
