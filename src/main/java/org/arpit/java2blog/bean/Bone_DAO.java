package org.arpit.java2blog.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bone")
public class Bone_DAO{
	
	@Id
	@Column(name="idBone")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idBone;
	
	@Column(name="NumeBona")
	String nume_Bona;	
	
	@Column(name="PrenumeBona")
	String prenume_Bona;
	
	@Column(name="EmailBona")
	String email_Bona;
	
	public int getIdBone() {
		return idBone;
	}
	public void setIdBone(int idBone) {
		this.idBone = idBone;
	}
	public String getNume_Bona() {
		return nume_Bona;
	}
	public void setNume_Bona(String nume_Bona) {
		this.nume_Bona = nume_Bona;
	}
	public String getPrenume_Bona() {
		return prenume_Bona;
	}
	public void setPrenume_Bona(String prenume_Bona) {
		this.prenume_Bona = prenume_Bona;
	}
	public String getEmail_Bona() {
		return email_Bona;
	}
	public void setEmail_Bona(String email_Bona) {
		this.email_Bona = email_Bona;
	}
	
	
}