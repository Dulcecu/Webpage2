package servlets;

/**
 * Created by Turpitude on 18/11/2016.
 */
public class Etakemon {

    public String name;
    public String description;
public Etakemon(String name, String description){

    this.description=description;
    this.name=name;

    }

    public String getName(){
        return  this.name;
    }

}
