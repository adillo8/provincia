package dominio;
import java.util.*;
import java.io.Serializable;

public class Provincia implements Serializable{
    private int numeroDeHabitantes;
	private String nombreProvincia;

    private ArrayList <Municipio> Municipios = new ArrayList<>();
	public Provincia (String nombre){
		this.nombreProvincia = nombreProvincia;}

	public Provincia addMunicipio (Municipio l){
		Municipios.add(l);
		return this;
		}
	public String toString (){
		String cad = "Provincia: " + nombreProvincia + " municipios: \n";
		for (Municipio l: Municipios)
		cad+= (l + "\n");
		return cad;
       }
        
	public int getcontarHabitantesMunicipio(){
		int total =0;
		for (Municipio l : Municipios)
                total +=l.contarHabitantesMunicipio();
		return total;
	}
}




    