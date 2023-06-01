import Entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;
import java.util.Map;

public class ContactsBook {

    //Se utiliza el patrón singletón para tener una unica instancia de la sesión
    // que crear hibernate en mysql
    private static SessionFactory sessionFactory;

    private ContactsBook(){}

    public static Session getSession(){
        if( sessionFactory == null){
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }
        return sessionFactory.openSession();
    }
}
