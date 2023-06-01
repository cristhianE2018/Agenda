import Entities.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestAgenda {

    private DAOContactsBook contactsBook;

    @Before
    public void setUp(){
        contactsBook = new DAOContactsBook();
    }
    @Test
    public void testAgregarRegistro(){
        Student estEsperado = new Student();
        estEsperado.setNumeroControl("1Q");
        estEsperado.setNombre("joiarib");
        estEsperado.setCorreo("joiarib@gmail.com");
        estEsperado.setDireccion("joiarib");
        Student result = contactsBook.addStudent(new Student(
                "1Q",
                "joiarib",
                "joiarib@gmail.com",
                "joiarib"
        ));
        Assert.assertEquals(estEsperado.toString(),result.toString());
    }

}
