package servlets;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by Turpitude on 18/11/2016.
 */
public class EetacDataBaseDAO extends Dao implements EetacInterface {
    private static EetacDataBaseDAO instance;
    private HashMap<String,users> eetacusers;

    public  EetacDataBaseDAO(){
        eetacusers= new HashMap<String, users>();

    }
    public  static EetacDataBaseDAO getInstance(){
        if (instance==null) instance=new EetacDataBaseDAO();
        return instance;
    }

    public ArrayList<users> AlphabeticUser() {
        ArrayList<users> us= new ArrayList<users>();
        for (HashMap.Entry<String, users> entry : eetacusers.entrySet())
        {
            us.add(entry.getValue());

        }
        if (us.size() > 0) {
            Collections.sort(us, new Comparator<users>() {
                public int compare(final users object1, final users object2) {
                    return object1.getName().compareTo(object2.getName());
                }
            });
        }
        return us;
    }

    public void addUser(String name, String password) throws SQLException, NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException {

        users us = new users(name,password);
        eetacusers.put(name,us);
        us.insert();

    }

    public void updateUser(String name, String password) throws SQLException, NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException {

        users us = new users(name,password);
        eetacusers.put(name,us);
        us.update();

    }

    public users getUser(String name) throws NoSuchMethodException, Explosiones, IllegalAccessException, SQLException, InvocationTargetException, ClassNotFoundException {
        users us=eetacusers.get(name);
        String user=us.select();
        String[] parts= user.split("-");
        String[] parts2=parts[0].split(",");
        users newuser= new users(parts2[1],parts2[2]);
        return  newuser;

    }

    public List<Etakemon> getetakemons(String name) throws NoSuchMethodException, Explosiones, IllegalAccessException, SQLException, InvocationTargetException, ClassNotFoundException {

        users us =eetacusers.get(name);
        us.selectEtakemons();
        return null;

    }

    public void addEtakemon(String name, Etakemon etakemon) {

    }
}
