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
}