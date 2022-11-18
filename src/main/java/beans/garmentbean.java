/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package beans;

import entities.Category;
import entities.Garments;
import entities.TblOrder;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author c computer
 */
@Stateless
public class garmentbean {
    @PersistenceContext(unitName = "garmentdbpu")
    EntityManager em;
    
    public Collection<Category> getCategory(){
        return em.createNamedQuery("Category.findAll").getResultList();
    }
    
    public Collection<Garments> getGarmentsByCatId(Integer catid){
        return em.createNamedQuery("Garments.findByCatId").setParameter("catid", catid).getResultList();
    }
    
    public Collection<TblOrder> getOrders(){
        return em.createNamedQuery("TblOrder.findAll").getResultList();
    }
}
