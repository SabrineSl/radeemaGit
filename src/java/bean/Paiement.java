/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author sabrine
 */
@Entity
public class Paiement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double montantHt;
    private Double montantTHt;
    private Double montantTotalTva;
    private Double montantTtc;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePaiement;
    private int objet;//eau /electricite
    private int type;//exact /estimer
    private int etat; //(is paid)
    @ManyToOne
    private Client client;
    @OneToOne
    private Consommation consommation;

    @OneToOne
    private FactureEau factureEau;
    @ManyToOne
    private TrancheEau trancheEau;
    @ManyToOne
    private TrancheElectricite trancheElectricite;

    @OneToOne
    private FactureElectricite factureElectricite;
    @OneToMany(mappedBy = "paiement")
    private List<Avertissemnt> avertissemnts;
    @OneToMany(mappedBy = "paiement")
    private List<PaiementItem> paiementItems;

    public Paiement() {
    }

    public Paiement(Long id) {
        this.id = id;
    }

    public Paiement(Long id, Double montantHt, Double montantTHt, Double montantTotalTva, Double montantTtc, Date datePaiement, int objet, int type, int etat) {
        this.id = id;
        this.montantHt = montantHt;
        this.montantTHt = montantTHt;
        this.montantTotalTva = montantTotalTva;
        this.montantTtc = montantTtc;
        this.datePaiement = datePaiement;
        this.objet = objet;
        this.type = type;
        this.etat = etat;
    }

    public Double getMontantTHt() {
        return montantTHt;
    }

    public void setMontantTHt(Double montantTHt) {
        this.montantTHt = montantTHt;
    }

    public Double getMontantTotalTva() {
        return montantTotalTva;
    }

    public void setMontantTotalTva(Double montantTotalTva) {
        this.montantTotalTva = montantTotalTva;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public Consommation getConsommation() {
        return consommation;
    }

    public void setConsommation(Consommation consommation) {
        this.consommation = consommation;
    }

    public TrancheEau getTrancheEau() {
        return trancheEau;
    }

    public void setTrancheEau(TrancheEau trancheEau) {
        this.trancheEau = trancheEau;
    }

    public TrancheElectricite getTrancheElectricite() {
        return trancheElectricite;
    }

    public void setTrancheElectricite(TrancheElectricite trancheElectricite) {
        this.trancheElectricite = trancheElectricite;
    }

    public List<PaiementItem> getPaiementItems() {
        return paiementItems;
    }

    public void setPaiementItems(List<PaiementItem> paiementItems) {
        this.paiementItems = paiementItems;
    }
    

    public Client getClient() {
        return client;
    }

    public Double getMontantHt() {
        return montantHt;
    }

    public void setMontantHt(Double montantHt) {
        this.montantHt = montantHt;
    }

    public Double getMontantTtc() {
        return montantTtc;
    }

    public void setMontantTtc(Double montantTtc) {
        this.montantTtc = montantTtc;
    }

    public int getObjet() {
        return objet;
    }

    public void setObjet(int objet) {
        this.objet = objet;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Avertissemnt> getAvertissemnts() {
        return avertissemnts;
    }

    public void setAvertissemnts(List<Avertissemnt> avertissemnts) {
        this.avertissemnts = avertissemnts;
    }

    public FactureEau getFactureEau() {
        return factureEau;
    }

    public void setFactureEau(FactureEau factureEau) {
        this.factureEau = factureEau;
    }

    public FactureElectricite getFactureElectricite() {
        return factureElectricite;
    }

    public void setFactureElectricite(FactureElectricite factureElectricite) {
        this.factureElectricite = factureElectricite;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public Paiement(Long id, Date datePaiement) {
        this.id = id;
        this.datePaiement = datePaiement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (!(object instanceof Paiement)) {
            return false;
        }
        Paiement other = (Paiement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paiement{" + "id=" + id + ", montantHt=" + montantHt + ", montantTHt=" + montantTHt + ", montantTotalTva=" + montantTotalTva + ", montantTtc=" + montantTtc + ", datePaiement=" + datePaiement + ", objet=" + objet + ", type=" + type + ", etat=" + etat + '}';
    }
    

}
