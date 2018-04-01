/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Secteur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sabrine
 */
@Stateless
public class SecteurFacade extends AbstractFacade<Secteur> {

    @PersistenceContext(unitName = "radeemaGitPU")
    private EntityManager em;

    public int createSecteur(Long id, String nom) {
        Secteur secteur = new Secteur();
        secteur.setId(id);
        secteur.setNom(nom);
        return 1;
    }

    public Secteur Clone(Secteur secteur) {
        Secteur secteurClone = new Secteur();
        secteurClone.setId(secteur.getId());
        secteurClone.setNom(secteur.getNom());
        return secteurClone;
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SecteurFacade() {
        super(Secteur.class);
    }

}
