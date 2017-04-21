package com.ncedu.testing.web.test;

import com.ncedu.testing.entity.Question;
import com.ncedu.testing.entity.Result;
import com.ncedu.testing.entity.User;
import com.ncedu.testing.service.QuestionService;
import com.ncedu.testing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("student/questions")
@Controller
public class TestServicesController {
    List<Question> questions=null;
    ArrayList<Question2> questions2 = new ArrayList<>();

    @Autowired
    QuestionService questionService;
    UserService userService;
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        try {
            questions = questionService.findAll();
        }catch (SQLException e){
            e.printStackTrace();
        }
        Question2 questio = new Question2(0,"Favourite programmer's drink", "Tea-Coffee-Juice", "Tea");
        questio.genAnswers();
        questions2.add(questio);
        System.out.println(userService.get(Long.valueOf(1)).getName());
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

    @RequestMapping(method = RequestMethod.POST)
    public String post(HttpServletRequest request) {
        ArrayList<String> results = new ArrayList<>();
        Question question=null;
        String result;
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

//        Result res = new Result();
//        try {
//            res.setTest(questionService.get(questions2.get(0).getId()).getTest());
//            res.setUser(user);
//            res.setPoints(0.0);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        for(Question2 question2 : questions2){
//            result = request.getParameter(String.valueOf(question2.getId()));
//            System.out.println("\n\nResult: " + result);
//            if(question2.getcAnswer().equals(result)){
//                res.addPoints(1.0);
//            }
//
//        }
//        System.out.println(res.getPoints());
        return "student/test";
    }

}
