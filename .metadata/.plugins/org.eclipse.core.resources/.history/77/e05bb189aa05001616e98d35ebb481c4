package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the TIM6KOMENTAR database table.
 * 
 */
@Entity
@NamedQuery(name="Tim6komentar.findAll", query="SELECT t FROM Tim6komentar t")
public class Tim6komentar implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Tim6komentarPK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datumvreme;

	private String komentar;

	//bi-directional many-to-one association to Tim6kompozicija
	@ManyToOne
	@JoinColumn(name="ID")
	private Tim6kompozicija tim6kompozicija;

	//bi-directional many-to-one association to Tim6registrovaniKorisnik
	@ManyToOne
	@JoinColumn(name="IDK")
	private Tim6registrovaniKorisnik tim6registrovaniKorisnik;

	public Tim6komentar() {
	}

	public Tim6komentarPK getId() {
		return this.id;
	}

	public void setId(Tim6komentarPK id) {
		this.id = id;
	}

	public Date getDatumvreme() {
		return this.datumvreme;
	}

	public void setDatumvreme(Date datumvreme) {
		this.datumvreme = datumvreme;
	}

	public String getKomentar() {
		return this.komentar;
	}

	public void setKomentar(String komentar) {
		this.komentar = komentar;
	}

	public Tim6kompozicija getTim6kompozicija() {
		return this.tim6kompozicija;
	}

	public void setTim6kompozicija(Tim6kompozicija tim6kompozicija) {
		this.tim6kompozicija = tim6kompozicija;
	}

	public Tim6registrovaniKorisnik getTim6registrovaniKorisnik() {
		return this.tim6registrovaniKorisnik;
	}

	public void setTim6registrovaniKorisnik(Tim6registrovaniKorisnik tim6registrovaniKorisnik) {
		this.tim6registrovaniKorisnik = tim6registrovaniKorisnik;
	}

}