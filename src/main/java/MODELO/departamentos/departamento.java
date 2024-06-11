package MODELO.departamentos;

import MODELO.funcionarios.funcionarios;

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

    // Getter for codigo
    public String getCodigo() {
        return codigo;
    }

    // Optionally, you might want to add getters for other fields as well
    public String getNome() {
        return nome;
    }

    public funcionarios[] getFuncionarios() {
        return funcionarios;
    }

    // Optionally, you might want to add setters if you need to modify the fields
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncionarios(funcionarios[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
