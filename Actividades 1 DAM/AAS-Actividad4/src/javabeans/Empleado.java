package javabeans;

public class Empleado {

	/*
	 * Empezamos definiendo los datos privados
	 * solo se definen los datos, ni valor ni nada
	 * El valor los toma en los metodos constructores
	 */
	
	private int idEmpleado;
	private String nombre, apellidos, email;
	private double salario;
	private double complemento;
	private char sexo;
	private int idDepartamento;
	
	//constructor por defecto sin nada, es obligatorio
	
	public Empleado() {
				
	}
		
	//constructor con todos los parametros
	
	public Empleado(int idEmpleado, String nombre, String apellidos, String email, double salario, double complemento,
			char sexo, int idDepartamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.salario = salario;
		this.complemento = complemento;
		this.sexo = sexo;
		this.idDepartamento = idDepartamento;
	}

	//getters y setters
	
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
	public double getComplemento() {
		return complemento;
	}
	public void setComplemento(double complemento) {
		this.complemento = complemento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	
	
	//para ver el contenido toString
	
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email="
				+ email + ", salario=" + salario + ", complemento=" + complemento + ", sexo=" + sexo
				+ ", idDepartamento=" + idDepartamento + "]";
	}
	
	
	//metodos responsabilidad de los atributos de instancia de la clase
	
	public double salarioBruto() {
		double salarioBruto = salario + complemento;
		return salarioBruto;
	}
	
	public double salarioMensual(int meses) {
		double salarioMensual = salario / meses;
		return salarioMensual;
	}
	
	public String literalSexo() {
		if (sexo == 'H'|| sexo == 'h' )
			return "Hombre";
		if (sexo == 'M'|| sexo == 'm' )
			return "Mujer";
		else
			return "Sexo erroneo";
	}
	
	public String obtenerEmail() {
		
		char primeraLetraNom = nombre.charAt(0);
		String apellidoEmail ="";
		int contadorEspacio = 0;
		/*
		 * Con un bucle for para ver donde está el primer estacio y cojo el primer apellido
		 * desde la posición 0 hasta la posicion del espacio
		 */
		
		for(int i=0; i<apellidos.length(); i++) {
			char obtenerPrimeraLetraAp = apellidos.charAt(i);
			if (obtenerPrimeraLetraAp == ' ')
				contadorEspacio = i;		
		}
		apellidoEmail = apellidos.substring(0, contadorEspacio);
		String dominioEmail = "@empleados.edix.com";
		String obtenerEmail = primeraLetraNom + apellidoEmail + dominioEmail;
		
		return obtenerEmail.toLowerCase();
	}
	
	public String nombreCompleto() {
		String nombreCompleto = nombre + " " + apellidos;
		return nombreCompleto;
	}
		
	
}
