public class Propietario {
	private String nombre;
	private String CURP; 
	private int edad;
	private String fechaNacimiento; 
	private String calle;
	private String colonia;
	private String ciudad;
	private String estado; 
	private String CP; // Se utiliza String porque existen códigos postales que inician con cero
	private String complemento;

	public Propietario(String nombre, String CURP, int edad) {
		this.nombre = nombre;
		this.CURP = CURP;
		this.edad = edad;
	}// constructor

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public String getCURP() {
		return CURP;
	}//getCURP

	public void setCURP(String cURP) {
		CURP = cURP;
	}//setCURP

	public int getEdad() {
		return edad;
	}//getEdad

	public void setEdad(int edad) {
		this.edad = edad;
	}//setEdad

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}//getFechaNacimiento

	public void setFechaNacimiento(String fecha_de_Nacimiento) {
		this.fechaNacimiento = fecha_de_Nacimiento;
	}// setFecha_de_Nacimiento

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

	public String getComplemento() {
		return complemento;
	}//getComplemento

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}//setComplemento
		
}//class Propietario
