
public class Marca {
	private String nombre; 
	private int numeroModelos;
	private int yearLanzamiento;
	private String codigoIdentificacion;

	public Marca(String nombre, int numeroModelos, int yearLanzamiento, String codigoIdentificacion) {
		super();
		this.nombre = nombre;
		this.numeroModelos = numeroModelos;
		this.yearLanzamiento = yearLanzamiento;
		this.codigoIdentificacion = codigoIdentificacion;
	}// constructor
	
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public int getNumeroModelos() {
		return numeroModelos;
	}//getNumeroModelos
	public void setNumeroModelos(int numeroModelos) {
		this.numeroModelos = numeroModelos;
	}//setNumeroModelos
	public int getYearLanzamiento() {
		return yearLanzamiento;
	}//getYearLanzamiento
	public void setYearLanzamiento(int yearLanzamiento) {
		this.yearLanzamiento = yearLanzamiento;
	}//setYearLanzamiento
	public String getCodigoIdentificacion() {
		return codigoIdentificacion;
	}//getCodigoIdentificacion
	public void setCodigoIdentificacion(String codigoIdentificacion) {
		this.codigoIdentificacion = codigoIdentificacion;
	}//setCodigoIdentificacion

	@Override
	public String toString() {
		return  "======================================================================================================\n"
				+ "Marca [Nombre=" + nombre + ", Número de Modelos=" + numeroModelos + ", Año de Lanzamiento=" + yearLanzamiento
				+ ", Codigo de Identificación=" + codigoIdentificacion + "]";
	} // toString
	

}//class Marca
