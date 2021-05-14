public class Direccion {
	private String calle;
	private String colonia;
	private String ciudad;
	private String estado; 
	private String CP;

	public Direccion(String calle, String colonia, String ciudad, String estado, String CP) {
		this.calle = calle;
		this.colonia = colonia;
		this.ciudad = ciudad;
		this.estado = estado;
		this.CP = CP;
	}// constructor
	
	public String getCalle() {
		return calle;
	}//getCalle

	public void setCalle(String calle) {
		this.calle = calle;
	}//setCalle

	public String getColonia() {
		return colonia;
	}//getColonia

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}//setColonia

	public String getCiudad() {
		return ciudad;
	}//getCiudad

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}//setCiudad

	public String getEstado() {
		return estado;
	}//getEstado

	public void setEstado(String estado) {
		this.estado = estado;
	}//setEstado

	public String getCP() {
		return CP;
	}//getCP

	public void setCP(String CP) {
		this.CP = CP;
	}//setCP
	
}//class Direccion
