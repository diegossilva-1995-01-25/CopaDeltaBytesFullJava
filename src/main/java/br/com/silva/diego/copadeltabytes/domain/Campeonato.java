package br.com.silva.diego.copadeltabytes.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbcampeonato")
public class Campeonato {
	@Id
	private int idcampeonato;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tbusuario.idusuario")
	private Usuario usuario;
	
    private String nome;
    
	private int numeroparticipantes;

	public int getIdcampeonato() {
		return idcampeonato;
	}

	public void setIdcampeonato(int idcampeonato) {
		this.idcampeonato = idcampeonato;
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

	public int getNumeroparticipantes() {
		return numeroparticipantes;
	}

	public void setNumeroparticipantes(int numeroparticipantes) {
		this.numeroparticipantes = numeroparticipantes;
	}
	
	
	
}
