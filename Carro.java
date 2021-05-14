
public class Carro {

	private String modelo;
	private String color;
	private int year;
	private Marca marca; 
	private String numeroSerie;
	private Propietario propietario;
	private int velocidadMaxima; // Kilómetros por hora
	private int velocidadActual; // Kilómetros por hora
	private int numeroPuertas;	
	private boolean techoSolar;
	private int numeroVelocidades; // Número total de velocidades
	private int numeroVelocidadActual; // Número actual de velocidad
	private boolean automatico;
	private int capacidadCombustible; // litros

	public String autonomiaViaje(double kilometros) {
		return  String.format("%,.2f", capacidadCombustible/kilometros);
	}// autonomiaViaje
	
		
	//Método reduce la marcha
	public void reduceNumeroVelocidad() {
		if ((numeroVelocidadActual>0)) {
			numeroVelocidadActual--;
			System.out.println("reduce Velocidad -> " + numeroVelocidadActual);
		} else if ((numeroVelocidadActual==0) && (velocidadActual==0)){
			System.out.println("reduce Velocidad -> " + numeroVelocidadActual + " (reversa)");
		} else {
			System.out.println("No es posible bajar la cambiar la velocidad");	
		}//else // if >0
	}// reduce
	
	//Método de cambio de velocidades;
	public void cambioNumeroVelocidad() {
		if (numeroVelocidadActual<numeroVelocidades) {
			numeroVelocidadActual++;
		}// if <
		System.out.println("Cambio de Velocidad -> " + numeroVelocidadActual);
	}//cambioVelocidad

	//Método de freno para el automóvil - Velocidad = 0 km / h;
	public void frenar() {
		velocidadActual=0;
		System.out.println("Velocidad Actual: " + velocidadActual);
	}// frenar
	
	//Método de aceleración que aumenta la velocidad de 1 a 1 km/h
	public void acelerar() {
		if(velocidadActual<velocidadMaxima) {
			velocidadActual++;	
		}// Actual < Maxima
		System.out.println("Velocidad Actual: " + velocidadActual);
	}// acelerar
	
	public Carro(String modelo, String color, int year, Marca marca, String numeroSerie, Propietario propietario,
			int velocidadMaxima, int velocidadActual, int numeroPuertas, boolean techoSolar, int numeroVelocidades,
			int numeroVelocidadActual, boolean automatico, int capacidadCombustible) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.year = year;
		this.marca = marca;
		this.numeroSerie = numeroSerie;
		this.propietario = propietario;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = velocidadActual;
		this.numeroPuertas = numeroPuertas;
		this.techoSolar = techoSolar;
		this.numeroVelocidades = numeroVelocidades;
		this.numeroVelocidadActual = numeroVelocidadActual;
		this.automatico = automatico;
		this.capacidadCombustible = capacidadCombustible;
	}//Constructor

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
	public Marca getMarca() {
		return marca;
	}//getMarca
	public void setMarca(Marca marca) {
		this.marca = marca;
	}//setMarca
	public String getNumeroSerie() {
		return numeroSerie;
	}//getNumero_de_serie
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}//setNumero_de_serie
	public Propietario getPropietario() {
		return propietario;
	}//getPropietario
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}//setPropietario
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
	public int getNumeroVelocidadActual() {
		return numeroVelocidadActual;
	}//getNumeroVelocidadActual
	public void setNumeroVelocidadActual(int numeroVelocidadActual) {
		this.numeroVelocidadActual = numeroVelocidadActual;
	}//setNumeroVelocidadActual
	public boolean isAutomatico() {
		return automatico;
	}//isAutomatico
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}//setAutomatico

	///Método para mostrar el volumen de combustible
	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}// getCapacidadCombustible
	public void setCapacidadCombustible(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}// setCapacidadCombustible
	
} //class Carro
