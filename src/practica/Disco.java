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
    String opciones;
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
  public void crearMenu(Artista[] artis) throws IOException
  {
     boolean retorno;
     System.out.println( "MENU DISCO" );
     System.out.println( "1 Crear Disco" );
     System.out.println( "2 Buscar Disco" );
     System.out.println( "3 Consultar discografia y canciones" );
     System.out.println( "4 Volver al menu principal" );
     System.out.print( "Por favor seleccione una opcion: " );
     opciones = leer.readLine();
      switch(opciones)
      {
         case "1": 
                System.out.println( "Ingrese artista" );
                opciones = leer.readLine();
                retorno = this.asignarArtista(artis, opciones);
                if(!retorno) {
                     System.out.println( "El artista no existe" );
                }
                else
                {
                System.out.println( "Ingrese el nombre del disco" );
                opciones = leer.readLine();
                setDiscografia(opciones);
                System.out.println( "Ingrese el numero de canciones" );
                opciones = leer.readLine();
                setNCanciones(Integer.parseInt(opciones));
                }
              break;
         case "2": 
              
              break;
         case "3": 
              
              break;
         case "4": 
              
             break;      
      }
  }
  
}
