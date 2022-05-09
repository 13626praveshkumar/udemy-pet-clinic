package spring.udemy.petClinicDemo.services;

import spring.udemy.petClinicDemo.model.Pet;
import spring.udemy.petClinicDemo.model.Vet;

import java.util.Set;

public interface VetService  extends CrudService<Vet,Long>{
    Vet findByID(Long id);

}
