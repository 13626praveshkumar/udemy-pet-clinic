package spring.udemy.petClinicDemo.services.map;

import org.springframework.stereotype.Service;
import spring.udemy.petClinicDemo.model.Speciality;
import spring.udemy.petClinicDemo.model.Vet;
import spring.udemy.petClinicDemo.services.CrudService;
import spring.udemy.petClinicDemo.services.SpecialityService;
import spring.udemy.petClinicDemo.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
   private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

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
        if(object.getSpecialities().size()>0)
        {
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId()==null)
                {
                    Speciality savedSpeciality1=specialityService.save(speciality);
                    speciality.setId(savedSpeciality1.getId());
                }
            });
        }

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
