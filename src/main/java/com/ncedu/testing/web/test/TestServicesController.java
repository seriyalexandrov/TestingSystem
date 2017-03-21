package com.ncedu.testing.web.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@RequestMapping("student/questions")
@Controller
public class TestServicesController {

    ArrayList<Question> questions = new ArrayList<>();
    ArrayList<String> answers = new ArrayList<>();


    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {

        answers.add("1");
        answers.add("2");
        Question question = new Question("123",answers );
        questions.add(question);
        uiModel.addAttribute("questions", questions);

        return "student/test";
    }
}
