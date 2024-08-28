package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UsersController {

    public final UserService userService;

    @GetMapping
    public String showUsersList(Model model){
        log.debug("Request to show users list");
        List<User> users = userService.findAll();
        model.addAttribute("users" , users);

        return "users/list";
    }

    @PostMapping
    public String saveUser(User user){
        log.debug("Request to save user :{}", user);
        userService.save(user);

        return "redirect:/users";
    }

    @GetMapping("/{id}")
    public String showUpdateUserForms(Model model, @PathVariable Long id){
        log.debug("Request to show update user forms");
        Optional<User> user = userService.findOne(id);

        if (user.isPresent()){
            model.addAttribute("user" , user.get());
            return "users/forms";
        } else {
            return "redirect:/users";
        }
    }

    @GetMapping("/add")
    public String showAddUserForms(Model model){
        log.debug("Request to show add user forms");
        model.addAttribute("user", new User());
        return "users/forms";
    }
}
