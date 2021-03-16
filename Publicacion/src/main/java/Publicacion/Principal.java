package Publicacion;

/*
ALUMNO: TORRES SANTOS JOSUE DANIEL
MATERIA: TOPICOS AVANZADOS DE PROGRAMACION
DOCENTE: ARELI PEREZ APARICIO
FECHA: MARZO 16 DE 2021

ENUNCIADO:
Del programa visto en clase, primeramente, revisar como funciona y entender la aplicación de 
paquete e interfaces, para realizar lo siguiente:

Colocar un menú que tendrá solamente las siguientes opciones:
1. Dar de alta una publicación, se le preguntará a el usuario el tipo de publicación, 
Revista, Periódico o Libro y solicitar los datos requeridos.
2. Mostrar el contenido del arreglo o ArrayList.
3. Salir.
Crear la clase Periódico que herede de publicación e implemente la interfaz periodicidad y
que sea útil para dar de alta un periódico.
Crear la carpeta publicacion en GitHub y subir todas las clases del proyecto.
En la clase principal comentar si hicieron o no el cambio de arreglo a ArrayList.
El objetivo de este programa es entender la aplicación de lo visto hasta el momento,
por lo que lo harán de manera individual ya que son pocas las modificaciones que se realizarán.
*/
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList<Libro> libros= new ArrayList<>();
    static ArrayList<Revista> revistas = new ArrayList<>();
    static ArrayList<Periodico> periodicos = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        int ctrlpub = 0;
        boolean salir =false;
        do{
            ctrlpub=menu(ctrlpub);
        }while(!salir);
    }
        public static int menu(int opc) throws IOException
        {
            Scanner sc = new Scanner(System.in);
            
            do{
                System.out.println("------Menu------");
                System.out.println("1.- Alta");
                System.out.println("2.- Mostrar");
                System.out.println("3.- Salir");
                System.out.println("Elige una opcion: ");
                try{
                opc= sc.nextInt();
                }catch(Exception e){
                    sc.next();
                    System.out.println("Opcion o dato no Valido");
                }
                switch(opc){
                    case 1:
                        alta();
                        break;
                    case 2:
                        mostrar();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Opcion no valida");
                }
            }while(opc<1||opc>3);
            return opc;
        }
      
        public static void alta() throws IOException
        {
            AltasImpresion alta = new AltasImpresion();
            int tip=0;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("\nTipo");
                System.out.println("1.-Revista");
                System.out.println("2.-Periodico");
                System.out.println("3.-Libro");            
                System.out.println("Elige: ");
                try{
                    tip= sc.nextInt();
                }catch(Exception e){
                    sc.next();
                    System.out.println("Opcion no valida");
                }
                
                if(tip==1){
                    System.out.println("-----ALTA REVISTAS------");
                     alta.AltaRevista(revistas);
                }               
                if(tip==2){              
                    System.out.println("------ALTA PERIODICOS------");
                    alta.AltaPeriodico(periodicos);
                }           
                if(tip==3){
                    System.out.println("------Alta Libros-------");
                    alta.AltaLibro(libros);
                }
            }while(tip<1 || tip>3);
        }
        
        public static void mostrar()
        {
            AltasImpresion imp = new AltasImpresion();
            int tip=0;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("\nTipo");
                System.out.println("1.-Revista");
                System.out.println("2.-Periodico");
                System.out.println("3.-Libro");            
                System.out.println("Elige: ");
                try{
                    tip= sc.nextInt();
                }catch(Exception e){
                    sc.next();
                    System.out.println("Opcion no valida");
                }
                
                if(tip==1){
                    System.out.println("------REVISTAS------");
                    imp.ImprimirRevista(revistas);
                }               
                if(tip==2){
                    System.out.println("------Periodicos------");
                    imp.ImprimirPeriodico(periodicos);
                }           
                if(tip==3){
                    System.out.println("Impresion Libros");
                    imp.ImprimirLibro(libros);
                }
            }while(tip<1 || tip>3);
        }
}