/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Luis
 */
public class Artista {
    private String nombre;
    private int anioNacimiento;
 //-----------constructor con parametros---------------
    public Artista (String nomb, int anio)
    {
        nombre = nomb;
        anioNacimiento = anio;
    }
 //-----------constructor sin parametros---------------
    public Artista()
    {
    }
 //--------- obtener año de nacimiento-----------------
    public int getAnioNacimiento()
    {
        return anioNacimiento;
    }
 //----------asignar el año de nacimiento--------------
    public void  setAnioNacimiento(int naci) 
    {
        anioNacimiento = naci;
    }
  //----------obtener nombre--------------------------
    public String getNombre()
    {
        return nombre;
    }
  //----------asignar nombre -------------------------
    public void setNombre(String nomb)
    {
        nombre = nomb;
    }
}