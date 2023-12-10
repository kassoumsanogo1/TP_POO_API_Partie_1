package tp.ensim.TP3INFO2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tp.ensim.TP3INFO2.model.AdresseRepository;

@Controller
public class AddressController {

    @Autowired
    AdresseRepository addresseRepository;

    @GetMapping("/addresses")
    public String showAddresses(Model model) {
        model.addAttribute("allAddresses", addresseRepository.findAll());
        return "addresses";
    }
    
}
