package com.ncedu.testing.testServices;

import com.ncedu.testing.example.Value;
import com.ncedu.testing.example.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/questions")
@Controller
public class testServicesController {

    private ValueService valueService;
    ArrayList<Question> questions = new ArrayList<>();
    ArrayList<String> answers = new ArrayList<>();


    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {

        answers.add("1");
        answers.add("2");
        Question question = new Question("123",answers );
        questions.add(question);
        uiModel.addAttribute("questions", questions);

        return "questions/test";
    }

    @Autowired
    public void setValueService(ValueService valueService) {
        this.valueService = valueService;
    }
}
