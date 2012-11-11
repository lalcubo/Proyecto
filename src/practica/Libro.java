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
}
