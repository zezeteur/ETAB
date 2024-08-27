package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Eleve;
import ci.digitalacademy.monetab.models.Professeur;
import ci.digitalacademy.monetab.services.EleveService;
import ci.digitalacademy.monetab.services.ProfesseurService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("teachers")
@RequiredArgsConstructor
public class TeachersController {

    public final ProfesseurService professeurService;


    @GetMapping
    public String Teachers(Model model){

        List<Professeur> professeurs = professeurService.findAll();
        model.addAttribute("professeurs" , professeurs);

        return "teachers/professeur";
    }


    @GetMapping("/add")
    public String add(){
        return "teachers/ajoutprofesseur";
    }

    @GetMapping("/edit")
    public String edit(){
        return "teachers/modifprofesseur";
    }

}
