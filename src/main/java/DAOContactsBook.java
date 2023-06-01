import Entities.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class DAOContactsBook {

    Session session = ContactsBook.getSession();
    Transaction transaction;

    public List<Student> showStudent(){
        Query query = session.createQuery("FROM Student");
        List<Student> students = query.getResultList();
        return students;
    }

    public Student getStudentById(String controlNumber){
        //transaction = session.beginTransaction();
        Student student = session.get(Student.class,controlNumber);
        return student;
    }

    public Student addStudent(Student student){
        try{
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
            System.out.println("Agregado");
            return student;
        }
        catch (Exception e){
            System.out.println("Error" + e.getMessage());
            return null;
        }
    }

    public int removeStudent(String student){
        try{
            Student studenByDelete = getStudentById(student);
            transaction = session.beginTransaction();
            session.delete(studenByDelete);
            transaction.commit();
            System.out.println("Eliminado con exito");
            return 200;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return 500;
        }
    }

    public Student updateStudent(Student student){
        try{
            session.update(student.getNumeroControl(),student);
            return student;
        }
        catch (Exception e){
            return null;
        }

    }



}
