package com.ncedu.testing.web.test;

import com.ncedu.testing.entity.Question;
import com.ncedu.testing.entity.User;
import com.ncedu.testing.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("student/questions")
@Controller
public class TestServicesController {

    @Autowired
    QuestionService questionService;
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        List<Question> questions=null;
        try {
            questions = questionService.findAll();
        }catch (SQLException e){
            e.printStackTrace();
        }
        ArrayList<Question2> questions2 = new ArrayList<>();

        Question2 questio = new Question2(1,"Favourite programmer's drink", "Tea-Coffee-Juice", "Tea");
        questio.genAnswers();
        questions2.add(questio);
//
//        answers = new ArrayList<>();
//        answers.add("C");
//        answers.add("Java");
//        answers.add("PHP");
//        question = new Question2(2, "Best programming language", answers,"Java");
//        question2s.add(question);
        for(Question question: questions){
            Question2 question2 = new Question2(question.getId(),question.getText(),question.getOptions(),question.getcAnswer());
            question2.genAnswers();
            questions2.add(question2);
        }

        uiModel.addAttribute("questions", questions2);

        return "student/test";
    }

}
