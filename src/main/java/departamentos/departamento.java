/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departamentos;


import funcionarios.funcionarios;
/**
 *
 * @author Pedro
 */
public class departamento {
    private String codigo;
    private String nome;
    private funcionarios[] funcionarios;
    
    public departamento(String codigo, String nome, int tamanhoArray) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcionarios = new funcionarios[tamanhoArray];
    }
}
