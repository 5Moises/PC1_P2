
public class Client implements Persona{
private String Nombre;
private String Direccion;
private String Tipo_Cliente;
public Client()
{
	
}
public Client(String nombre, String direccion, String tipo_Cliente) {
	super();
	Nombre = nombre;
	Direccion = direccion;
	Tipo_Cliente = tipo_Cliente;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getDireccion() {
	return Direccion;
}
public void setDireccion(String direccion) {
	Direccion = direccion;
}
public String getTipo_Cliente() {
	return Tipo_Cliente;
}
public void setTipo_Cliente(String tipo_Cliente) {
	Tipo_Cliente = tipo_Cliente;
}
@Override
public void Solicitar() 
{
	
	
}
@Override
public void retiro() 
{
	
	
}

}
