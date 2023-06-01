import Entities.Student;
import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class principal{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        DAOContactsBook agenda = new DAOContactsBook();
        System.out.println("Menu principal");
        System.out.println("1.- show records");
        System.out.println("2.- add new student");
        System.out.println("3.- delete student");
        System.out.println("4.- Find student by control number");
        System.out.println("5.- Update student");
        int opcion = Integer.parseInt(leer.nextLine());
        String control="";
        switch (opcion){
            case 1:
                List<Student> students = agenda.showStudent();
                students.forEach(student -> System.out.println(student));
                break;
            case 2:
                Student student;
                System.out.println("Type control number: ");
                String controlNumber = leer.nextLine();
                System.out.println("Type name: ");
                String name = leer.nextLine();
                System.out.println("Type email: ");
                String email = leer.nextLine();
                System.out.println("Type address: ");
                String address = leer.nextLine();
                student = new Student(controlNumber,name,email,address);
                agenda.addStudent(student);
                break;
            case 3:
                System.out.println("Type control number: ");
                control = leer.nextLine();
                int codigo = agenda.removeStudent(control);
                System.out.println(codigo);
                break;
            case 4:
                System.out.println("Type control number: ");
                control = leer.nextLine();
                Student student1 = agenda.getStudentById(control);
                System.out.println(student1.toString());
                break;
            case 5:
                System.out.println("Type control number: ");
                control = leer.nextLine();
                Student student2 = agenda.getStudentById(control);
                System.out.println("Ingresa nuevo correo: ");
                String correoNuevo= leer.nextLine();
                student2.setCorreo(correoNuevo);
                agenda.updateStudent(student2);
                break;
        }
    }




}
