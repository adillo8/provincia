package presentacion;
import dominio.*;
import java.util.*;
import java.io.*;

public class Interfaz 
{
    public ArrayList <Provincia> provincias= new ArrayList <>();
    public Interfaz(){
        ObjectInputStream obj ;
        File f =new File ("Provincias.txt");
        try {
            obj=new ObjectInputStream(new FileInputStream(f));
            provincias=(ArrayList<Provincia>) obj.readObject();
        } catch (Exception e) {
            provincias=new ArrayList<Provincia>();
        }
    }
    
    public ArrayList <Provincia> leer ()
    {
        Scanner sc = new Scanner (System.in);
        String nomProvincia;
        do
        {
            System.out.print ("Introduzca el nombre de la provincia(enter para finalizar): ");
            nomProvincia =sc.nextLine(); 
            if (nomProvincia!="")
            {
                Provincia p = new Provincia (nomProvincia);
                do
                {
                    System.out.print ("Introduzca el nombre del municipio (enter para finalizar): ");
                    String nomMunicipio =sc.nextLine(); 
                    Municipio m =new Municipio(nomMunicipio);
                    p.addMunicipio (m);
                    String nomLocalidad;
                    Localidad l;
                    do{
                        System.out.print ("Introduzca el nombre de la localidad  (enter para finalizar): ");
                        nomLocalidad =sc.nextLine(); 
                        System.out.println("Introduzca el numero de habitantes ");
                        String input_habitantes=sc.nextLine();
                        int numeroDeHabitantes=0;
                        if(input_habitantes!=" "){
                            try{
                                numeroDeHabitantes=Integer.parseInt(input_habitantes);
                            }catch(Exception e){
                                System.out.print ("Valor introducido incorrecto");

                            }
                        }
                        l =new Localidad(nomLocalidad,numeroDeHabitantes);
                        m.addLocalidad (l);
                    }while(nomLocalidad != "");
                        provincias.add(p);
                
                }while(nomProvincia != "");
            }//if (nomProvincias!="")
        }
        while (nomProvincia!="");
        sc.close();
        return provincias;
        }
        public void insertarProvincia(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Defina el nombre de la provincia");
        String nombre =sc.nextLine();
        if (nombre!=""){
            Provincia p =new Provincia(nombre);
            provincias.add(p);
        }
        else {
            System.out.println("el valor introducido no es valido");
        }
        sc.close();
        }
        public void insertarMunicipio(){
        Scanner sc =new Scanner (System.in);
        System.out.println("A que provincia peretenece el Municipio");
        String nombre =sc.nextLine();
        Municipio m = new Municipio(nombre);
        Provincia p = new Provincia(nombre);
        int indice = provincias.indexOf(p);
        if (indice!=-1){
            provincias.get(indice).addMunicipio(m);
        }
        else {
            System.out.println("La provincia no existe");
        }
        sc.close();
        }
        
        public void insertarLocalidad(){
        Scanner sc =new Scanner (System.in);
        System.out.println("A que municipio pertenece la localidad");
        String nombreLocalidad = sc.nextLine();
        System.out.println("dime el nombre de la localidad: ");
        String nombreMunicipio=sc.nextLine();
        System.out.println("dime el numero de habitantes");
        String input_habitantes=sc.nextLine();
        int numeroDeHabitantes=0;
        if (input_habitantes!=""){
            try{
                numeroDeHabitantes=Integer.parseInt((input_habitantes));
            }catch(Exception e){
                System.out.println("Valor introducido incorrecto");
            }
        }
        Localidad l =new Localidad(nombreMunicipio, numeroDeHabitantes);
        Municipio m =new Municipio(nombreMunicipio);
                                                
        sc.close();

        }
    }

