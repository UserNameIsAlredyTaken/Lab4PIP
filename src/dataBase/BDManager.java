package dataBase;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by danil on 24.10.2017.
 */
public class BDManager {
    public EntityManager em = Persistence.createEntityManagerFactory("NewPersistenceUnit").createEntityManager();
    public PersonEntity add(PersonEntity pe){
        em.getTransaction().begin();
        PersonEntity peFromBd = em.merge(pe);
        em.getTransaction().commit();
        return peFromBd;
    }
}
