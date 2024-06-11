/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATABASE;

import MODELO.funcionarios.funcionarios;
import MODELO.departamentos.departamento;
/**
 *
 * @author Pedro
 */
public class database {
    private funcionarios funcionarios[];
    private int contFunc;
    private departamento departamentos[];
    private int contDep;
    private int max;
    private static database instance=null;
    
    public database() {
        this.max = 1000;
        funcionarios = new funcionarios[max];
        departamentos = new departamento[max];
        this.contFunc = 0;
        this.contDep = 0;    
    }
    
    public database(int max) {
        this.max = max;
        funcionarios = new funcionarios[max];
        departamentos = new departamento[max];
        this.contFunc = 0;
        this.contDep = 0;      
    }
    
    public static database getInstance() {
        if(instance == null) {
            instance = new database();
        }
        return instance;
    }
    
    public funcionarios[] getFuncionarios() {
        return funcionarios;
    }

    public departamento[] getDepartamentos() {
        return departamentos;
    }

    public int getQuantidadeFuncionarios() {
        return contFunc;
    }

    public int getQuantidadeDepartamentos() {
        return contDep;
    }
    
    public void addFunc(funcionarios f) {
        if(contFunc < funcionarios.length) {
            funcionarios[contFunc] = f;
            contFunc++;
        }
    }
    
    public void addDep(departamento d) {
        if(contDep < departamentos.length) {
            departamentos[contDep] = d;
            contDep++;
        }
    }
    
    public funcionarios buscarFuncionariro(String codigo){
        for (int i=0; i<contFunc; i++){
            if (funcionarios[i].getCodigo().equals(codigo)){
                return funcionarios[i];
            }
        }
        return null;
    }
    
    public departamento buscarDepartamento(String codigo){
        for (int i=0; i<contDep; i++){
            if (departamentos[i].getCodigo().equals(codigo)){
                return departamentos[i];
            }
        }
        return null;
    }
    
}
