package dominio;
import java.util.ArrayList;
import java.io.Serializable;

public class Municipio implements Serializable {
    
    private int numeroDeHabitantes;
    private String nombreMunicipio;
    static ArrayList <Localidad> localidades = new ArrayList<>();
    public int contarHabitantesMunicipio(){
        this.numeroDeHabitantes = 0;
        for(Localidad localidad : localidades ){
            this.numeroDeHabitantes += localidad.getNumeroDeHabitantes();
        }
        return this.numeroDeHabitantes;
    }
    public String getNombre(){
        return this.nombreMunicipio;
    }
    public void addLocalidad(Localidad local){
        localidades.add(local);
    }
    public String toString(){
        String result = "El municipio de " + this.nombreMunicipio + " esta compuesto por: ";
        for(Localidad localidad : localidades) {
            result += (localidad.getNombre());
            if(localidades.indexOf(localidad) == localidades.size()-2){
                result += " y ";
            }
            else if(localidades.indexOf(localidad) == localidades.size()-1){
                ;
            }
            else{result += (", ");}
        } 
        result += " y tiene " + this.contarHabitantesMunicipio() + " habitantes";
        return result;
    } 
    public Municipio(String nombre){
        this.nombreMunicipio = nombre;
        //localidades.add(loc1);
        //localidades.add(loc2);
        this.numeroDeHabitantes = contarHabitantesMunicipio();
    }
}