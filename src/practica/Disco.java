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
  public void crearMenu(Artista[] artis) throws IOException
  {
     boolean retorno;
     System.out.println( "MENU DISCO" );
     System.out.println( "1 Crear Disco" );
     System.out.println( "2 Buscar Disco" );
     System.out.println( "3 Consultar discografia y canciones" );
     System.out.println( "4 Volver al menu principal" );
     System.out.print( "Por favor seleccione una opcion: " );
     opcion = leer.readLine();
      switch(opcion)
      {
         case "1": 
                System.out.println( "Ingrese artista" );
                opcion = leer.readLine();
                retorno = this.asignarArtista(artis, opcion);
                if(!retorno) {
                     System.out.println( "El artista no existe" );
                }
                else
                {
                System.out.println( "Ingrese el nombre del disco" );
                opcion = leer.readLine();
                setDiscografia(opcion);
                System.out.println( "Ingrese el numero de canciones" );
                opcion = leer.readLine();
                setNCanciones(Integer.parseInt(opcion));
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
