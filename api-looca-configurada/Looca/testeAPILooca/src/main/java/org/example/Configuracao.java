/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author luanb
 */
public class Configuracao {

    private Integer fkTotem;
    private Integer fkComponente;
    private Double capacidade;
    private String unidadeMedida;

    public Configuracao(Integer fkTotem, Integer fkComponente, Double capacidade, String unidadeMedida) {

        if (fkTotem == null) {
            throw new MainException(" fkTotem é nulo!");
        }
        if (fkComponente == null) {

            throw new MainException(" fkComponente é nulo!");
        }
        if (capacidade == null) {

            throw new MainException(" capacidade é nulo!");
        }
        if (unidadeMedida == null) {

            throw new MainException(" unidadeMedida é nulo!");
        }

        this.fkTotem = fkTotem;
        this.fkComponente = fkComponente;
        this.capacidade = capacidade;
        this.unidadeMedida = unidadeMedida;
    }

    public Integer getFkTotem() {
        return fkTotem;
    }

    public void setFkTotem(Integer fkTotem) {
        this.fkTotem = fkTotem;
    }

    public Integer getFkComponente() {
        return fkComponente;
    }

    public void setFkComponente(Integer fkComponente) {
        this.fkComponente = fkComponente;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

}
