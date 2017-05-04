package com.ncedu.testing.web.courses;

import com.ncedu.testing.entity.Question;
import com.ncedu.testing.entity.Result;
import com.ncedu.testing.entity.User;
import com.ncedu.testing.service.TestService;
import com.ncedu.testing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * Created by ilya on 25.03.17.
 */

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "student/test/{test_id}", method = RequestMethod.GET)
    public String showTest(@PathVariable long test_id, Model model) {
        try {
            model.addAttribute("questions", testService.get(test_id).getQuestionList());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "student/test";
    }

    @RequestMapping(value = "student/test/{test_id}", method = RequestMethod.POST)
    public String post(@PathVariable long test_id, HttpServletRequest request, Model model) {
        String result;
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        User user = userService.getUserByName(name);
        Result res = new Result();
        try {
            res.setTest(testService.get(test_id));
            res.setUser(user);
            res.setPoints(0.0);
            for(Question question : testService.get(test_id).getQuestionList()){
                result = request.getParameter(String.valueOf(question.getId()));
                System.out.println("\n\nResult: " + result);
                if(question.getcAnswer().equals(result)){
                    res.addPoints(1.0);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(res.getPoints());

        try {
            model.addAttribute("questions", testService.get(test_id).getQuestionList());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "student/test";
    }


}
