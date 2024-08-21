package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentsController {

    @GetMapping
    public String students(){
        return "eleve";
    }

    @GetMapping("/add")
    public String add(){
    return "ajouteleve";
    }


}
