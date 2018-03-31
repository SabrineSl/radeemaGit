/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author sabrine
 */
@Entity
public class Facteur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;  
    private String nom;
    private String prenom;
    private String adresse;
    private String cin;
 
    @OneToMany(mappedBy = "facteur")
    private List<Rue> rues;
    @ManyToOne
    private Agence agence ;
    @OneToOne(mappedBy = "facteur")
    private Utilisateur utilisateur;

    public Facteur() {
    }

    public Facteur(String id) {
        this.id = id;
    }

    public Facteur(String id, String nom, String prenom, String adresse, String cin, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

  
     
    
 



    public List<Rue> getRues() {
        return rues;
    }

    public void setRues(List<Rue> rues) {
        this.rues = rues;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }
  

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facteur)) {
            return false;
        }
        Facteur other = (Facteur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Facteur{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", cin=" + cin +  '}';
    }


 

    
}
