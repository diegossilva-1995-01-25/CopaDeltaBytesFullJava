package br.com.silva.diego.copadeltabytes.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbujogador")
public class Jogador {
	@Id
	private int idjogador;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tbusuario.idusuario")
	private Usuario usuario;
	
    private String nome;

	public int getIdjogador() {
		return idjogador;
	}

	public void setIdjogador(int idjogador) {
		this.idjogador = idjogador;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
    
}
