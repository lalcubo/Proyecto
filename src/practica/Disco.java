/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import java.io.*;
import java.util.*;

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
  //---- buscar disco-------
   public void buscarDisco(ArrayList disc, String nomb)
    {
        boolean sw=false;
     
      for(int indi=0 ; indi < disc.size(); indi++) {
            Disco aux_disc = (Disco)disc.get(indi);
            if(aux_disc.getTitulo()!=null && aux_disc.getTitulo().equalsIgnoreCase(nomb))
            {
             System.out.println("EL titulo es: "+aux_disc.getTitulo());
             System.out.println("El año de edicion es: "+aux_disc.getAnhoEdicion());
             System.out.println("El autor es: "+aux_disc.getAutor().getNombre());
             System.out.println("El año de nacimiento es: "+aux_disc.getAutor().getAnioNacimiento());
             System.out.println("La Discografia es: "+aux_disc.getDiscografia());
             System.out.println("La cantidad de canciones es: "+aux_disc.getNCanciones());
             sw=true;
            }
        }
     
      if(!sw)
        System.out.println("No existe ningun titulo con ese nombre");  
    } 
   //------- buscar discografica---------
     public void buscarDiscografica(ArrayList disc, String nomb)
    {
     boolean sw=false;
     
      for(int indi=0 ; indi < disc.size() ; indi++) {
          Disco aux_disc = (Disco)disc.get(indi);
            if(aux_disc.getDiscografia()!=null && aux_disc.getDiscografia().equalsIgnoreCase(nomb))
            {
             System.out.println("---------------------------");
             System.out.println("La Discografia es: "+aux_disc.getDiscografia());
             System.out.println("El autor es: "+aux_disc.getAutor().getNombre());
             System.out.println("EL titulo es: "+aux_disc.getTitulo());
             System.out.println("La cantidad de canciones es: "+aux_disc.getNCanciones());
             sw=true;
            }
        }
    
      if(!sw)
        System.out.println("No existe ninguna discografica con ese nombre");  
    } 
   ///------ menu------
  public void crearMenu(ArrayList artis,ArrayList disc) throws IOException
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
                System.out.print( "Ingrese artista del cd: " );
                opciones = leer.readLine();
                retorno = this.asignarArtista(artis, opciones);
                if(!retorno) {
                     System.out.println( "El artista no existe" );
                }
                else
                {
                System.out.print( "Ingrese el nombre de la discografia: " );
                opciones = leer.readLine();
                setDiscografia(opciones);
                System.out.print( "Ingrese el numero de canciones: " );
                opciones = leer.readLine();
                setNCanciones(Integer.parseInt(opciones));
                System.out.print( "Ingrese el titulo del disco: " );
                opciones = leer.readLine();
                setTitulo(opciones);
                System.out.print( "Ingrese el año de edicion: " );
                opciones = leer.readLine();
                setAnhoEdicion(Integer.parseInt(opciones));
               
                }
              break;
         case "2": 
                System.out.print( "Ingrese el titulo del disco a buscar: " );
                opciones = leer.readLine();
                this.buscarDisco(disc, opciones);
              break;
         case "3": 
                System.out.print( "Ingrese la discografica a buscar: " );
                opciones = leer.readLine();
                this.buscarDiscografica(disc, opciones);              
              break;
         case "4": 
              
             break;      
      }
      
  }
  
}
