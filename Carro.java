public class Carro {
	private String modelo;
	private String color;
	private int year;
	private String marca;
	private String numeroSerie;
	private Propietario propietario;
	private int velocidadMaxima;
	private int velocidadActual;
	private int numeroPuertas;	
	private boolean techoSolar;
	private int numeroVelocidades;
	private boolean automatico;
	private int capacidadCombustible;

	//Método reduce la marcha
	public void reduce() {
		System.out.println("reduce Velocidad");
	}// reduce
	
	//Método de cambio de velocidades;
	public void cambioVelocidad() {
		System.out.println("cambio de Velocidad");
	}//cambioVelocidad

	//Método de freno para el automóvil - Velocidad = 0 km / h;
	public void frenar() {
		velocidadActual=0;
		System.out.println("Velocidad Actual: " + velocidadActual);
	}// frenar
	
	//Método de aceleración que aumenta la velocidad de 1 a 1 km/h
	public void acelerar() {
		velocidadActual++;
		System.out.println("Velocidad Actual: " + velocidadActual);
	}// acelerar
	
	public String getModelo() {
		return modelo;
	}//getModelo
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}//setModelo
	public String getColor() {
		return color;
	}//getColor
	public void setColor(String color) {
		this.color = color;
	}//setColor
	public int getYear() {
		return year;
	}//getYear
	public void setYear(int year) {
		this.year = year;
	}//setYear
	public String getMarca() {
		return marca;
	}//getMarca
	public void setMarca(String marca) {
		this.marca = marca;
	}//setMarca
	public String getNumeroSerie() {
		return numeroSerie;
	}//getNumero_de_serie
	public void setNumero_de_serie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}//setNumero_de_serie
	public Propietario getPropietario() {
		return propietario;
	}//getDueno
	public void setpropietario(Propietario propietario) {
		this.propietario = propietario;
	}//setDueno
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}//getVelocidad_maxima
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}//setVelocidad_maxima
	public int getVelocidadActual() {
		return velocidadActual;
	}//getVelocidad_actual
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}//setVelocidad_actual
	public int getNumeroPuertas() {
		return numeroPuertas;
	}//getNumero_de_puertas
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}//setNumero_de_puertas
	public boolean isTechoSolar() {
		return techoSolar;
	}//isTecho_solar
	public void setTechoSolar(boolean techoSolar) {
		this.techoSolar = techoSolar;
	}//setTechoSolar
	public int getNumeroVelocidades() {
		return numeroVelocidades;
	}// getNumeroVelocidades
	public void setNumeroVelocidades(int numeroVelocidades) {
		this.numeroVelocidades= numeroVelocidades;
	}//setNumeroVelocidades
	public boolean isAutomatico() {
		return automatico;
	}//isAutomatico
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}//setAutomatico
	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}// getCapacidadCombustible
	public void setCapacidadCombustible(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}// setCapacidadCombustible
	
} //class Carro
