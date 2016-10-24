/**
 * Created by Turpitude on 20/10/2016.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="Fibonacci")

public class Fibonacci extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Float operador1 = Float.parseFloat(request.getParameter("operador1"));
        Float operador2 = Float.parseFloat(request.getParameter("operador2"));
        String operacion = request.getParameter("operacion");
        double sol = 0;
        if ("SUMA".equals(operacion)) {
            sol = operador1 + operador2;
        }
        if ("RESTA".equals(operacion)) {
            sol = operador1 - operador2;
        }
        if ("MULTIPLICACION".equals(operacion)) {
            sol = operador1 * operador2;
        }
        if ("DIVISION".equals(operacion)) {
            sol = operador1 / operador2;
        }
        request.setAttribute("result", sol);
        request.getRequestDispatcher("/Resultados.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int fibo1 = 1;
        int fibo2 = 1;
        int numero = Integer.parseInt(request.getParameter("sucesiones"));
        List<Integer> fibo= new ArrayList<Integer>();
        fibo.add(fibo2);
        for (int i = 2; i <= numero; i++) {
            fibo.add(fibo2);
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;

        }
        request.setAttribute("fibo", fibo);
        request.getRequestDispatcher("/ResultadosFibonacci.jsp").forward(request, response);
    }
}
