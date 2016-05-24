package managers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import model.Tim6registrovaniKorisnik;

public class Tim6korisnikManager {
	public static Tim6registrovaniKorisnik login(String username, String password) {

		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		//em.getTransaction().begin();
		try {
			
		TypedQuery<Tim6registrovaniKorisnik> tq = em.createQuery("SELECT k FROM Tim6registrovaniKorisnik k WHERE k.username = :username "
				+ "AND k.password = :password", Tim6registrovaniKorisnik.class);
		tq.setParameter("username", username);	
		tq.setParameter("password", password);
		Tim6registrovaniKorisnik k = tq.getSingleResult();
		return k;
		}catch (NoResultException nre) {
			System.out.println("Nema korisnika");
			return null;
		} catch (Exception ex) {
			System.out.println(" Greska u logovanju");
			ex.printStackTrace();
			if (et.isActive()) {
				et.rollback();
			}
			return null;
	} finally {
		em.close();
	}

}
}
