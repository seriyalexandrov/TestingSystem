package com.ncedu.testing.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/values")
@Controller
public class ValueController {

    private ValueService valueService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {

        List<Value> values = valueService.findAll();
        uiModel.addAttribute("values", values);

        return "values/list";
    }

    @Autowired
    public void setValueService(ValueService valueService) {
        this.valueService = valueService;
    }
}
