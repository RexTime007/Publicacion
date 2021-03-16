/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Publicacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AltasImpresion {
    
   ArrayList<Libro> libros = new ArrayList<>();
   ArrayList<Revista> revistas = new ArrayList<>();
   ArrayList<Periodico> periodicos = new ArrayList<>();
    
    public void AltaLibro(ArrayList<Libro> libros)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Libro lib = new Libro();
        System.out.println();
        System.out.println("Ingrese el Titulo");
        lib.setTitulo(br.readLine());
        System.out.println("Ingrese el numero de Paginas: ");
        lib.setNumpag(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el Autor: ");
        lib.setAutor(br.readLine());
        System.out.println("Ingrese la Edicion: ");
        lib.setEdicion(br.readLine());
        System.out.println("Ingrese el ISBN: ");
        lib.setISBN(br.readLine());
        System.out.println("Ingrese el Precio");
        lib.setPrecio(Double.parseDouble(br.readLine()));
        libros.add(lib);
        
    }
    
    public void ImprimirLibro(ArrayList<Libro> libros){
        for (Libro libro : libros) {
            System.out.println();
            System.out.println("TItulo: "+libro.getTitulo());
            System.out.println("Autor: "+ libro.getAutor());
            System.out.println("Edicion: "+libro.getEdicion());
            System.out.println("Paginas: "+libro.getNumpag());
            System.out.println("ISBN: "+libro.getISBN());
            System.out.println("Precio: "+libro.getPrecio());
            
        }
    }
    
    public void AltaRevista(ArrayList<Revista> revistas)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Revista rev = new Revista();
        System.out.println("Ingrese el Titulo: ");
        rev.setTitulo(br.readLine());
        System.out.println("Ingrese el Numero de Paginas: ");
        rev.setNumpag(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el Precio: ");
        rev.setPrecio(Double.parseDouble(br.readLine()));
        System.out.println("Ingrese el Numero: ");
        rev.setNumero(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el ISSN: ");
        rev.setISSN(br.readLine());
        System.out.println("Ingrese el año: ");
        rev.setAnio(Integer.parseInt(br.readLine()));
        
        revistas.add(rev);  
    }
    
    public void ImprimirRevista(ArrayList<Revista> revistas){
        for (Revista revista : revistas) {
            System.out.println();
            System.out.println("Titulo: "+revista.getTitulo());
            System.out.println("Numero de Paginas: "+revista.getNumpag());
            System.out.println("Precio: "+revista.getPrecio());
            System.out.println("Numero: "+revista.getNumero());
            System.out.println("ISSN: "+revista.getISSN());
            System.out.println("Año: "+revista.getAnio());
            System.out.println("Periodicidad: "+revista.periodicidad);
        }
    }
    
    public void AltaPeriodico(ArrayList<Periodico> periodicos)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Periodico ped = new Periodico();
        System.out.println("Ingrese el Titulo: ");
        ped.setTitulo(br.readLine());
        System.out.println("Ingrese el Numero de Paginas: ");
        ped.setNumpag(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el Precio: ");
        ped.setPrecio(Double.parseDouble(br.readLine()));
        System.out.println("Ingrese la Fecha: ");
        ped.setFecha(br.readLine());
        System.out.println("Ingrese el comercio: ");
        ped.setComercio(br.readLine());
        System.out.println("Ingrese la localidad: ");
        ped.setLocalidad(br.readLine());
        
        periodicos.add(ped);  
    }
    
    public void ImprimirPeriodico(ArrayList<Periodico> periodicos){
        for (Periodico periodi : periodicos) {
            System.out.println();
            System.out.println("Titulo: "+periodi.getTitulo());
            System.out.println("Numero de Paginas: "+periodi.getNumpag());
            System.out.println("Precio: "+periodi.getPrecio());
            System.out.println("Comercio: "+periodi.getComercio());
            System.out.println("Localidad: "+periodi.getLocalidad());
            System.out.println("Fecha: "+periodi.getFecha());
            System.out.println("Periodicidad: "+periodi.periodicidad);

        }
    }
}
