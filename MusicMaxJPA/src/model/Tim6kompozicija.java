package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TIM6KOMPOZICIJA database table.
 * 
 */
@Entity
@NamedQuery(name="Tim6kompozicija.findAll", query="SELECT t FROM Tim6kompozicija t")
public class Tim6kompozicija implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String album;

	private String autor;

	private int dislikes;

	private int glasovi;

	private int godina;

	private String izvodjac;

	private int likes;

	private String naziv;

	private String pravac;

	private float ratio;

	//bi-directional many-to-one association to Tim6komentar
	@OneToMany(mappedBy="tim6kompozicija")
	private List<Tim6komentar> tim6komentars;

	//bi-directional many-to-one association to Tim6registrovaniKorisnik
	@ManyToOne
	@JoinColumn(name="IDK")
	private Tim6registrovaniKorisnik tim6registrovaniKorisnik;

	public Tim6kompozicija() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlbum() {
		return this.album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getDislikes() {
		return this.dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}

	public int getGlasovi() {
		return this.glasovi;
	}

	public void setGlasovi(int glasovi) {
		this.glasovi = glasovi;
	}

	public int getGodina() {
		return this.godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public String getIzvodjac() {
		return this.izvodjac;
	}

	public void setIzvodjac(String izvodjac) {
		this.izvodjac = izvodjac;
	}

	public int getLikes() {
		return this.likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getPravac() {
		return this.pravac;
	}

	public void setPravac(String pravac) {
		this.pravac = pravac;
	}

	public float getRatio() {
		return this.ratio;
	}

	public void setRatio(float ratio) {
		this.ratio = ratio;
	}

	public List<Tim6komentar> getTim6komentars() {
		return this.tim6komentars;
	}

	public void setTim6komentars(List<Tim6komentar> tim6komentars) {
		this.tim6komentars = tim6komentars;
	}

	public Tim6komentar addTim6komentar(Tim6komentar tim6komentar) {
		getTim6komentars().add(tim6komentar);
		tim6komentar.setTim6kompozicija(this);

		return tim6komentar;
	}

	public Tim6komentar removeTim6komentar(Tim6komentar tim6komentar) {
		getTim6komentars().remove(tim6komentar);
		tim6komentar.setTim6kompozicija(null);

		return tim6komentar;
	}

	public Tim6registrovaniKorisnik getTim6registrovaniKorisnik() {
		return this.tim6registrovaniKorisnik;
	}

	public void setTim6registrovaniKorisnik(Tim6registrovaniKorisnik tim6registrovaniKorisnik) {
		this.tim6registrovaniKorisnik = tim6registrovaniKorisnik;
	}

}