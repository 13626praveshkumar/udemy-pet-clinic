package spring.udemy.petClinicDemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.udemy.petClinicDemo.model.Owner;
import spring.udemy.petClinicDemo.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    OwnerService ownerService;

    //@Autowired   not required for constructor from spring 4.2
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/","/index","/index.html"})
    public String listOwners(Model model)
    {
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }
}
