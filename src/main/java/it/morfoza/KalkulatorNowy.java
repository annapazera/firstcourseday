package it.morfoza;

import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anna Kacprzak on 2016-07-28.
 */

public class KalkulatorNowy {

    public static void main(String[] args) {
        Spark.staticFileLocation("/webfiles");

        String port = System.getenv("PORT");
        if (port != null) {
            int portInt = Integer.parseInt(port);

            Spark.port(portInt);
        }
        Spark.get("/calculator", (request, response) ->
                {
                    String number1 = request.queryParams("number1");
                    String number2 = request.queryParams("number2");
                    String operation = request.queryParams("operation");
                    int number1a = Integer.parseInt(number1);
                    int number2a = Integer.parseInt(number2);
//                    int result = number1a + number2a;
                    int result;

                    if (operation.equals("dodawanie")) {
                        result = Dodawanie.addiction(number1a, number2a);
                    } else {
                        result = Dodawanie.subtraction(number1a, number2a);
                    }
                    Map<String, Object> model = new HashMap();
                    model.put("number1", number1);
                    model.put("number2", number2);
                    model.put("result", result);
                    return new ModelAndView(model, "result1.ftl");
                }, new FreeMarkerEngine()
        );

//
    }
}

