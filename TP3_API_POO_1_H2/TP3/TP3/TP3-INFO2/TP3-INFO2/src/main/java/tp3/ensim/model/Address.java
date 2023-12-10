package tp3.ensim.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Address {
	
    @Id
    @GeneratedValue
    private Long id;
    private Date creation;
    private String content;
    private String Auteur;
    
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreation() {
		return creation;
	}
	public void setCreation(Date creation) {
		this.creation = creation;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String auteur) {
		Auteur = auteur;
	}
}
