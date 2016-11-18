package servlets;

import junit.framework.TestCase;

/**
 * Created by Turpitude on 15/11/2016.
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class EetacTest extends TestCase {

    EetacInterface eint;
    users ud;
    String name;
    String password;
    int id;
    Etakemon etakemon;
    @Before
    public void setUp() throws Exception {
        etakemon=new Etakemon("Grig","El grig");
        name="Bort";
        password="Bortpls";
    eint= new EetacDataBase();
    ud=new users("Bort","Bortpls");
    }

    @After
    public void tearDown() throws Exception {

        eint=null;
        ud=null;

    }
    @Test
    public void testaddUser() throws Exception {

        eint.addUser(name,password);

    }
    @Test
    public void testudpdateUser() throws Exception {

        name="Lobo";
        password="Loslobos";
        eint.updateUser(name,password);

    }
    @Test
    public void testgetUser() throws Exception {

        eint.getUser(name);
    }
    @Test
    public void testgetEtakemon() throws Exception {

        eint.getetakemons(name);

    }
    @Test
    public void testaddEtakemon() throws Exception {

        eint.addEtakemon(name,etakemon);

    }
    @Test
    public void testAlphabeticUser() throws Exception {

       eint.AlphabeticUser();

    }

}