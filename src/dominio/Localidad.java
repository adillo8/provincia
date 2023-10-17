package dominio;
public class Localidad{
	private String nombre;
	private String numeroDeHabitantes;

	public void setNombre(String nombre)
	{
		this.nombre = nombre;}
	public void setNumeroDeHabintantes(String NumeroDeHabitantes)
        {
                this.numeroDeHabitantes = numeroDeHabitantes;}

	public String getNombre()
	{return nombre;}
    	public int getNumeroDeHabitantes ()
    	{return numeroDeHabitantes;}

	public String toString{
		String result =  ( "la localidad llamada " + this.nombre + "con " + this.numeroDeHabitantes + "habitantes");
		return result;
    }
    
}
