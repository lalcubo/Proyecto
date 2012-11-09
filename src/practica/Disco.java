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
  //---- buscar disco-------
   public void buscarDisco(Disco[] disc, String nomb,int posi)
    {
        boolean sw=false;
      for(int indi=0 ; indi < posi; indi++) {
            if(disc[indi].getTitulo().equalsIgnoreCase(nomb))
            {
             System.out.println("EL titulo es: "+disc[indi].getTitulo());
             System.out.println("El año de edicion es: "+disc[indi].getAnhoEdicion());
             System.out.println("El autor es: "+disc[indi].getAutor().getNombre());
             System.out.println("El año de nacimiento es: "+disc[indi].getAutor().getAnioNacimiento());
             System.out.println("La Discografia es: "+disc[indi].getDiscografia());
             System.out.println("La cantidad de canciones es: "+disc[indi].getNCanciones());
             sw=true;
            }
        }
      if(!sw)
        System.out.println("No existe ningun titulo con ese nombre");  
    } 
   //------- buscar discografica---------
     public void buscarDiscografica(Disco[] disc, String nomb,int posi)
    {
        boolean sw=false;
      for(int indi=0 ; indi < posi; indi++) {
            if(disc[indi].getDiscografia().equalsIgnoreCase(nomb))
            {
             System.out.println("---------------------------");
             System.out.println("La Discografia es: "+disc[indi].getDiscografia());
             System.out.println("El autor es: "+disc[indi].getAutor().getNombre());
             System.out.println("EL titulo es: "+disc[indi].getTitulo());
             System.out.println("La cantidad de canciones es: "+disc[indi].getNCanciones());
             sw=true;
            }
        }
      if(!sw)
        System.out.println("No existe ninguna discografica con ese nombre");  
    } 
   ///------ menu------
  public int crearMenu(Artista[] artis,Disco[] disc,int posi) throws IOException
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
                posi++;
                }
              break;
         case "2": 
                System.out.print( "Ingrese el titulo del disco a buscar: " );
                opciones = leer.readLine();
                this.buscarDisco(disc, opciones,posi);
              break;
         case "3": 
                System.out.print( "Ingrese la discografica a buscar: " );
                opciones = leer.readLine();
                this.buscarDiscografica(disc, opciones,posi);              
              break;
         case "4": 
              
             break;      
      }
      return posi;
  }
  
}
