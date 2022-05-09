package spring.udemy.petClinicDemo.services;

import spring.udemy.petClinicDemo.model.Pet;
import spring.udemy.petClinicDemo.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByID(Long id);
    Vet save(Vet Pet);
    Set<Vet> findAll();
}
