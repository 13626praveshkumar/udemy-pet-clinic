package spring.udemy.petClinicDemo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.udemy.petClinicDemo.model.Owner;
import spring.udemy.petClinicDemo.model.Vet;
import spring.udemy.petClinicDemo.services.OwnerService;
import spring.udemy.petClinicDemo.services.VetService;
import spring.udemy.petClinicDemo.services.map.OwnerServiceMap;
import spring.udemy.petClinicDemo.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService=new OwnerServiceMap();
        vetService=new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Pravesh");
        owner1.setLastName("Kumar");
        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setId(2L);
        owner1.setFirstName("Shailesh");
        owner1.setLastName("Kumar");
        ownerService.save(owner2);
        System.out.println("Owner loaded...");

        Vet vet1=new Vet();
        vet1.setFirstName("alex");
        vet1.setLastName("first");
        vet1.setId(1L);
        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("tutu");
        vet2.setLastName("first");
        vet2.setId(2L);
        vetService.save(vet2);
        System.out.println("Loaded vets...");
    }
}
