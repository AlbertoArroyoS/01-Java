package modelo.javabean;

import java.util.Objects;

/**
 * Entidad empleado, con un id de empleado, nombre, apellidos, genero, email personal, salario,
 * comision, un objeto de tipo Trabajo y un objeto de tipo Departamento.
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 *
 */

public class Empleado {
	
	/*
	 * Atributos privados
	 */
	
	private int idEmpleado;
	private String nombre, apellidos;
	private char genero;
	private String email;
	private double salario;
	private double comision;
	private Trabajo trabajo;
	private Departamento departamento;
	
	/*
	 * Constructures
	 */
	
	public Empleado(int idEmpleado, String nombre, String apellidos, char genero, String email, double salario,
			double comision, Trabajo trabajo, Departamento departamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.email = email;
		this.salario = salario;
		this.comision = comision;
		this.trabajo = trabajo;
		this.departamento = departamento;
	}

	public Empleado() {
		super();
	}
	
	/*
	 * Getter and setter
	 */

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	/*
	 * Metodos reescritos de Object
	 */

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", genero="
				+ genero + ", email=" + email + ", salario=" + salario + ", comision=" + comision + ", trabajo="
				+ trabajo + ", departamento=" + departamento + "]";
	}
	


	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}
	
	/*
	 * Metodos responsabilidad de los atributos de instancia de la clase
	 */
	
	// Metodo para obtener el salario bruto que es el salario + la comision
	
	public double salarioBruto() {
			double salarioBruto = salario + comision;
			return salarioBruto;
	}
	
	// Metodo para obtener el email corporativo de la empresa con la primera letra del nombre y su primer apellido
	
	public String obtenerEmail() {
		
		char primeraLetraNom = nombre.charAt(0);
		String apellidoEmail ="";
		int contadorEspacio = 0;
		/*
		 * Con un bucle for para ver donde está el primer espacio y cojo el primer apellido
		 * desde la posición 0 hasta la posicion del espacio
		 */
		
		for(int i=0; i<apellidos.length(); i++) {
			char obtenerPrimeraLetraAp = apellidos.charAt(i);
			if (obtenerPrimeraLetraAp == ' ')
				contadorEspacio = i;
			//en caso de que sólo sea un apellido y no contenga espacios
			if(contadorEspacio == 0)
				contadorEspacio = apellidos.length();
		}
		apellidoEmail = apellidos.substring(0, contadorEspacio);
		String dominioEmail = "@empleados.edix.com";
		String obtenerEmail = primeraLetraNom + apellidoEmail + dominioEmail;
		
		return obtenerEmail.toLowerCase();
	}
	
	// Metodo para obtener el nombre completo del empleado
	
	public String nombreCompleto() {
		String nombreCompleto = nombre + " " + apellidos;
		return nombreCompleto;
	}
	
	// Metodo para obtener el salario mensual del empleado
	
	public double salarioMensual(int meses) {
		double salarioMensual = salario / meses;
		return salarioMensual;
	}
	
	// Metodo para obtener el literal del genero
	
	public String literalSexo() {
		if (genero == 'H'|| genero == 'h' )
			return "Hombre";
		if (genero == 'M'|| genero == 'm' )
			return "Mujer";
		else
			return "Sexo erroneo";
	}

}
