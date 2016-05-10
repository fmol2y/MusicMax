package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TIM6ZANIMLJIVOST database table.
 * 
 */
@Entity
@NamedQuery(name="Tim6zanimljivost.findAll", query="SELECT t FROM Tim6zanimljivost t")
public class Tim6zanimljivost implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idz;

	private String tekst;

	//bi-directional many-to-one association to Tim6registrovaniKorisnik
	@ManyToOne
	@JoinColumn(name="IDK")
	private Tim6registrovaniKorisnik tim6registrovaniKorisnik;

	public Tim6zanimljivost() {
	}

	public int getIdz() {
		return this.idz;
	}

	public void setIdz(int idz) {
		this.idz = idz;
	}

	public String getTekst() {
		return this.tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public Tim6registrovaniKorisnik getTim6registrovaniKorisnik() {
		return this.tim6registrovaniKorisnik;
	}

	public void setTim6registrovaniKorisnik(Tim6registrovaniKorisnik tim6registrovaniKorisnik) {
		this.tim6registrovaniKorisnik = tim6registrovaniKorisnik;
	}

}