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
    private Artista interpretes;
    InputStreamReader lector = new InputStreamReader(System.in);
    BufferedReader leer = new BufferedReader(lector);
    String opciones;
    //////----constructor sin parametros-----
    public Pelicula()
    {
        
    }
  /*Obtiene o retorna el artista autor de la pelicula*/
    public Artista getInterpretes(){
    
    return this.interpretes;
    }
     /*Asigna el artista autor de la pelicula*/
    public void seInterpretes(Artista artis){
    
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
}
