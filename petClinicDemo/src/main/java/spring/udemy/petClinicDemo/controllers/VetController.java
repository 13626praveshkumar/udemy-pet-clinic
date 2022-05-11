package spring.udemy.petClinicDemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.udemy.petClinicDemo.services.VetService;

@Controller
public class VetController {
    VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(Model model)
    {
       model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
