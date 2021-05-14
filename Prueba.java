//20- Crea una instancia de un objeto de la clase Carro, Persona, Dirección, Marca y enumera los objetos usando los métodos o constructores cuando sea necesario.
public class Prueba {

	public static void main(String[] args) {
		Direccion direccion = new Direccion("Av. Central", "Villa de las Flores", "Coacalco", "Edo. Mex", "05510");
		Marca marca = new Marca("Ford", 20, 2020, "A12042048");
		Propietario propietario = new Propietario("Juan Perez", "PELJ700101HDFNZ02", 50, direccion);
		Carro carro = new Carro("Joy", "plata", 2020, marca, "S-144575831482546", propietario, 160, 0, 4, false, 5, 0, false, 50);
		
		carro.cambioNumeroVelocidad();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.frenar();
		carro.reduceNumeroVelocidad();
		carro.autonomiaViaje(12);
		carro.cambioNumeroVelocidad();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.cambioNumeroVelocidad();
		carro.acelerar();
		carro.acelerar();
		carro.cambioNumeroVelocidad();
	}//main

}//class Prueba
