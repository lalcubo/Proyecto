/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import java.io.*;
import java.util.*;
/**
 *
 * @author Luis
 */
public class Pelicula extends Obra{
    private String productora;
    private String interpretes;
    InputStreamReader lector = new InputStreamReader(System.in);
    BufferedReader leer = new BufferedReader(lector);
    String opciones;
    //////----constructor sin parametros-----
    public Pelicula()
    {
        
    }
  /*Obtiene o retorna el artista autor de la pelicula*/
    public String getInterpretes(){
    
    return this.interpretes;
    }
     /*Asigna el artista autor de la pelicula*/
    public void setInterpretes(String artis){
    
    this.interpretes = artis;
    } 
      //------ metodo para retornar la productora
    public String getProductora()
     {
     return productora;
    }
    public void setProductora(String prod)
    {
        productora = prod;
    }
  //---- buscar pelicula-------
   public void buscarPelicula(ArrayList peli, String nomb)
    {
        boolean sw=false;
     
      for(int indi=0 ; indi < peli.size(); indi++) {
            Pelicula aux_peli = (Pelicula)peli.get(indi);
            if(aux_peli.getTitulo()!=null && aux_peli.getTitulo().equalsIgnoreCase(nomb))
            {
             System.out.println("EL titulo es: "+aux_peli.getTitulo());
             System.out.println("El año de la pelicula es: "+aux_peli.getAnhoEdicion());
             System.out.println("El autor es: "+aux_peli.getAutor().getNombre());
             System.out.println("El año de nacimiento es: "+aux_peli.getAutor().getAnioNacimiento());
             System.out.println("La productora es: "+aux_peli.getProductora());
             System.out.println("El interprete es: "+aux_peli.getInterpretes());
             sw=true;
            }
        }
     
      if(!sw)
        System.out.println("No existe ningun titulo con ese nombre");  
    } 
   
   //------- buscar prodcutora---------
     public void buscarProductora(ArrayList prod, String nomb)
    {
     boolean sw=false;
     
      for(int indi=0 ; indi < prod.size() ; indi++) {
          Pelicula aux_prod = (Pelicula)prod.get(indi);
            if(aux_prod.getProductora()!=null && aux_prod.getProductora().equalsIgnoreCase(nomb))
            {
             System.out.println("---------------------------");
             System.out.println("La Productora es: "+aux_prod.getProductora());
             System.out.println("El autor es: "+aux_prod.getAutor().getNombre());
             System.out.println("EL titulo es: "+aux_prod.getTitulo());
             System.out.println("El interprete es: "+aux_prod.getInterpretes());
             sw=true;
            }
        }
    
      if(!sw)
        System.out.println("No existe ninguna productora con ese nombre");  
    }    
       ///------ menu------
  public void crearMenu(ArrayList artis,ArrayList peli) throws IOException
  {
     boolean retorno;
     System.out.println( "MENU PELICULAS" );
     System.out.println( "1 Crear pelicula" );
     System.out.println( "2 Buscar pelicula" );
     System.out.println( "3 Consultar productora" );
     System.out.println( "4 Volver al menu principal" );
     System.out.print( "Por favor seleccione una opcion: " );
     opciones = leer.readLine();
      switch(opciones)
      {
         case "1": 
                System.out.print( "Ingrese artista de la pelicula: " );
                opciones = leer.readLine();
                retorno = this.asignarArtista(artis, opciones);
                if(!retorno) {
                     System.out.println( "El artista no existe" );
                }
                else
                {
                System.out.print( "Ingrese el nombre de la productora: " );
                opciones = leer.readLine();
                setProductora(opciones);
                System.out.print( "Ingrese el interprete: " );
                opciones = leer.readLine();
                setInterpretes(opciones);
                System.out.print( "Ingrese el titulo de la pelicula: " );
                opciones = leer.readLine();
                setTitulo(opciones);
                System.out.print( "Ingrese el año de la pelicula: " );
                opciones = leer.readLine();
                setAnhoEdicion(Integer.parseInt(opciones));
               
                }
              break;
         case "2": 
                System.out.print( "Ingrese el titulo de la pelicula a buscar: " );
                opciones = leer.readLine();
                this.buscarPelicula(peli, opciones);
              break;
         case "3": 
                System.out.print( "Ingrese la productora a buscar: " );
                opciones = leer.readLine();
                this.buscarProductora(peli, opciones);              
              break;
         case "4": 
              
             break;      
      }
      
  }
}
