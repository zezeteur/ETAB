package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Eleve;
import ci.digitalacademy.monetab.models.Professeur;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.EleveService;
import ci.digitalacademy.monetab.services.ProfesseurService;
import ci.digitalacademy.monetab.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("home")
@RequiredArgsConstructor
public class HomeController {

    public final EleveService eleveService;
    public final ProfesseurService professeurService;
    public final UserService userService;

    @GetMapping
    public String home(Model model){

        List<Eleve> eleves = eleveService.findAll();
        model.addAttribute("eleves" , eleves);

        List<Professeur> professeurs = professeurService.findAll();
        model.addAttribute("professeurs" , professeurs);

        List<User> users = userService.findAll();
        model.addAttribute("users" , users);

        return "home/index";
    }
}