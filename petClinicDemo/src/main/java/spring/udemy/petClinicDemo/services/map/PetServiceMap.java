package spring.udemy.petClinicDemo.services.map;

import org.springframework.stereotype.Service;
import spring.udemy.petClinicDemo.model.Pet;
import spring.udemy.petClinicDemo.services.CrudService;
import spring.udemy.petClinicDemo.services.PetService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
      super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet findByID(Long id) {
        return null;
    }
}
