package tp.ensim.TP3INFO2.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*comme je suis sur MySQL je suis obligé d'ajouter 
cette ligne pour spécifier le nom de ma table*/
@Table(name = "address")
public class Address {
    @Id
	/*Celà me permet de générer et d'inserer 
	mes valeurs dans ma base de donnée*/
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Date creation;
    private String content;
    private String auteur;
    
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
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
}
