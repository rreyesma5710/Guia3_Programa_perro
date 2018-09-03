package paquete;

public class Perro {
	
	//Variables miembro
	String nombre;
	String raza;
	String localidad;
	int cedula;
	String nombreDueno;
	int contacto;
	String diaSemana;

	//constructores
	public Perro(String nombre, String raza, String localidad, int cedula,
			String nombreDueno, int contacto, String diaSemana) {
		this.nombre = nombre;
		this.raza = raza;
		this.localidad = localidad;
		this.cedula = cedula;
		this.nombreDueno = nombreDueno;
		this.contacto = contacto;
		this.diaSemana = diaSemana;
	}
	
	public Perro() {
		nombre = "";
		raza = "";
		localidad = "";
		cedula = 0;
		nombreDueno = "";
		contacto = 0;
		diaSemana = "";
	}
	
	//funciones miembro 

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getNombreDueno() {
		return nombreDueno;
	}
	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}
	public int getContacto() {
		return contacto;
	}

	public void setContacto(int contacto) {
		this.contacto = contacto;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	public String toString() {
		return "nombre: " + nombre + "\n"
				+ "raza: " + raza+ "\n"
				+ "localidad: "+ localidad + "\n"
				+ "cedula: " + cedula+ "\n"
				+ "nombre del dueño: "+ nombreDueno + "\n"
				+ "contacto: "+ contacto + "\n"
				+ "Dia de la semana: "+ diaSemana + "\n";
	}
	

}
