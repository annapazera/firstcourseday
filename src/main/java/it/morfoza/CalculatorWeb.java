package it.morfoza;

import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Created by Anna Kacprzak on 2016-07-25.
 */
public class CalculatorWeb {

    public static void main(String[] args) {

        Spark.staticFileLocation("/webfiles");

        String port= System.getenv("PORT");
        if (port !=null) {
            int portInt = Integer.parseInt(port);

            Spark.port(portInt);
        }
        Spark.port(80);
        Spark.get("/tutoriale1", (request, response)->
                {
                    String name = request.queryParams("name");
                    String surname = request.queryParams("surname");
                    String PESEL = request.queryParams("PESEL");
//            int number1a = Integer.parseInt(number1);
//            int number2a = Integer.parseInt(number2);
//            int result = number1a + number2a;


            Map<String, Object> model = new HashMap();
            model.put("name", name);
            model.put("surname", surname);
            model.put("PESEL", PESEL);

            return new ModelAndView(model, "result1.ftl");
        }, new FreeMarkerEngine()


        );

//            Spark.get("/tutoriale2", (request, response)-> {
//                return " <html>"+
//                        "<form action=\"/tutoriale1\">" +
//                        "<input name=\"name\">"+
//                        "<input name=\"surname\">"+
//                        "<input name=\"PESEL\">"+
//                        "<input type=\"submit\">"+
//
//                    " </form>" +
//                        "</html>";});
        }
}


