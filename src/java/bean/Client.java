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
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;//numContrat
    private String nom;
    private String type ;// 
    private String prenom;
    private String adresse;
    private String cin;
    private String tel;
    private String numCompteur;//String
    
 

    @OneToMany(mappedBy = "client")
    private List<Reclamation> reclamations;
    @OneToMany(mappedBy = "client")
    private List<Consommation> consommations;
    @OneToMany(mappedBy = "client")
    private List<FactureEau> factureEaus;
    @OneToMany(mappedBy = "client")
    private List<Paiement> paiements;
    @OneToMany(mappedBy = "client")
    private List<FactureElectricite> factureElectricites;
    @ManyToOne
    private Agence agence ;
    @OneToMany(mappedBy = "client")
    private List<Avertissemnt> avertissemnts;
    @ManyToOne
    private Rue rue ;
    @OneToOne(mappedBy = "client")
    private Utilisateur utilisateur;
    
    
    
 
    
    public Client() {
    }

    public Client(String id) {
        this.id = id;
    }

    public Client(String id, String nom, String type, String prenom, String adresse, String cin, String tel,  String numCompteur) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.prenom = prenom;
        this.adresse = adresse;
    
        this.cin = cin;
        this.tel = tel;
        this.numCompteur = numCompteur;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }



    public String getNumCompteur() {
        return numCompteur;
    }

    public void setNumCompteur(String numCompteur) {
        this.numCompteur = numCompteur;
    }

    public Rue getRue() {
        return rue;
    }

    public void setRue(Rue rue) {
        this.rue = rue;
    }

    

    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }
  


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



  

    public List<Avertissemnt> getAvertissemnts() {
        return avertissemnts;
    }

    public void setAvertissemnts(List<Avertissemnt> avertissemnts) {
        this.avertissemnts = avertissemnts;
    }



    public List<Reclamation> getReclamations() {
        return reclamations;
    }

    public void setReclamations(List<Reclamation> reclamations) {
        this.reclamations = reclamations;
    }

    public List<Consommation> getConsommations() {
        return consommations;
    }

    public void setConsommations(List<Consommation> consommations) {
        this.consommations = consommations;
    }

    public List<FactureEau> getFactureEaus() {
        return factureEaus;
    }

    public void setFactureEaus(List<FactureEau> factureEaus) {
        this.factureEaus = factureEaus;
    }

    public List<FactureElectricite> getFactureElectricites() {
        return factureElectricites;
    }

    public void setFactureElectricites(List<FactureElectricite> factureElectricites) {
        this.factureElectricites = factureElectricites;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
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
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", type=" + type + ", prenom=" + prenom + ", adresse=" + adresse +  ", cin=" + cin + ", tel=" + tel + ", numCompteur=" + numCompteur + '}';
    }


  

}
