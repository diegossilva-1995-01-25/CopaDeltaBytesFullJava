package br.com.silva.diego.copadeltabytes.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbconfronto")
public class Confronto {
	@Id
	private int idconfronto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tbucampeonato.idcampeonato")
	private Campeonato campeonato;

	public int getIdconfronto() {
		return idconfronto;
	}

	public void setIdconfronto(int idconfronto) {
		this.idconfronto = idconfronto;
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	} 
	
	
	
}
