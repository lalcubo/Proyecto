/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Juan
 */
import java.util.*;

public class Obra {
    private String titulo; //Título de la obra
    private Artista autor; //Artista autor de la obra
    private int anhoEdicion; //Año de edición de la obra
    
    /*Constructor con parametros*/
    public Obra(String titu,Artista auto,int anho){
    
        this.titulo = titu;
        this.autor = auto;
        this.anhoEdicion = anho;
    }
    
    /*Constructor sin parametros*/
    public Obra(){
    
    }
    
    /*Asigna el titulo de la obra*/
    public void setTitulo(String titu){
    
    this.titulo = titu;
    }
    
    /*Obtiene o retorna el titulo de la obra*/
    public String getTitulo(){
    
    return this.titulo;
    }
    
     /*Asigna el artista autor de la obra*/
    public void setAutor(Artista auto){
    
    this.autor = auto;
    }
    
    /*Obtiene o retorna el artista autor de la obra*/
    public Artista getAutor(){
    
    return this.autor;
    }
    
     /*Asigna el año de edición de la obra*/
    public void setAnhoEdicion(int anho){
    
    this.anhoEdicion = anho;
    }
    
    /*Obtiene o retorna el año de edición de la obra*/
    public int getAnhoEdicion(){
    
    return this.anhoEdicion;
    
    }
    /*Busca si existe el artista y se lo asigna a la obra*/
    public boolean asignarArtista(ArrayList art, String nombre){
    
    boolean enc = false;    
    for(int indi=0 ; indi < art.size() && !enc ; indi++){ 
        Artista aux_arti = (Artista)art.get(indi);
        if(aux_arti.getNombre()!=null && aux_arti.getNombre().equalsIgnoreCase(nombre)){
            enc = true;
            this.setAutor(aux_arti);
        }//fin if
        
    }//fin for
    return enc;
    
    }//fin asignarArtista
}
