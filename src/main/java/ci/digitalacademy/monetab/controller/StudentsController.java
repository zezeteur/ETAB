package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Eleve;
import ci.digitalacademy.monetab.services.EleveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentsController {

    public final EleveService eleveService;

    @GetMapping
    public String students(Model model){

        List<Eleve> eleves = eleveService.findAll();
        model.addAttribute("eleves" , eleves);

        return "students/eleve";
    }

    @GetMapping("/add")
    public String add(){
    return "students/ajouteleve";
    }


    @GetMapping("/edit")
    public String edit(){
        return "students/modifeleve";
    }


}
