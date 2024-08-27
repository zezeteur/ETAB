package ci.digitalacademy.monetab.controller;


import ci.digitalacademy.monetab.models.Professeur;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.ProfesseurService;
import ci.digitalacademy.monetab.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("users")
@RequiredArgsConstructor
public class UsersController {

    public final UserService userService;

    @GetMapping
    public String users(Model model){

        List<User> users = userService.findAll();
        model.addAttribute("users" , users);

        return "users/utilisateur";
    }


    @GetMapping("/add")
    public String add(){
        return "users/ajoututilisateur";
    }

    @GetMapping("/edit")
    public String edit(){
        return "users/modifutilisateur";
    }

}
