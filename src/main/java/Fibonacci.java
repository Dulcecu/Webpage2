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

    //funcion del post
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
// tipo de variable de los operadores ( el request.getParameter recoge el valor con el nombre de variable definido en el jsp)
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
        // una vez realizada la operacion le da el valor a la variable llamada "result"(puede ser cualquier nombre)
        // con el comando request.setAttribute( puede ser cualquier variable, hasta listas)
        request.setAttribute("result", sol);
        //una vez el valor esta establecido, con el codigo de abajo abre la pagina jsp llamada "Resultados" y le pasa el
        //valor en el request ( que en el jsp lo llamara "result" que es como se ha establecido que se llame)
        //y con el response se lo transmite ( el response solo permite trnasmitir, nada mas)
                request.getRequestDispatcher("/Resultados.jsp").forward(request, response);

    }
// funcion del get
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        /*int fibo1 = 1;
        int fibo2 = 1;
        //el request.getParameter recoge el valor con el nombre de variable definido en el jsp
        int numero = Integer.parseInt(request.getParameter("sucesiones"));
        //declaracion de la lista para devolver el bucle
        List<Integer> fibo= new ArrayList<Integer>();
        fibo.add(fibo2);
        for (int i = 2; i <= numero; i++) {
            fibo.add(fibo2);
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;

        }
        */
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("Success Data");
        // una vez realizada la operacion le da el valor a la variable llamada "fibo"(puede ser cualquier nombre)
        // con el comando request.setAttribute( puede ser cualquier variable, hasta listas)
        //request.setAttribute("fibo", fibo);

        //una vez el valor esta establecido, con el codigo de abajo abre la pagina jsp llamada "ResultadosFibonacci" y le pasa el
        //valor en el request ( que en el jsp lo llamara "fibo" que es como se ha establecido que se llame)
        //y con el response se lo transmite ( el response solo permite trnasmitir, nada mas)
        //request.getRequestDispatcher("/ResultadosFibonacci.jsp").forward(request, response);
    }
}
