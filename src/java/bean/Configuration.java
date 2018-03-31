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
import javax.persistence.OneToMany;

/**
 *
 * @author sabrine
 */
@Entity
public class Configuration implements Serializable {



    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;               //nssawlo lprof
    private int eauLimite; 
    private int electriciteLimite;
    private int delai ;
    
    
  
        @OneToMany(mappedBy = "configuration")
    private List<FactureElectricite> factureElectricites;

    @OneToMany(mappedBy = "configuration")
    private List<FactureEau> factureEaus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEauLimite() {
        return eauLimite;
    }

    public void setEauLimite(int eauLimite) {
        this.eauLimite = eauLimite;
    }

    public int getDelai() {
        return delai;
    }

    public void setDelai(int delai) {
        this.delai = delai;
    }

    public List<FactureElectricite> getFactureElectricites() {
        return factureElectricites;
    }

    public void setFactureElectricites(List<FactureElectricite> factureElectricites) {
        this.factureElectricites = factureElectricites;
    }

    public List<FactureEau> getFactureEaus() {
        return factureEaus;
    }

    public void setFactureEaus(List<FactureEau> factureEaus) {
        this.factureEaus = factureEaus;
    }




   

    public int getElectriciteLimite() {
        return electriciteLimite;
    }

    public void setElectriciteLimite(int electriciteLimite) {
        this.electriciteLimite = electriciteLimite;
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
        if (!(object instanceof Configuration)) {
            return false;
        }
        Configuration other = (Configuration) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Configuration[ id=" + id + " ]";
    }
    
}
