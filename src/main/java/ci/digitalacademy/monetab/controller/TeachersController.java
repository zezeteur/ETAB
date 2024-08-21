package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("teachers")
public class TeachersController {

    @GetMapping
    public String teachers(){
        return "professeur";
    }

    @GetMapping("/add")
    public String add(){
        return "ajoutprofesseur";
    }

}
