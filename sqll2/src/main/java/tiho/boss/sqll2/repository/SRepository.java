package tiho.boss.sqll2.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import tiho.boss.sqll2.Persons;
import java.util.List;

@Repository
public class SRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Persons> getPersonsByCity(String city) {
        return entityManager.createQuery("select p from Persons p where p.cityOfLiving = :city order by p.cityOfLiving", Persons.class)
                .setParameter("city", city)
                .getResultList();
    }
}
