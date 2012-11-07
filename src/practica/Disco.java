/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import java.io.*;

/**
 *
 * @author Armando
 */
public class Disco extends Obra{
    private String discografia;
    private int nCanciones;
    InputStreamReader lector = new InputStreamReader(System.in);
    BufferedReader leer = new BufferedReader(lector);
    String opcion;
    //////----constructor sin parametros-----
    public Disco()
    {
        
    }
  //------ metodo para retornar la discografia
  public String getDiscografia()
  {
     return discografia;
  }
  //----- metodo para asignar discografia
  public void setDiscografia(String dis)
    {
        discografia = dis;
    }
  
 //-----metodo para obtener canciones-----
  public int getNCanciones()
    {
        return nCanciones;
    } 
 //---- metodo para asignar el total de canciones----
  public void setNCanciones(int canc)
    {
        nCanciones = canc;
    }  
  public void crearMenu() throws IOException
  {
     System.out.println( "MENU DISCO" );
     System.out.println( "1 Obtener Discografia" );
     System.out.println( "2 Asignar Discografia" );
     System.out.println( "3 Obtener numero de canciones" );
     System.out.println( "4 Asignar numero de canciones" );
     System.out.print( "Por favor seleccione una opcion: " );
     opcion = leer.readLine();  
  }
  
}
