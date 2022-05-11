package spring.udemy.petClinicDemo.services.map;

import org.springframework.stereotype.Service;
import spring.udemy.petClinicDemo.model.Vet;
import spring.udemy.petClinicDemo.services.CrudService;
import spring.udemy.petClinicDemo.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
       super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet findByID(Long id) {
        return null;
    }
}
