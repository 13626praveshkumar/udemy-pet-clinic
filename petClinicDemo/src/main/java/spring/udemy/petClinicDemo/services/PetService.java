package spring.udemy.petClinicDemo.services;

import spring.udemy.petClinicDemo.model.Owner;
import spring.udemy.petClinicDemo.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findByID(Long id);
    Pet save(Pet Pet);
    Set<Pet> findAll();
}
