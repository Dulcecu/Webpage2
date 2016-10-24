/**
 * Created by Turpitude on 20/10/2016.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="Fibonacci")

public class Fibonacci extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

        Float operador1= Float.parseFloat(request.getParameter("operador1"));
        Float operador2=Float.parseFloat(request.getParameter("operador2"));
        String operacion=request.getParameter("operacion");
        ServletOutputStream out =response.getOutputStream();
        double sol=0;
        if("SUMA".equals(operacion)){
            sol=operador1+operador2;
            out.print("<html><link href=\"http://localhost:8080/site.css\" rel=\"stylesheet\"><body><h1>LA "+operacion+" DA: "+sol+"</h1></body></html>");
        }
        if("RESTA".equals(operacion)){
            sol=operador1-operador2;
            out.print("<html><link href=\"http://localhost:8080/site.css\" rel=\"stylesheet\"><body><h1>LA "+operacion+" DA: "+sol+"</h1></body></html>");
        }
        if("MULTIPLICACION".equals(operacion)){
            sol=operador1*operador2;
            out.print("<html><link href=\"http://localhost:8080/site.css\" rel=\"stylesheet\"><body><h1>LA "+operacion+" DA: "+sol+"</h1></body></html>");
        }
        if("DIVISION".equals(operacion)){
            sol=operador1/operador2;
            out.print("<html><link href=\"http://localhost:8080/site.css\" rel=\"stylesheet\"><body><h1>LA "+operacion+" DA: "+sol+"</h1></body></html>");
        }

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int fibo1 = 1;
        int fibo2 = 1;
        int numero = Integer.parseInt(request.getParameter("sucesiones"));
        response.getOutputStream().println("<!DOCTYPE html><head>\n" +
                "    <title>Fibonacci</title>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <link href=\"http://localhost:8080/site.css\" rel=\"stylesheet\">" +
                "</head><body>\n" +
                "\n" +
                "<nav id=\"nav01\"></nav><div id=\"main\"><table style=\"width:100%\">\n" +
                "  <tr>\n" +
                "    <th>Sucesion</th>\n" +
                "    <th>Valor</th> \n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "<td>"+1+"</td>\n" +
                "    <td>"+fibo1+"</td>\n" +
                                "  </tr>");
        for (int i = 2; i <= numero; i++) {
            response.getOutputStream().println(" <tr>\n" +
                    "<td>"+i+"</td>\n" +
                    "    <td>"+fibo2+"</td>\n" +
                    "  </tr>");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        response.getOutputStream().println("</div>\n" +
                "\n" +
                "<script src=\"script3.js\"></script>\n" +
                "\n" +
                "</body>\n" +
                "</html></table>");
    }
}

