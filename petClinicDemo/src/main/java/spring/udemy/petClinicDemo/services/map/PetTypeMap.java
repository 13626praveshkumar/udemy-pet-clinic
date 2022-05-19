package spring.udemy.petClinicDemo.services.map;

import org.springframework.stereotype.Service;
import spring.udemy.petClinicDemo.model.PetType;
import spring.udemy.petClinicDemo.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeMap extends AbstractMapService<PetType,Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);

    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
