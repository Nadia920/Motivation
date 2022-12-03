package by.bsuir.management.controller;

import by.bsuir.management.models.Employees;
import by.bsuir.management.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/")
@RestController
public class HomeController {
    @Autowired
    private EmployeesService employeesService;

    public HomeController() {
    }

    public HomeController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping(value = "/home")
    public String getHomeView(Model model, @AuthenticationPrincipal UserDetails currentUser) {
        model.addAttribute("id", currentUser.getUsername());
        return "home/home";
    }

    @GetMapping(value = "/")
    public String index(Model model) {
        return "index";

    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @GetMapping("/registration")
    public String getSignUpView(Model model) {
        model.addAttribute("user", new Employees());
        return "registration";
    }

    @PostMapping(path = "/registration")
    public String registrationClient(@Valid @ModelAttribute("user") Employees client,
                                     BindingResult result,
                                     Model model) {
        try {
            employeesService.save(client, "ROLE_USER");
            Employees user = new Employees();
            return "redirect:/";
        } catch (Exception e) {
            model.addAttribute("user", client);
            return "registration";
        }

    }
}
