/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author luanb
 */
public class Componente {
    
    private Integer idTipoComponente;
    private String nome;
    private String unidadeMedida;

    public Componente(Integer idTipoComponente, String nome, String unidadeMedida) {
        
         if (idTipoComponente == null) {
            throw new MainException(" fkTotem é nulo!");
        }
        if (nome == null) {

            throw new MainException(" nome é nulo!");
        }
        if (unidadeMedida == null) {

            throw new MainException(" capacidade é nulo!");
        }
       
        
        this.idTipoComponente = idTipoComponente;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
    }

    public Integer getIdTipoComponente() {
        return idTipoComponente;
    }

    public void setIdTipoComponente(Integer idTipoComponente) {
        this.idTipoComponente = idTipoComponente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    
}
