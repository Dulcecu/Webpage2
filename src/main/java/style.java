/**
 * Created by Turpitude on 24/10/2016.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
public class style extends  HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        StringBuffer sb= new StringBuffer();
        sb.append("<head>");
        sb.append("<title>DSA</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<nav id=\"nav01\"></nav>");
        sb.append("<div id=\"main\">");
        sb.append("<h1>Proyecto servlets</h1>");
        sb.append("<h2>Bienvenida</h2>\n");
        sb.append("<p style=\"text-align:center;\">Utiliza el menu superior para seleccionar la opcion deseada</p>");
        sb.append("<footer id=\"foot01\"></footer>");
        sb.append("</div>");
        sb.append("<script src=\"http://localhost:8080/script3.js\"></script>");
        sb.append("</body>");
        sb.append("</html>");
        out.println(sb);

    }
}
