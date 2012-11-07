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
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(lector);
        String opcion;
        int tam_artista=10;
        int tam_obra=10;
        int tam_libros=10;
        int tam_discos=10;
        int tam_peliculas=10;
        
    //    int posicion=0;
        Obra[] obra = new Obra[tam_obra];
        Artista[] artista = new Artista[tam_artista];
        Disco[] disco = new Disco[tam_discos];
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

                   break;
               case "2":
                 
                   break;
               case "3":
                 
                   break;
               case "4":
                 
                   break;
               case "5":
                 
                   break;                   
                   
              default: System.out.println("No ha escrito ninguna opcion valida.");  
            }
            
        }while (!opcion.equals("6"));
       
    }
   
}
