/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author sabrine
 */
@Entity
public class TrancheElectricite implements Serializable {
   
  
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateTranche;
 @OneToMany(mappedBy = "trancheElectricite")
    private List<TrancheElectriciteItem> trancheElectriciteItems;
    @OneToOne
    private Consommation consommation;

    public TrancheElectricite() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateTranche() {
        return dateTranche;
    }

    public void setDateTranche(Date dateTranche) {
        this.dateTranche = dateTranche;
    }

    public List<TrancheElectriciteItem> getTrancheElectriciteItems() {
        return trancheElectriciteItems;
    }

    public void setTrancheElectriciteItems(List<TrancheElectriciteItem> trancheElectriciteItems) {
        this.trancheElectriciteItems = trancheElectriciteItems;
    }

    public Consommation getConsommation() {
        return consommation;
    }

    public void setConsommation(Consommation consommation) {
        this.consommation = consommation;
    }



    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.id);
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
        final TrancheElectricite other = (TrancheElectricite) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrancheElectricite{" + "id=" + id + ", dateTranche=" + dateTranche + '}';
    }
    
    
   
}
