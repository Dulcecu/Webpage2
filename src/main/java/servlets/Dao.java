package servlets;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;

public abstract class Dao {

    PreparedStatement prst;
    StringBuffer command= new StringBuffer();
    Field[] fields;
    Method m;
    private Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Connection connect=null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connect=DriverManager.getConnection("jdbc:mysql://localhost/DSA?useLegacyDatetimeCode=false&serverTimezone=America/New_York","root","Krestajohn7");
        return  connect;

    }

    public  void setName(PreparedStatement prst) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, SQLException {
        int i=1;
        for(Field f:fields){

            m=this.getClass().getMethod(getMethod((f.getName())),null);
            Object ret=m.invoke(this,null);

            if(ret instanceof Integer){

                if(f.getName().equals("name")) {
                    String id = ret.toString();
                    prst.setString(i, id);
                }
            }
            i++;

        }
    }
    public void addParams(PreparedStatement prst) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, SQLException {
        int i=1;
        for(Field f:fields){

            m=this.getClass().getMethod(getMethod((f.getName())),null);
            Object ret=m.invoke(this,null);

            if(ret instanceof String){
                prst.setString(i, (String) ret);
            }
            i++;

        }
    }
    public void setParams(PreparedStatement prst) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, SQLException {
        int i = 1;
        for (Field f : fields) {

            m = this.getClass().getMethod(getMethod((f.getName())), null);
            Object ret = m.invoke(this, null);

            if (ret instanceof String) {
                prst.setString(i, (String) ret);
                if (ret instanceof Integer) {

                    String id = ret.toString();
                    int id2 = Integer.parseInt(id);
                    prst.setInt(i, id2);
                    prst.setInt(4, id2);
                }
                i++;

            }
        }

    }
    private  String getMethod(String m){

        m =m.substring(0, 1).toUpperCase() +m.substring(1);
        return "get"+m;

    }

    public void insert() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, SQLException, ClassNotFoundException {

        Connection con= this.getConnection();
        command= new StringBuffer();
        command.append("INSERT INTO ").append(this.getClass().getSimpleName()+" (");
        fields= this.getClass().getFields();

        for(Field f : fields)
        {
            command.append(f.getName()+",");

        }

        command.replace(command.length()-1,command.length(),") VALUES (");
        for(Field f : fields)
        {
            command.append("?,");

        }
        command.replace(command.length()-1,command.length(),");");


        // CHANGE
        String query=command.toString();
        prst= con.prepareStatement(query);
        this.addParams(prst);
        prst.execute();

    }
    public  void update() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, SQLException, ClassNotFoundException {

        Connection con= this.getConnection();
        command= new StringBuffer();
        command.append("UPDATE ").append(this.getClass().getSimpleName()+" SET ");

        fields= this.getClass().getFields();
        for(Field f : fields)
        {
            command.append(f.getName() + "=?, ");

        }
        command.replace(command.length()-2,command.length()," WHERE ");
        for(Field f :fields){
            if(f.getName().toString().equals("name")){
                command.append(f.getName().toString()+"=? AND");
            }
            if(f.getName().toString().equals("password")){
                command.append(f.getName().toString()+"=?;");
            }
        }

        String query=command.toString();
        prst= con.prepareStatement(query);
        this.addParams(prst);
        prst.execute();
    }
    public String selectEtakemons() throws SQLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, Explosiones {
        StringBuffer tablas=new StringBuffer();
        Connection con= this.getConnection();
        command= new StringBuffer();
        command.append("SELECT usercol FROM ").append(this.getClass().getSimpleName()+" WHERE ");

        fields= this.getClass().getFields();
        for(Field f :fields){
            if(f.getName().toString().equals("name")){
                command.append(f.getName().toString()+"=?;");
            }
        }
        String query=command.toString();
        prst= con.prepareStatement(query);
        this.setName(prst);
        ResultSet rs= prst.executeQuery();
        if(rs.next()==false){throw new Explosiones();}
        rs.beforeFirst();
        ResultSetMetaData rsmd= rs.getMetaData();
        rs.next();
        for(int i=1;i<rsmd.getColumnCount()+1;i++){
            try {

                if (rsmd.getColumnTypeName(i).equals("INT")) {
                    tablas.append(rs.getInt(i)+",");
                }
                if (rsmd.getColumnTypeName(i).equals("VARCHAR")) {
                    tablas.append(rs.getString(i)+",");
                }
                if(i==rsmd.getColumnCount()){
                    rs.next();
                    i=0;
                }
            }
            catch (Exception e){

            }

        }
        tablas.append("-");
        return tablas.toString();
    }

    public String select() throws SQLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, Explosiones {
        StringBuffer tablas=new StringBuffer();
        Connection con= this.getConnection();
        command= new StringBuffer();
        command.append("SELECT * FROM ").append(this.getClass().getSimpleName()+" WHERE ");

        fields= this.getClass().getFields();
        for(Field f :fields){
            if(f.getName().toString().equals("name")){
                command.append(f.getName().toString()+"=?;");
            }
        }
        String query=command.toString();
        prst= con.prepareStatement(query);
        this.setName(prst);
        ResultSet rs= prst.executeQuery();
        if(rs.next()==false){throw new Explosiones();}
        rs.beforeFirst();
        ResultSetMetaData rsmd= rs.getMetaData();
        rs.next();
        for(int i=1;i<rsmd.getColumnCount()+1;i++){
            try {

                if (rsmd.getColumnTypeName(i).equals("INT")) {
                    tablas.append(rs.getInt(i)+",");
                }
                if (rsmd.getColumnTypeName(i).equals("VARCHAR")) {
                    tablas.append(rs.getString(i)+",");
                }
                if(i==rsmd.getColumnCount()){
                    rs.next();
                    i=0;
                }
            }
            catch (Exception e){

            }

        }
        tablas.append("-");
        return tablas.toString();
    }

    public String selectAll() throws SQLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, Explosiones {
        StringBuffer tablas=new StringBuffer();
        Connection con= this.getConnection();
        command= new StringBuffer();
        command.append("SELECT * FROM ").append(this.getClass().getSimpleName()+";");
        String query=command.toString();
        prst= con.prepareStatement(query);
        ResultSet rs= prst.executeQuery();
        if(rs.next()==false){throw new Explosiones();}
        rs.beforeFirst();
        ResultSetMetaData rsmd= rs.getMetaData();
        rs.next();
        for(int i=1;i<rsmd.getColumnCount()+1;i++){
            try {

                if (rsmd.getColumnTypeName(i).equals("INT")) {
                    tablas.append(rs.getInt(i)+",");
                }
                if (rsmd.getColumnTypeName(i).equals("VARCHAR")) {
                    tablas.append(rs.getString(i)+",");
                }
                if(i==rsmd.getColumnCount()){
                    rs.next();
                    i=0;
                }
            }
            catch (Exception e){

            }

        }
        tablas.append("-");
        return tablas.toString();
    }

}