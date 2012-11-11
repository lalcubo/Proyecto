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
public class Libro extends Obra{
    private String editorial;
    private int nPaginas;
    InputStreamReader lector = new InputStreamReader(System.in);
    BufferedReader leer = new BufferedReader(lector);
    String opciones;
    
    public Libro()
      {
          
      }
    // metodo para obtener el editorial
    public String getEditorial()
      {
        return editorial;
      }
    // metodo para asignar el editorial
    public void setEditorial(String edi)
    {
        editorial = edi;
    }
    // metodo para obtener las paginas
    public int getPaginas()
    {
        return nPaginas;
    } 
 //  metodo para asignar el total de paginas
    public void setPaginas(int pagi)
    {
        nPaginas = pagi;
    } 
     public void buscarLibro(ArrayList lib, String nomb)
    {
        boolean sw=false;
     
      for(int indi=0 ; indi < lib.size(); indi++) {
            Libro aux_libro = (Libro)lib.get(indi);
            if(aux_libro.getTitulo()!=null && aux_libro.getTitulo().equalsIgnoreCase(nomb))
            {
             System.out.println("EL titulo del libro es: "+aux_libro.getTitulo());
             System.out.println("El año de edicion es: "+aux_libro.getAnhoEdicion());
             System.out.println("El autor es: "+aux_libro.getAutor().getNombre());
             System.out.println("El año de nacimiento es: "+aux_libro.getAutor().getAnioNacimiento());
             System.out.println("La Editorial es: "+aux_libro.getEditorial());
             System.out.println("La cantidad de paginas es: "+aux_libro.getPaginas());
             sw=true;
            }
        }
     
      if(!sw)
        System.out.println("No existe ningun titulo con ese nombre");  
    }
    public void buscarEditorial(ArrayList lib, String nomb)
    {
     boolean sw=false;
     
      for(int indi=0 ; indi < lib.size() ; indi++) {
          Libro aux_libro = (Libro)lib.get(indi);
            if(aux_libro.getEditorial()!=null && aux_libro.getEditorial().equalsIgnoreCase(nomb))
            {
             System.out.println("---------------------------");
             System.out.println("La Editorial es: "+aux_libro.getEditorial());
             System.out.println("El autor es: "+aux_libro.getAutor().getNombre());
             System.out.println("EL titulo es: "+aux_libro.getTitulo());
             System.out.println("La cantidad de paginas son: "+aux_libro.getPaginas());
             sw=true;
            }
        }
    
      if(!sw)
        System.out.println("No existe ninguna editorial con ese nombre");  
    }
    // la creacion del menu 
    public void crearMenu(ArrayList artis,ArrayList libr) throws IOException
  {
     boolean retorno;
     System.out.println( "MENU LIBRO" );
     System.out.println( "1 Crear Libro" );
     System.out.println( "2 Buscar Libro" );
     System.out.println( "3 Consultar Editorial y Paginas" );
     System.out.println( "4 Volver al menu principal" );
     System.out.print( "Por favor seleccione una opcion: " );
     opciones = leer.readLine();
      switch(opciones)
      {
         case "1": 
                System.out.print( "Ingrese artista del libro: " );
                opciones = leer.readLine();
                retorno = this.asignarArtista(artis, opciones);
                if(!retorno) {
                     System.out.println( "El artista ingresado no existe" );
                }
                else
                {
                System.out.print( "Ingrese el nombre del editorial: " );
                opciones = leer.readLine();
                setEditorial(opciones);
                System.out.print( "Ingrese el numero de paginas: " );
                opciones = leer.readLine();
                setPaginas(Integer.parseInt(opciones));
                System.out.print( "Ingrese el titulo del libro: " );
                opciones = leer.readLine();
                setTitulo(opciones);
                System.out.print( "Ingrese el año de edicion: " );
                opciones = leer.readLine();
                setAnhoEdicion(Integer.parseInt(opciones));
               
                }
              break;
         case "2": 
                System.out.print( "Ingrese el titulo del libro a buscar: " );
                opciones = leer.readLine();
                this.buscarLibro(libr, opciones);
              break;
         case "3": 
                System.out.print( "Ingrese la editorial a buscar: " );
                opciones = leer.readLine();
                this.buscarEditorial(libr, opciones);              
              break;
         case "4": 
              
             break;      
      }
      
  }
}
