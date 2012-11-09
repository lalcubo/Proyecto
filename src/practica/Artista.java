/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import java.io.*;
/**
 *
 * @author Luis
 */
public class Artista {
    private String nombre;
    private int anioNacimiento;
    InputStreamReader lector = new InputStreamReader(System.in);
    BufferedReader leer = new BufferedReader(lector);
    String opciones;
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
    public void crearMenu() throws IOException
    {
     System.out.println( "1 Ingrsar Datos" );
     System.out.println( "2 Volver al menu principal" );
     System.out.print( "Por favor seleccione una opcion: " );
     opciones = leer.readLine();   
       switch(opciones)
            {
         case "1":
             System.out.print( "Ingrese artista: " );
             opciones = leer.readLine();
             this.setNombre(opciones);
             System.out.print( " Ingrese el año de nacimientos: " );
             opciones = leer.readLine();
             this.setAnioNacimiento(Integer.parseInt(opciones));
            
            break;
         case "2":
             break;
       }
       
    }
}