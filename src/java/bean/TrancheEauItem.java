/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
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
public class TrancheEauItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private Double tarif;
    private Double minTranche;
    private Double maxTranche;
    private Double tva;
   
    
    @ManyToOne
    private TrancheEau trancheEau;
    

    public String getId() {
        return id;
    }

    public TrancheEauItem() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public TrancheEauItem(String id, Double tarif, Double minTranche, Double maxTranche, Double tva) {
        this.id = id;
        this.tarif = tarif;
        this.minTranche = minTranche;
        this.maxTranche = maxTranche;
        this.tva = tva;
    }
    

    public Double getTarif() {
        return tarif;
    }

    public void setTarif(Double tarif) {
        this.tarif = tarif;
    }

    public Double getMinTranche() {
        return minTranche;
    }

    public void setMinTranche(Double minTranche) {
        this.minTranche = minTranche;
    }

    public Double getMaxTranche() {
        return maxTranche;
    }

    public void setMaxTranche(Double maxTranche) {
        this.maxTranche = maxTranche;
    }

    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }
   



    public TrancheEau getTrancheEau() {
        return trancheEau;
    }

    public void setTrancheEau(TrancheEau trancheEau) {
        this.trancheEau = trancheEau;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final TrancheEauItem other = (TrancheEauItem) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrancheEauItem{" + "id=" + id + ", tarif=" + tarif + ", minTranche=" + minTranche + ", maxTranche=" + maxTranche + ", tva=" + tva + '}';
    }



   
 
}
