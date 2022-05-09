package spring.udemy.petClinicDemo.services;

import spring.udemy.petClinicDemo.model.Owner;
import spring.udemy.petClinicDemo.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet,Long> {
    Pet findByID(Long id);

}
