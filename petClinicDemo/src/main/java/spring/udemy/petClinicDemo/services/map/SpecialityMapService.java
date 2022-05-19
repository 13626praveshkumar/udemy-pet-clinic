package spring.udemy.petClinicDemo.services.map;

import org.springframework.stereotype.Service;
import spring.udemy.petClinicDemo.model.Speciality;
import spring.udemy.petClinicDemo.services.SpecialityService;

import java.time.LocalDate;
import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);

    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return null;
    }
}
