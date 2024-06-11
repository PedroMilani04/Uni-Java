/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO.universidade;

import DATABASE.database;
import MODELO.funcionarios.docentes.docente;
import MODELO.funcionarios.docentes.docenteEfetivo;
import MODELO.funcionarios.funcionarios;
import MODELO.funcionarios.tecnicos.tecnico;
import MODELO.funcionarios.docentes.docenteSubstituto;
/**
 *
 * @author Pedro
 */
public class universidade {
    private database db = database.getInstance();
    private String nome;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    
    
    
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
      
      
 // olhar lista de coisas p/ fazer
    public String relatorioFuncionarios() {
        StringBuilder relatorio = new StringBuilder();
        funcionarios funcionarios[] = db.getFuncionarios();
        int qntd = db.getQuantidadeFuncionarios();
        for(int i = 0; i < qntd; i++) {
            relatorio.append(funcionarios[i].toString());
        }
        return relatorio.toString();
    }
    
}
