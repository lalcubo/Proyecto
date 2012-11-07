/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Juan
 */
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
    public boolean asignarArtista(Artista[] art, String nombre){
    
    boolean enc = false;    
    for(int indi=0 ; indi < art.length && !enc ; indi++) 
        if(art[indi].getNombre().equalsIgnoreCase(nombre)){
            enc = true;
            this.setAutor(art[indi]);
        }//fin if
    return enc;
    
    }//fin asignarArtista
}
