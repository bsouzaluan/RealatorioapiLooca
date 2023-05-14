/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author luanb
 */
public class Empresa {
    
    private Integer idEmpresa;
    private String nomeResponsavel;
    private String cnpj;
    private String telefone;
    private String email;
    private Integer qtdTotem;
    private Boolean statusEmpresa;

    public Empresa(Integer idEmpresa, String nomeResponsavel, String cnpj, String telefone, String email, Integer qtdTotem, Boolean statusEmpresa) {
       
        if (idEmpresa == null) {
            throw new MainException(" idEmpresa é nulo!");
        }
        if (nomeResponsavel == null) {

            throw new MainException(" Nome do Responsavel é nulo!");
        }
        if (cnpj == null) {

            throw new MainException(" CNPJ é nulo!");
        }
        
         if (telefone == null) {

            throw new MainException(" Telefone é nulo!");
        }
         
          if (email == null) {

            throw new MainException(" Email é nulo!");
        }
           if (qtdTotem == null) {

            throw new MainException(" Quantidade de totem é nulo!");
        }
            if (statusEmpresa == null) {

            throw new MainException(" Status da empresa é nulo!");
        }
          
        
        this.idEmpresa = idEmpresa;
        this.nomeResponsavel = nomeResponsavel;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.qtdTotem = qtdTotem;
        this.statusEmpresa = statusEmpresa;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getQtdTotem() {
        return qtdTotem;
    }

    public void setQtdTotem(Integer qtdTotem) {
        this.qtdTotem = qtdTotem;
    }

    public Boolean getStatusEmpresa() {
        return statusEmpresa;
    }

    public void setStatusEmpresa(Boolean statusEmpresa) {
        this.statusEmpresa = statusEmpresa;
    }
    
    
}
