package Entities;

import javax.persistence.*;

@Entity()
@Table(name = "alumnos")
public class Student {

    @Id
    @Column(name="numero_control")
    private String numeroControl;
    @Basic
    private String nombre;
    @Basic
    private String correo;

    private String direccion;

    public Student() {
    }


    public Student(String numeroControl, String nombre, String correo,
                   String direccion) {
        this.numeroControl = numeroControl;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString(){
        return this.nombre + " | " + this.correo;
    }
}
