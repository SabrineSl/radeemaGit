/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author sabrine
 */
@Entity
public class Rue implements Serializable {

  

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    @ManyToOne
    private Qartier qartier;
    @ManyToOne
    private Facteur facteur;
    @ManyToOne
   private Controleur controleur;
    @OneToMany(mappedBy = "rue")
    private List<Client> clients;

    public Rue() {
    }

    public Rue(Long id) {
        this.id = id;
    }

    public Rue(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Qartier getQartier() {
        return qartier;
    }

    public void setQartier(Qartier qartier) {
        this.qartier = qartier;
    }

    public Controleur getControleur() {
        return controleur;
    }

    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }


  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public Facteur getFacteur() {
        return facteur;
    }

    public void setFacteur(Facteur facteur) {
        this.facteur = facteur;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rue)) {
            return false;
        }
        Rue other = (Rue) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rue{" + "id=" + id + ", nom=" + nom + '}';
    }

  
}
