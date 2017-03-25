package com.ncedu.testing.web.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@RequestMapping("student/questions")
@Controller
public class TestServicesController {


    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {

        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<String> answers = new ArrayList<>();

        answers.add("Coffee");
        answers.add("Tea");
        answers.add("Smoothie");
        Question question = new Question(1,"Favourite programmer's drink", answers);
        questions.add(question);

        answers = new ArrayList<>();
        answers.add("C");
        answers.add("Java");
        answers.add("PHP");
        question = new Question(2, "Best programming language", answers);
        questions.add(question);
        uiModel.addAttribute("questions", questions);

        return "student/test";
    }
}
