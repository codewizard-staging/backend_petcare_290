package com.app.petcare.repository;

import com.app.petcare.model.PetService;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PetServiceRepository extends SimpleJpaRepository<PetService, String> {
    private final EntityManager em;
    public PetServiceRepository(EntityManager em) {
        super(PetService.class, em);
        this.em = em;
    }
    @Override
    public List<PetService> findAll() {
        return em.createNativeQuery("Select * from \"petcare_089\".\"PetService\"", PetService.class).getResultList();
    }
}