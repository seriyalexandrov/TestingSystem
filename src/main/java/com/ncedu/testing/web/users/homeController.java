package com.ncedu.testing.web.users;

import com.ncedu.testing.entity.User;
import com.ncedu.testing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("user")
public class homeController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model, @ModelAttribute User user) {
        model.addAttribute("userGrid", userService.findAll());
        return "user";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(Model model, User user, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("userGrid", userService.findAll());
            return "user";
        }
        PasswordEncoder passwordEncoder = new StandardPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.save(user);

        return "redirect:user";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        return "home";
    }


}
