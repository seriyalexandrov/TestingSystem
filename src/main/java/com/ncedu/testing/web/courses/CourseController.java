package com.ncedu.testing.web.courses;

import com.ncedu.testing.entity.User;
import com.ncedu.testing.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;

/**
 * Created by ilya on 25.03.17.
 */

@RequestMapping("student/courses")
@Controller
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        try {
            model.addAttribute("courses", courseService.findAll());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "student/courses";
    }


}
