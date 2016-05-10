package managers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Tim6zanimljivost;

public class ZanimljivostManager {
	
	public List<Tim6zanimljivost> getZanimljivosti(EntityManager em) {
		TypedQuery<Tim6zanimljivost> q = em.createQuery("select z from Tim6zanimljivost z", Tim6zanimljivost.class);
		return q.getResultList();
	}
}
