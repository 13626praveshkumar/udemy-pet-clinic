package spring.udemy.petClinicDemo.services;

import spring.udemy.petClinicDemo.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {
   Owner findByLastName(String lastName);

}
