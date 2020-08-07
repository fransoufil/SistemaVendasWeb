/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author franz
 */
public class Empregado {
    
    //a implementacao das variáveis devem seguir as definições do dbVendasWeb
    int idempregado;
    String rgempregado;
    String nomeempregado;
    String telefoneempregado;
    String estadoempregado;
    String usuario;
    
    
    public Empregado(){
        
    }
    
    public Empregado(int idempregado,String rgempregado, String nomeempregado,String telefoneempregado,String estadoempregado,String usuario){
        
        this.idempregado = idempregado;
        this.rgempregado = rgempregado;
        this.nomeempregado = nomeempregado;
        this.telefoneempregado = telefoneempregado;
        this.estadoempregado = estadoempregado;
        this.usuario = usuario;
        
    }

    public int getIdempregado() {
        return idempregado;
    }

    public void setIdempregado(int idempregado) {
        this.idempregado = idempregado;
    }

    public String getRgempregado() {
        return rgempregado;
    }

    public void setRgempregado(String rgempregado) {
        this.rgempregado = rgempregado;
    }

    public String getNomeempregado() {
        return nomeempregado;
    }

    public void setNomeempregado(String nomeempregado) {
        this.nomeempregado = nomeempregado;
    }

    public String getTelefoneempregado() {
        return telefoneempregado;
    }

    public void setTelefoneempregado(String telefoneempregado) {
        this.telefoneempregado = telefoneempregado;
    }

    public String getEstadoempregado() {
        return estadoempregado;
    }

    public void setEstadoempregado(String estadoempregado) {
        this.estadoempregado = estadoempregado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
}
