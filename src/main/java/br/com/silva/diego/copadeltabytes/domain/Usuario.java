package br.com.silva.diego.copadeltabytes.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbusuario")
public class Usuario {
	@Id
	private int idusuario;
	
    private String email;
    
    private String senha;
    
	public int getIdusuario() {
		return idusuario;
	}
	
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
    
}
