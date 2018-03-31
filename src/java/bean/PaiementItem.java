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
import javax.persistence.OneToOne;

/**
 *
 * @author sabrine
 */
@Entity
public class PaiementItem implements Serializable {



    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double montant;
    private  Double montantHt ;
  
    @ManyToOne
   private Paiement paiement;
  
   
 
    

    public PaiementItem() {
    }

    public PaiementItem(Long id) {
        this.id = id;
    }

    public PaiementItem(Long id, Double montant, Double montantHt) {
        this.id = id;
        this.montant = montant;
        this.montantHt = montantHt;
    }

    
     
        

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Double getMontantHt() {
        return montantHt;
    }

    public void setMontantHt(Double montantHt) {
        this.montantHt = montantHt;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
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
        if (!(object instanceof PaiementItem)) {
            return false;
        }
        PaiementItem other = (PaiementItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaiementItem{" + "id=" + id + ", montant=" + montant + ", montantHt=" + montantHt + '}';
    }

 
    
}
