package it.morfoza;

import spark.Spark;

import java.util.function.BiFunction;

/**
 * Created by Anna Kacprzak on 2016-07-25.
 */
public class CalculatorWeb {

    public static void main(String[] args) {
        String port= System.getenv("PORT");
        if (port !=null) {
            int portInt = Integer.parseInt(port);

            Spark.port(portInt);
        }
        Spark.get("/calculator", (request, response)->
                {
                    String number1= request.queryParams("number1");
                    String number2= request.queryParams("number2");
                    int number1a=Integer.parseInt(number1);
                    int number2a=Integer.parseInt(number2);
                    int result=number1a+number2a;
                    return "<html>Hi, <b>Your numbers: " + number1 + ", " + number2 + "!"+ "result is" + result+"</html>";
                         }
        );

            Spark.get("/contact", (req, resp)-> {
                return "<html>" +
                        "<form action=\"/calculator\">" +
                        "<input name=\"number1\">"+
                        "<input name=\"number2\">"+
                        "<input type=\"submit\">"+

                    " </form>" +
                        "</html>";});
        }
}


