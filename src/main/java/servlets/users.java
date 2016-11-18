package servlets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Turpitude on 10/10/2016.
 */
public class users extends Dao {

    public String name;
    public String password;
    public List<Etakemon> etakemons;

    public users(String name, String password) {

        etakemons= new ArrayList<Etakemon>();
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Etakemon>  getEtakemons(){
        return  this.etakemons;
    }

    public  void addEtakemon(Etakemon etakemon){
        this.etakemons.add(etakemon);
    }
}
