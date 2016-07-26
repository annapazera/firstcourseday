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
        Spark.get("/calculator", (req, resp)-> {return "<html>Hi <b>Congratulations to all!</b> </html>";}
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


