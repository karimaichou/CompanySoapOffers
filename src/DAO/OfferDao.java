package DAO;

import Entities.Offer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by karima on 11/01/2017.
 */
public class OfferDao {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("search");
    private EntityManager em = emf.createEntityManager();

    public Offer findById(int id)
    {
        em.getTransaction().begin();
        return (Offer) em.find(Offer.class,id);
    }

    public ArrayList<Offer> findAll()
    {
        em.getTransaction().begin();
        try
        {
            String req="select a from Offer a ";
            TypedQuery<Offer> query = em.createQuery(req, Offer.class);
            return (ArrayList)query.getResultList();

        }catch(Exception e)
        {
            return null;
        }
    }

    public ArrayList<Offer> findByKeyword(String keyword)
    {
        em.getTransaction().begin();
        try
        {
            String req="select a from Offer a where (LOWER(a.title) LIKE LOWER(CONCAT('%',:word, '%')) OR LOWER(a.description) LIKE LOWER(CONCAT('%',:word, '%')))";
            TypedQuery<Offer> query = em.createQuery(req, Offer.class);
            query.setParameter("word", keyword);
            return (ArrayList)query.getResultList();

        }catch(Exception e)
        {
            return null;
        }

    }
}
