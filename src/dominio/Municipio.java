package dominio;
import java.util.*;



public class Municipio{
	private String nombreMunicipio;

	private Arraylist <Localidad> localidades = new Arraylist<>();
	public Municipio (String nombre.){
		this.nombre = nombre;}

	public Municipio add localidad (localidad L){
		localidades.add(L);
		return this;
		}
	public String toString (){
		String cad = "localidad: " + nombre + " municipios: \n";
		for (Localidad L: localidades)
		cad+= (L + "\n");
		return cad;

	}
        
	public int getPoblacion(){
		int total =0;
		for (Localidad L : localidades)
                total +=L.getPoblacion();
		return total;
	}

