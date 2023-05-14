/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author luanb
 */
public class Totem {
    
    private Integer id;
    private String hostName;
    private Integer fkEmpresa;

    public Totem(Integer id, String hostName, Integer fkEmpresa) {
        
        if(id == null){
            throw new MainException(" id é nulo!");
        }
        if(hostName == null){
            
             throw new MainException(" hostName é nulo!");
        }
         if(fkEmpresa == null){
            
             throw new MainException(" fkEmpresa é nulo!");
        }
        
        
        this.id = id;
        this.hostName = hostName;
        this.fkEmpresa = fkEmpresa;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Integer getFkEmpresa() {
        return fkEmpresa;
    }

    public void setFkEmpresa(Integer fkEmpresa) {
        this.fkEmpresa = fkEmpresa;
    }
   
    
    
    
}
