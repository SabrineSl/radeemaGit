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
import javax.persistence.OneToMany;

/**
 *
 * @author sabrine
 */
@Entity
public class Agence implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String nom;
    private String adresse;
    private Long tel;
    @OneToMany(mappedBy = "agence")
    private List<Reclamation> reclamations;
    @OneToMany(mappedBy = "agence")
    private List<FactureEau> factureEaus;
    @OneToMany(mappedBy = "agence")
    private List<FactureElectricite> factureElectricites;
    @OneToMany(mappedBy = "agence")
    private List<Client> clients;
    @OneToMany(mappedBy = "agence")
    private List<Employe> employes;
    @OneToMany(mappedBy = "agence")
    private List<Facteur> facteurs;
    @OneToMany(mappedBy = "agence")
    private List<Controleur> controleurs;

    public Agence() {
    }

    public Agence(String id) {
        this.id = id;
    }

    public Agence(String id, String nom, String adresse, Long tel) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
    }

    public List<Facteur> getFacteurs() {
        return facteurs;
    }

    public void setFacteurs(List<Facteur> facteurs) {
        this.facteurs = facteurs;
    }

    public List<Controleur> getControleurs() {
        return controleurs;
    }

    public void setControleurs(List<Controleur> controleurs) {
        this.controleurs = controleurs;
    }
    
    

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
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
    

    public List<Reclamation> getReclamations() {
        return reclamations;
    }

    public void setReclamations(List<Reclamation> reclamations) {
        this.reclamations = reclamations;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
    
    

    public String getNom() {
        return nom;
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

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        if (!(object instanceof Agence)) {
            return false;
        }
        Agence other = (Agence) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agence{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", tel=" + tel + '}';
    }



 
}
