package mvc;
public class Usuario {
	String nombre;
	String contraseña;
	public Usuario(String nombre,String contraseña) {
		this.nombre=nombre;
		this.contraseña=contraseña;
	}
	public String getNombre() {
		return nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	
}
