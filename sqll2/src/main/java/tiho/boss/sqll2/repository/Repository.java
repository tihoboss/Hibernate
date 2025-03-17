package tiho.boss.sqll2.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import tiho.boss.sqll2.Persons;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Persons> getPersonsByCity(String city) {
        return entityManager.createQuery("select p from Persons p where p.city_of_living = :city order by p.city_of_living", Persons.class)
                .setParameter("city", city)
                .getResultList();
    }
}