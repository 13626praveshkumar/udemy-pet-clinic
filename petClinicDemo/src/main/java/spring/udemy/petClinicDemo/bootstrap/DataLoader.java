package spring.udemy.petClinicDemo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.udemy.petClinicDemo.model.Owner;
import spring.udemy.petClinicDemo.model.Pet;
import spring.udemy.petClinicDemo.model.PetType;
import spring.udemy.petClinicDemo.model.Vet;
import spring.udemy.petClinicDemo.services.OwnerService;
import spring.udemy.petClinicDemo.services.PetService;
import spring.udemy.petClinicDemo.services.PetTypeService;
import spring.udemy.petClinicDemo.services.VetService;
import spring.udemy.petClinicDemo.services.map.OwnerServiceMap;
import spring.udemy.petClinicDemo.services.map.VetServiceMap;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeServiceService;

    //@Autowired      Not required for constructor from spring 4.2
    public DataLoader(OwnerService ownerService, VetService vetService,PetTypeService petTypeServiceService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeServiceService=petTypeServiceService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog=new PetType();
        dog.setName("dog");
        PetType savedDogType=petTypeServiceService.save(dog);

        PetType cat=new PetType();
        dog.setName("cat");
        PetType savedcatType=petTypeServiceService.save(dog);
        System.out.println("Loaded pettype...");


        Owner owner1=new Owner();
//        owner1.setId(1L);
        owner1.setFirstName("Pravesh");
        owner1.setLastName("Kumar");
        owner1.setFirstName("7th block");
        owner1.setCity("blr");
        owner1.setTelephone("12345678");

        Pet mikesPet=new Pet();
        mikesPet.setPetType(savedDogType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2=new Owner();
//        owner2.setId(2L);
        owner2.setFirstName("Shailesh");
        owner2.setLastName("Kumar");
        owner2.setFirstName("7th block");
        owner2.setCity("blr");
        owner2.setTelephone("12345678");
        ownerService.save(owner2);

        Owner owner3=new Owner();
//        owner3.setId(3L);
        owner3.setFirstName("Nilesh");
        owner3.setLastName("Kumar");
        ownerService.save(owner3);

        System.out.println("Owner loaded...");

        Vet vet1=new Vet();
        vet1.setFirstName("alex");
        vet1.setLastName("first");
//        vet1.setId(1L);
        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("tutu");
        vet2.setLastName("first");
//        vet2.setId(2L);
        vetService.save(vet2);
        System.out.println("Loaded vets...");





    }
}
