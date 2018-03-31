/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TrancheElectriciteItem;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sabrine
 */
@Stateless
public class TrancheElectriciteItemFacade extends AbstractFacade<TrancheElectriciteItem> {

    @PersistenceContext(unitName = "radeemaGitPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TrancheElectriciteItemFacade() {
        super(TrancheElectriciteItem.class);
    }
    
}
