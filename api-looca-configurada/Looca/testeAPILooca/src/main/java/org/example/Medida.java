/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.util.Date;

/**
 *
 * @author luanb
 */
public class Medida {
    
    private Integer idCaptura;
    private Integer fkComponente;
    private Integer usoVolume;
    private Date dataHora;

    public Medida(Integer idCaptura, Integer fkComponente, Integer usoVolume, Date dataHora) {
       
        if (idCaptura == null) {
            throw new MainException(" idCaptura é nulo!");
        }
        if (fkComponente == null) {

            throw new MainException(" fkComponenete é nulo!");
        }
        if (usoVolume == null) {

            throw new MainException(" usoVolume é nulo!");
        }
        
         if (dataHora == null) {

            throw new MainException(" dataHora é nulo!");
        }
        
        this.idCaptura = idCaptura;
        this.fkComponente = fkComponente;
        this.usoVolume = usoVolume;
        this.dataHora = dataHora;
    }

    public Integer getIdCaptura() {
        return idCaptura;
    }

    public void setIdCaptura(Integer idCaptura) {
        this.idCaptura = idCaptura;
    }

    public Integer getFkComponente() {
        return fkComponente;
    }

    public void setFkComponente(Integer fkComponente) {
        this.fkComponente = fkComponente;
    }

    public Integer getUsoVolume() {
        return usoVolume;
    }

    public void setUsoVolume(Integer usoVolume) {
        this.usoVolume = usoVolume;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
    
    
}
