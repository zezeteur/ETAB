package ci.digitalacademy.monetab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users")

public class UsersController {

    @GetMapping
    public String users(){
        return "utilisateur";
    }

}
