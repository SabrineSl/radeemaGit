/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Admine;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sabrine
 */
@Stateless
public class AdmineFacade extends AbstractFacade<Admine> {

    @PersistenceContext(unitName = "radeemaGitPU")
    private EntityManager em;
    public void test(){
        System.out.println("sabrine");
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdmineFacade() {
        super(Admine.class);
    }
    
    public int somme(int a, int b){
        //zaineb
        return a+b;
    }
    
}
