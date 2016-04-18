package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TIM6AUTOR database table.
 * 
 */
@Entity
@NamedQuery(name="Tim6autor.findAll", query="SELECT t FROM Tim6autor t")
public class Tim6autor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ida;

	private String nazivautor;

	public Tim6autor() {
	}

	public int getIda() {
		return this.ida;
	}

	public void setIda(int ida) {
		this.ida = ida;
	}

	public String getNazivautor() {
		return this.nazivautor;
	}

	public void setNazivautor(String nazivautor) {
		this.nazivautor = nazivautor;
	}

}