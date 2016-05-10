package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TIM6KOMENTAR database table.
 * 
 */
@Embeddable
public class Tim6komentarPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idk;

	@Column(insertable=false, updatable=false)
	private int id;

	public Tim6komentarPK() {
	}
	public int getIdk() {
		return this.idk;
	}
	public void setIdk(int idk) {
		this.idk = idk;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Tim6komentarPK)) {
			return false;
		}
		Tim6komentarPK castOther = (Tim6komentarPK)other;
		return 
			(this.idk == castOther.idk)
			&& (this.id == castOther.id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idk;
		hash = hash * prime + this.id;
		
		return hash;
	}
}