package com.ncedu.testing.web.courses;

import com.ncedu.testing.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

/**
 * Created by ilya on 25.03.17.
 */

//@RequestMapping("student/courses")
@Controller
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "student/courses", method = RequestMethod.GET)
    public String list(Model model) {
        try {
            model.addAttribute("courses", courseService.findAll());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "student/courses";
    }

    @RequestMapping(value = "student/courses/{course_id}", method = RequestMethod.GET)
    public String showCourse(@PathVariable long course_id, Model model) {
        try {
            model.addAttribute("course", courseService.get((long) course_id));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "student/course";
    }


}
