/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author sabrine
 */
@Entity
public class TrancheElectriciteItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private Double tarif;
    private Double minT;
    private Double maxT;
    private Double tva;
  
    @ManyToOne
    private TrancheElectricite trancheElectricite ;
    
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getTarif() {
        return tarif;
    }

    public void setTarif(Double tarif) {
        this.tarif = tarif;
    }

    public Double getMinT() {
        return minT;
    }

    public TrancheElectriciteItem(String id) {
        this.id = id;
    }

    public TrancheElectriciteItem(String id, Double tarif, Double minT, Double maxT, Double tva) {
        this.id = id;
        this.tarif = tarif;
        this.minT = minT;
        this.maxT = maxT;
        this.tva = tva;
    }

    public TrancheElectriciteItem() {
    }

    public void setMinT(Double minT) {
        this.minT = minT;
    }

    public Double getMaxT() {
        return maxT;
    }

    public void setMaxT(Double maxT) {
        this.maxT = maxT;
    }

    

    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }

  

    public TrancheElectricite getTrancheElectricite() {
        return trancheElectricite;
    }

    public void setTrancheElectricite(TrancheElectricite trancheElectricite) {
        this.trancheElectricite = trancheElectricite;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TrancheElectriciteItem other = (TrancheElectriciteItem) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrancheElectriciteItem{" + "id=" + id + ", tarif=" + tarif + ", minT=" + minT + ", maxT=" + maxT + ", tva=" + tva + '}';
    }

   
    

    

}
