package it.morfoza;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spark.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anna Kacprzak on 2016-08-09.
 */@Controller

public class CalculatorController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/form")
    public String form(){
        return "calculator_form";
    }

    @RequestMapping("/calculator")
    public String calculator(@RequestParam(value = "number1", required = true) Integer number1,
                           @RequestParam(value = "number2", required = true) Integer number2,
                           @RequestParam(value = "operation", required = false, defaultValue = "dodawanie") String operation, Model model) {

//        int number1a = Integer.parseInt(number1);
//        int number2a = Integer.parseInt(number2);
//                    int result = number1a + number2a;
        int result;

        if (operation.equals("dodawanie")) {
            result = Dodawanie.addiction(number1, number2);
        } else {
            result = Dodawanie.subtraction(number1, number2);
        }
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("result", result);

        return "result";
//        Map<String, Object> model = new HashMap();
//        model.put("number1", number1);
//        model.put("number2", number2);
//        model.put("result", result);
//        return new ModelAndView(model, "result1.ftl");

    }

}
