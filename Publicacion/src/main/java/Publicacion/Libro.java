package Publicacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro extends Publicacion
{
    private String ISBN;
    private String edicion;
    private String autor;
    private ArrayList<Libro> libros;

    public Libro(String ISBN, String edicion, String autor) {
        this.ISBN = ISBN;
        this.edicion = edicion;
        this.autor = autor;
        this.libros= new ArrayList<>();
    }
    
    public String getISBN(){
     return ISBN;
    }
    
    public void setISBN(String isbn){
       ISBN = isbn;
    }
    
    public String getEdicion(){
     return edicion;
    }
    
    public void setEdicion(String ed){
        edicion = ed;
    }
    
     public String getAutor(){
     return autor;
    }
    
    public void setAutor(String au){
        autor = au;
    }
    
    public Libro()
    {
        this.libros= new ArrayList<>();
    }

    
   /* public ArrayList setLibros(){
        Scanner sc = new Scanner(System.in);
        Libro lib = new Libro();
        
        System.out.println("Ingrese el ISBN: ");
        String is= sc.nextLine();
        lib.setISBN(is);
        System.out.println("Ingrese la edicion: " );
        String edi= sc.nextLine();
        lib.setEdicion(edi);
        System.out.println("Ingrese el autor: ");
        String aw= sc.nextLine();
        lib.setAutor(aw);
        
        libros.add(new Libro(is, edi,aw));
        return libros;
    }
    
    public void getArray()
    {
        System.out.println(" ----lIBRO----  ");
        for(int i=0; i<libros.size(); i++)
        {
            System.out.println("ISBN: "+libros.get(i).getISBN());
            System.out.println("Edicion: "+libros.get(i).getEdicion());
            System.out.println("Autor: "+libros.get(i).getAutor());
        }
    }*/
}