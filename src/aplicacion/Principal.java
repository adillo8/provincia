package aplicacion;
import dominio.*;
import presentacion.Interfaz;
public class Principal {
    public static void main(String[] args) {
        Localidad local1 = new Localidad("San Vicente ", 2);
        Localidad local2 = new Localidad("Puerto Rico", 3);
        Municipio madrid = new Municipio("Madrid");
        System.out.println(local1.toString());
        System.out.println(local2.toString());    
        System.out.println(madrid.toString());
    }
}
 
//ArrayList<Provincia> provincias =new ArrayList<Provincia>();
//String peticion;
//Interfaz.procesarPeticion("help",1);//para que mueste la ayuda al principio
//do{
//    peticion=Interfaz.leerPeticion();
// }while(Interfaz.procesarPeticion(peticion,1));