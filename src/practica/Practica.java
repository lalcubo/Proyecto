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
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(lector);
        String opcion;
        
  
        ArrayList obra = new ArrayList();
        ArrayList artista = new ArrayList();
        ArrayList libro = new ArrayList();
        ArrayList disco = new ArrayList();
        Artista arti = new Artista();
        Disco disc = new Disco();
        Libro libr = new Libro();
        do{
            System.out.println( "MENU" );
            System.out.println( "1 Crear Artista" );
            System.out.println( "2 Libro" );
            System.out.println( "3 Disco" );
            System.out.println( "4 Peliculas" );
            System.out.println( "5 Reportes" );
            System.out.println( "6 Salir" );
            System.out.print( "Por favor seleccione una opcion: " );
            opcion = leer.readLine();
            switch(opcion)
            {
               case "1":   
                   artista.add(new Artista());
                   arti = (Artista) artista.get(artista.size()-1);
                   arti.crearMenu();
                   break;
               case "2":
                   libro.add (new Libro());
                   libr = (Libro)libro.get(libro.size()-1);
                   libr.crearMenu(artista, libro);        
                   break;
               case "3":
                   disco.add (new Disco());
                   disc = (Disco)disco.get(disco.size()-1);
                   disc.crearMenu(artista, disco);
                   break;
               case "4":
                 
                   break;
               case "5":
                 
                   break;                   
               case "6": 
                       
                   break;
              default: System.out.println("No ha escrito ninguna opcion valida.");  
            }
            
        }while (!opcion.equals("6"));
       
    }
   
}
