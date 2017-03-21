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
@RequestMapping("admin/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model, @ModelAttribute User user) {
        model.addAttribute("userGrid", userService.findAll());
        return "admin/user";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(Model model, User user, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("userGrid", userService.findAll());
            return "admin/user";
        }
        PasswordEncoder passwordEncoder = new StandardPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.save(user);

        return "redirect:user";
    }
}
