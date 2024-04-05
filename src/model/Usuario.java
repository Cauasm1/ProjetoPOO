/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author S.Lucas
 */
public class Usuario {

    private long pkUsuario;
    private String nome;
    private String email;
    private String senha;
    private Date dataNasc;
    private boolean ativo;

    public Usuario() {
    }

    ;
    
    public Usuario(long pkUsuario, String nome, String email, String senha, Date dataNasc, boolean ativo) {
        this.pkUsuario = pkUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNasc = dataNasc;
        this.ativo = ativo;
    }

    public void setPkUsuario(long pkUsuario) {
        this.pkUsuario = pkUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public long getPkUsuario() {
        return pkUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String ativoToString() {
        if (ativo == true) {
            return "Ativo";
        } else {
            return "Inativo";
        }
    }

}
