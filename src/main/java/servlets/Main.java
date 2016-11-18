/*package servlets;

import com.google.gson.Gson;
import org.omg.CosNaming.NamingContextPackage.NotFound;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Turpitude on  30/10/2016. WORK IN PROGRESS

public class Main extends HttpServlet  {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<String> val = new ArrayList<String>();
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String calle = request.getParameter("calle");
        String operacion = request.getParameter("operacion");
        String sol="Operacion correcta";
        users ud= new users(id,nombre,calle);
        if(operacion.equals("INSERT")) {


            try {
                ud.insert();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
        if(operacion.equals(("UPDATE"))){
            try {
                ud.update();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();}

        }
        if(operacion.equals(("DELETE"))){
            try {
                ud.delete();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        if(operacion.equals(("SELECT"))){

            try {
                sol=ud.select();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (Explosiones explosiones) {
                explosiones.printStackTrace();
            }

            String[] parts= sol.split("-");
            String[] parts2=parts[0].split(",");
            val.add(parts2[0]);
            val.add(parts2[1]);
            val.add(parts2[2]);


        }


        String json = new Gson().toJson(val);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);

    }

}
*/