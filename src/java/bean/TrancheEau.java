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
public class TrancheEau implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id; //String
    @Temporal(javax.persistence.TemporalType.DATE)
    private  Date dateTranche;
    @OneToMany(mappedBy = "trancheEau")
    private List<TrancheEauItem> trancheEauItems;
  @OneToOne
    private Consommation consommation;

    public TrancheEau() {
    }

    public TrancheEau(String id) {
        this.id = id;
    }

    public TrancheEau(String id, Date dateTranche) {
        this.id = id;
        this.dateTranche = dateTranche;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Consommation getConsommation() {
        return consommation;
    }

    public void setConsommation(Consommation consommation) {
        this.consommation = consommation;
    }

  


    public Date getDateTranche() {
        return dateTranche;
    }

    public void setDateTranche(Date dateTranche) {
        this.dateTranche = dateTranche;
    }

    public List<TrancheEauItem> getTrancheEauItems() {
        return trancheEauItems;
    }

    public void setTrancheEauItems(List<TrancheEauItem> trancheEauItems) {
        this.trancheEauItems = trancheEauItems;
    }



    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final TrancheEau other = (TrancheEau) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrancheEau{" + "id=" + id + ", dateTranche=" + dateTranche + '}';
    }

  
   
   

    
   

   
    
}
