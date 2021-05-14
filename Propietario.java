public class Propietario {
	private String nombre;
	private String CURP; 
	private int edad;
	private String fechaNacimiento; 
	private Direccion direccion;
	private String complemento;

	public Propietario(String nombre, String CURP, int edad, Direccion direccion) {
		this.nombre = nombre;
		this.CURP = CURP;
		this.edad = edad;
		this.direccion = direccion;
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

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}// setFecha_de_Nacimiento
	
	public Direccion getDireccion() {
		return direccion;
	}// getDireccion

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}// setDireccion

	public String getComplemento() {
		return complemento;
	}//getComplemento

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}//setComplemento
		
}//class Propietario
