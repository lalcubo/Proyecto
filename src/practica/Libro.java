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
    public String getEditorial()
      {
        return editorial;
      }
    public void setEditorial(String edi)
    {
        editorial = edi;
    }
}
