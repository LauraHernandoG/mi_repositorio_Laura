/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author hergomla
 */
public class Alumno {
    private int numMatr;
    private String nombre;
    private String apellidos;
    private String ciclo;
    private String curso;

 
    public Alumno(int numMatr, String nombre, String apellidos, String ciclo, String curso) {
        this.numMatr = numMatr;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ciclo = ciclo;
        this.curso = curso;
    }

    public Alumno() {
    }

    public int getNumMatr() {
        return numMatr;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNumMatr(int numMatr) {
        this.numMatr = numMatr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numMatr=" + numMatr + ", nombre=" + nombre + ", apellidos=" + apellidos + ", ciclo=" + ciclo + ", curso=" + curso + '}';
    }
    
    
}
