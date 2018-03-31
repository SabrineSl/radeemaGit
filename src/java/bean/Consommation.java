/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author sabrine
 */
@Entity
public class Consommation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int mois ;
    private int annee;
    private int difference ;// int 
    private String type ;//eau/electricite
    private int ancienIndex ;
    private int nvIndex ;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateControl ;
  
    
    @ManyToOne
    private Client client ;
    


    public Consommation() {
    }

    public Consommation(Long id) {
        this.id = id;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public Date getDateControl() {
        return dateControl;
    }

    public void setDateControl(Date dateControl) {
        this.dateControl = dateControl;
    }
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }



    public int getAncienIndex() {
        return ancienIndex;
    }

    public void setAncienIndex(int ancienIndex) {
        this.ancienIndex = ancienIndex;
    }

    public int getNvIndex() {
        return nvIndex;
    }

    public void setNvIndex(int nvIndex) {
        this.nvIndex = nvIndex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
        if (!(object instanceof Consommation)) {
            return false;
        }
        Consommation other = (Consommation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Consommation{" + "id=" + id + ", mois=" + mois + ", annee=" + annee + ", difference=" + difference + ", type=" + type + ", ancienIndex=" + ancienIndex + ", nvIndex=" + nvIndex + ", dateControl=" + dateControl + '}';
    }


 
 

}
