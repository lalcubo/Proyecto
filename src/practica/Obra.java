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
    private String titulo;
    private String autor;
    private int anhoEdicion;
    
    public Obra(){
    
    }
    
    public void setTitulo(String titu){
    
    this.titulo = titu;
    }
    
    public String getTitulo(){
    
    return this.titulo;
    }
    public void setAutor(String auto){
    
    this.autor = auto;
    }
    
    public String getAutor(){
    
    return this.autor;
    }
    
    public void setAnhoEdicion(int anho){
    
    this.anhoEdicion = anho;
    }
    
    public int getAnhoEdicion(){
    
    return this.anhoEdicion;
    }
    
}
