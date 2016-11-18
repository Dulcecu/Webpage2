package servlets;

import org.apache.log4j.Logger;

import org.apache.log4j.Logger;

import java.util.*;

/**
 * Created by Turpitude on 18/11/2016.
 */

public class EetacDataBase implements EetacInterface {

    private static EetacDataBase instance;
    private HashMap<String,users> eetacusers;

    public  EetacDataBase(){
        eetacusers= new HashMap<String, users>();

    }
    public  static EetacDataBase getInstance(){
        if (instance==null) instance=new EetacDataBase();
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

    public void addUser(String name, String password) {
        users us = new users(name,password);
        eetacusers.put(name,us);
    }

    public void updateUser(String name, String password) {
        users us = new users(name,password);
        eetacusers.put(name,us);
    }

    public users getUser(String name) {

        return  eetacusers.get(name);

    }

    public List<Etakemon> getetakemons(String name) {


        return eetacusers.get(name).getEtakemons();
    }

    public void addEtakemon(String name,Etakemon etakemon) {

        users us=eetacusers.get(name);
        us.addEtakemon(etakemon);
    }
}
