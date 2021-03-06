package managers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Tim6kompozicija;

public class KompozicijaManager {
	
	public List<Tim6kompozicija> getKompozicijaNaziv(EntityManager em, String naziv) {
		TypedQuery<Tim6kompozicija> q = em.createQuery("select k from Tim6kompozicija k where k.naziv = :naz", Tim6kompozicija.class);
		q.setParameter("naz", naziv);
		List<Tim6kompozicija> kompozicije = q.getResultList();
		return kompozicije;
	}
	
	public List<Tim6kompozicija> getKompozicijaIzvodjac(EntityManager em, String izvodjac) {
		TypedQuery<Tim6kompozicija> q = em.createQuery("select k from Tim6kompozicija k where k.izvodjac = :izv", Tim6kompozicija.class);
		q.setParameter("izv", izvodjac);
		List<Tim6kompozicija> kompozicije = q.getResultList();
		return kompozicije;
	}
	
	public List<Tim6kompozicija> getKompozicijaGodina(EntityManager em, Integer godina) {
		TypedQuery<Tim6kompozicija> q = em.createQuery("select k from Tim6kompozicija k where k.godina = :god", Tim6kompozicija.class);
		q.setParameter("god", godina);
		List<Tim6kompozicija> kompozicije = q.getResultList();
		return kompozicije;
	}
	
	public List<Tim6kompozicija> getKompozicijaAlbum(EntityManager em, String album) {
		TypedQuery<Tim6kompozicija> q = em.createQuery("select k from Tim6kompozicija k where k.album = :alb", Tim6kompozicija.class);
		q.setParameter("alb", album);
		List<Tim6kompozicija> kompozicije = q.getResultList();
		return kompozicije;
	}
	
	public List<Tim6kompozicija> getKompozicijaZanr(EntityManager em, String zanr) {
		TypedQuery<Tim6kompozicija> q = em.createQuery("select k from Tim6kompozicija k where k.pravac = :znr", Tim6kompozicija.class);
		q.setParameter("znr", zanr);
		List<Tim6kompozicija> kompozicije = q.getResultList();
		return kompozicije;
	}
}
